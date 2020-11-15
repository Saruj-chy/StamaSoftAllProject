package com.wahid.sir.stamasofttechnologyallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    private ImageView mProfileImage ;
    private TextView mIdText, mNameText, mStatusText ;

    private int id;
    private String name;
    private String image ;
    private String  type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mProfileImage = findViewById(R.id.profile_image);
        mIdText = findViewById(R.id.text_id);
        mNameText = findViewById(R.id.text_name);
        mStatusText = findViewById(R.id.text_status);

        Intent intent = getIntent();
        id = intent.getExtras().getInt("id");
        name = intent.getExtras().getString("name");

        image = intent.getExtras().getString("image");
        type = intent.getExtras().getString("type");
        switch (type){
            case "country":

                String status = intent.getExtras().getString("country");
                mStatusText.setText("Status: "+status);
                break;
            case "phone":
                int status1 = intent.getExtras().getInt("phone");
                mStatusText.setText("Phone No.: "+status1);
                break;
            case "price":
                double status3 = intent.getExtras().getDouble("price");
                mStatusText.setText("Price: "+status3);
                break;

        }




        Glide.with(getApplicationContext())
                .load(image)
                .into(mProfileImage);

        mIdText.setText("ID: "+id);
        mNameText.setText("Name: "+name);



    }
}