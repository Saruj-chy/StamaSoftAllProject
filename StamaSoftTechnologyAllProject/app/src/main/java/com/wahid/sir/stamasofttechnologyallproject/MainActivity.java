package com.wahid.sir.stamasofttechnologyallproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {

    Button mPhnBtn, mCountryBtn, mLocationBtn  ;

    //=====  location
    Location currentLocation;
    FusedLocationProviderClient fusedLocationProviderClient;
    private static final int REQUEST_CODE = 101;
    double latitude=0, longitude=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPhnBtn = findViewById(R.id.phone_btn);
        mCountryBtn = findViewById(R.id.country_btn);
        mLocationBtn = findViewById(R.id.location_btn);

        mPhnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FilterViewPhoneActivity.class);
                startActivity(i);
            }
        });

        mCountryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FilterViewCountryActivity.class);
                startActivity(i);
            }
        });

        //====    location user
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        mLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "latitude: "+latitude+ "longitude: "+longitude, Toast.LENGTH_LONG).show();

                GetLocation();
            }
        });
    }




    private void GetLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_CODE);
            return;
        }

        Task<Location> task = fusedLocationProviderClient.getLastLocation();
        task.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location  != null){
                    currentLocation = location;
//                    setDatabaseStorage(currentLocation.getLatitude(), currentLocation.getLongitude(),onlineState);
                    Log.e("TAG", "getLatitude: "+currentLocation.getLatitude()+" getLongitude: "+currentLocation.getLongitude() ) ;

                    latitude = currentLocation.getLatitude() ;
                    longitude = currentLocation.getLongitude() ;

                    Toast.makeText(getApplicationContext(), "  latitude:  "+currentLocation.getLatitude()+"\n longitude: "+
                            currentLocation.getLongitude(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}