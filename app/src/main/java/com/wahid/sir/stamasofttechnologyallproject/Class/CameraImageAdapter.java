package com.wahid.sir.stamasofttechnologyallproject.Class;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;
import com.wahid.sir.stamasofttechnologyallproject.R;

import java.util.List;

public class CameraImageAdapter extends RecyclerView.Adapter<CameraImageAdapter.PostViewHolder> {
    private Context mCtx;
    private List<String> mRealImgtList ;



    public CameraImageAdapter(Context mCtx, List<String> mRealImgtList) {
        this.mCtx = mCtx;
        this.mRealImgtList = mRealImgtList;
    }

    @Override
    public CameraImageAdapter.PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.nested_post_image, null);
        return new CameraImageAdapter.PostViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final CameraImageAdapter.PostViewHolder holder, final int position) {
        final String mImgRealList = mRealImgtList.get(position);

        ((CameraImageAdapter.PostViewHolder) holder).bind(mImgRealList);

    }

    @Override
    public int getItemCount() {
        return mRealImgtList.size();
    }


    class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        private AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(mCtx);
        private AlertDialog dialog;

        public PostViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.nested_imageView);
        }

        public void bind( String realImgUrl){

            Log.e("image_tag", " realImgUrl: "+realImgUrl+"||" ) ;
            if(!realImgUrl.isEmpty()){
                Picasso.get().load(realImgUrl)
                        .placeholder(R.drawable.profile_image)
                        .into(imageView);
            }


        }

    }
}