package com.wahid.sir.stamasofttechnologyallproject;

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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FilterPriceActivity extends AppCompatActivity {

    private static final String URL_PRODUCTS = "http://192.168.1.8/android/StamaSoft_Technology/filterSearch/getPriceName.php";

    private EditText mFilterEdit ;
    private RecyclerView mRecyclerView ;
    private List<Country> mPhoneList;
    private PriceFilterAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_price);

        mFilterEdit = findViewById(R.id.edit_filter) ;
        mRecyclerView = findViewById(R.id.price_recyclerView) ;
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mPhoneList = new ArrayList<>();

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

        for (Country item : mPhoneList) {

            if (item.getName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
            if(String.valueOf(item.getPrice()).toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);
    }


    private void loadProducts() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_PRODUCTS,
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
                                mPhoneList.add(new Country(
                                        product.getInt("id"),
                                        product.getString("name"),
                                        product.getString("image"),
                                        product.getDouble("price")
                                ));
                            }
                            Log.e("serverResponse", "mCountryList: "+ mPhoneList) ;
//
                            adapter = new PriceFilterAdapter(getApplicationContext(), mPhoneList);
                            mRecyclerView.setAdapter(adapter);
                            GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false);
                            mRecyclerView.setLayoutManager(manager);

//                            Toast.makeText(MainActivity.this, "successfull", Toast.LENGTH_LONG).show();
                        } catch (JSONException e) {
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