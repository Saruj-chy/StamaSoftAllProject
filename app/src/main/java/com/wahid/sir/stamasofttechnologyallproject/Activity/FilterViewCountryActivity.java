package com.wahid.sir.stamasofttechnologyallproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.wahid.sir.stamasofttechnologyallproject.Adapter.CountryFilterAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Class.Config;
import com.wahid.sir.stamasofttechnologyallproject.Class.Country;
import com.wahid.sir.stamasofttechnologyallproject.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FilterViewCountryActivity extends AppCompatActivity {


    private EditText mFilterEdit ;
    private RecyclerView mRecyclerView ;
    private List<Country> mCountryList;
    private CountryFilterAdapter adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_view_country);

        mFilterEdit = findViewById(R.id.edit_filter) ;
        mRecyclerView = findViewById(R.id.country_recyclerView) ;
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mCountryList = new ArrayList<>();

        loadProducts();

        //===============   search option
        AddTextChange();


    }

    public void AddTextChange(){
        mFilterEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());

            }
        });
    }

    //=====================
    private void filter(String text) {
        List<Country> filteredList = new ArrayList<>();

        for (Country item : mCountryList) {

            if (item.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
            if(item.getCountry().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }


    private void loadProducts() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, Config.FILTER_COUNTRY_PRODUCTS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("serverResponse", "response: "+response );
                        try {
                            //converting the string to json array object
                            JSONObject array = new JSONObject(response);
                            Log.e("serverResponse", "array: "+ array ) ;
                            JSONArray resultArray = array.getJSONArray("result");

                            for (int i = 0; i < resultArray.length(); i++) {

                                //getting product object from json array
                                JSONObject product = resultArray.getJSONObject(i);
                                Log.e("serverResponse", "product: "+ product ) ;

                                //adding the product to product list
                                mCountryList.add(new Country(
                                        product.getInt("id"),
                                        product.getString("name"),
                                        product.getString("country"),
                                        product.getString("image")
                                ));
                            }
                            Log.e("serverResponse", "mCountryList: "+mCountryList) ;
//
                            adapter = new CountryFilterAdapter(getApplicationContext(), mCountryList);
                            mRecyclerView.setAdapter(adapter);
                            GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false);
                            mRecyclerView.setLayoutManager(manager);

//                            Toast.makeText(MainActivity.this, "successfull", Toast.LENGTH_LONG).show();
                        } catch (JSONException  e) {
                            e.printStackTrace();
                            Log.e("serverResponseError", "error: "+e.toString() );

                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }
}