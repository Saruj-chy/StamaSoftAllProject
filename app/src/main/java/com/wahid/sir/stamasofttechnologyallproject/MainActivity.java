package com.wahid.sir.stamasofttechnologyallproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.GridLayoutManager;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.wahid.sir.stamasofttechnologyallproject.Activity.FilterPriceActivity;
import com.wahid.sir.stamasofttechnologyallproject.Activity.FilterViewCountryActivity;
import com.wahid.sir.stamasofttechnologyallproject.Activity.FilterViewPhoneActivity;
import com.wahid.sir.stamasofttechnologyallproject.Activity.LoadMoreDataActivity;
import com.wahid.sir.stamasofttechnologyallproject.Activity.LoginActivity;
import com.wahid.sir.stamasofttechnologyallproject.Activity.MoreDataDatabaseActivity;
import com.wahid.sir.stamasofttechnologyallproject.Activity.RegistrationActivity;
import com.wahid.sir.stamasofttechnologyallproject.Adapter.PriceFilterAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Class.Config;
import com.wahid.sir.stamasofttechnologyallproject.Class.Country;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button mPhnBtn, mCountryBtn, mLocationBtn, mPriceBtn, mMoreDatabaseBtn, mMoreDataBtn, mEmailSentBtn, mSmsGatewayBtn  ;

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
        mPriceBtn = findViewById(R.id.price_btn);
        mMoreDataBtn = findViewById(R.id.more_data_btn);
        mMoreDatabaseBtn = findViewById(R.id.more_data_database_btn);
        mLocationBtn = findViewById(R.id.location_btn);
        mEmailSentBtn = findViewById(R.id.email_sent_btn);
        mSmsGatewayBtn = findViewById(R.id.sms_gateway_btn);

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

        mPriceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FilterPriceActivity.class);
                startActivity(i);
            }
        });

        mMoreDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LoadMoreDataActivity.class);
                startActivity(i);
            }
        });
        mMoreDatabaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MoreDataDatabaseActivity.class);
                startActivity(i);
            }
        });

        mEmailSentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
//                loadProducts();
                Log.i("Send email", "");

            }
        });

        mSmsGatewayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(i);
//                loadProducts();
                Log.i("Send email", "");

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
    private void loadProducts() {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, Config.MAIL_SENT_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity.this, response, Toast.LENGTH_SHORT).show();

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("serverResponse", "error: "+error.toString() );
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                String email = "durjoy.chy222@gmail.com" ;
                Map<String, String> parameters = new HashMap<String, String>();
                parameters.put("email", email);
                return parameters;
            }

        };

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }


}