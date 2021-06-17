package com.wahid.sir.stamasofttechnologyallproject.Activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wahid.sir.stamasofttechnologyallproject.Class.CameraImageAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Class.ImageReSizer;
import com.wahid.sir.stamasofttechnologyallproject.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CameraImageActivity extends AppCompatActivity {

    private ArrayList<Uri> ImageList = new ArrayList<Uri>();
    private ArrayList<byte[]> mThumbListByte = new ArrayList<byte[]>();
    private ArrayList<byte[]> mRealListByte = new ArrayList<byte[]>();

    private Uri imageuri;
    byte[] mThumbByteData, mRealByteData;

    private RecyclerView mCameraImageRV ;

    //TODO:: mStartForResult
    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Log.e("result", "result: " + result);
                    ImageList.clear();
                    mRealListByte.clear();
                    mThumbListByte.clear();

                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();

                        if (data.getData() == null && data.getClipData() == null) {
                            Bundle extras = data.getExtras();
                            Bitmap imageBitmap = (Bitmap) extras.get("data");
                            imageuri = getImageUri(imageBitmap);
                            getImageUriResult(imageuri);
                        }
                        else if (data.getData() != null && data.getClipData() == null) {
                            imageuri = data.getData();
                            getImageUriResult(imageuri);
                        }
                        else if (data.getClipData() != null && data.getData() == null){
                            int count = data.getClipData().getItemCount();
                            int CurrentImageSelect = 0;
                            while (CurrentImageSelect < count) {
                                imageuri = data.getClipData().getItemAt(CurrentImageSelect).getUri();
                                getImageUriResult(imageuri);

                                CurrentImageSelect = CurrentImageSelect + 1;
                            }
                        }



                        Log.e("imageuri", "imageuri:  "+  imageuri ) ;


                        dialogViewAdapter(ImageList) ;

                    }

                }
            });

    private void dialogViewAdapter(ArrayList<Uri> ImageList) {
        List<String> selectImages = new ArrayList<>();
        for (int i = 0; i < ImageList.size(); i++) {
            selectImages.add(ImageList.get(i)+"");
        }

        CameraImageAdapter productAdapter = new CameraImageAdapter(getApplicationContext(), selectImages);
        mCameraImageRV.setAdapter(productAdapter);
        GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.HORIZONTAL, false);
        mCameraImageRV.setLayoutManager(manager);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_image);


        mCameraImageRV = findViewById(R.id.recycler_camera_image) ;
    }



    public void onSelectGalleryImage(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        intent.setAction(Intent.ACTION_GET_CONTENT);
        mStartForResult.launch(intent);
    }
    //TODO:: onSelectCameraClick
    public void onSelectCameraClick(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ActivityCompat.checkSelfPermission(getApplicationContext(),
                    android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {

                requestPermissions(new String[]{Manifest.permission.CAMERA},
                        1); // Invokes onRequestPermissionsResult()

                return;
            }
        }

        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        mStartForResult.launch(takePictureIntent);
    }

    private void getImageUriResult(Uri imageuri) {
        ImageList.add(imageuri);

        Bitmap bitmapSrc = null;
        try {
            bitmapSrc = MediaStore.Images.Media.getBitmap(CameraImageActivity.this.getContentResolver(), imageuri);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //===============   Real size image
        Bitmap RealSizeBitmap = ImageReSizer.reduceBitmapSize(bitmapSrc, 360000);
        ByteArrayOutputStream realByteBaos = new ByteArrayOutputStream();
        RealSizeBitmap.compress(Bitmap.CompressFormat.JPEG, 100, realByteBaos);
        mRealByteData = realByteBaos.toByteArray();
        mRealListByte.add(mRealByteData);


        //========  Thumbonil Image
        Bitmap thumbSizeBitmap = ImageReSizer.generateThumb(bitmapSrc, 6500);
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        thumbSizeBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos2);
        mThumbByteData = baos2.toByteArray();
        mThumbListByte.add(mThumbByteData);
    }

    public Uri getImageUri(Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}