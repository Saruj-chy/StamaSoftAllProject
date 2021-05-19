package com.wahid.sir.stamasofttechnologyallproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.wahid.sir.stamasofttechnologyallproject.Adapter.DateDifferenceAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Adapter.DateFromToAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Adapter.PhoneFilterAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Class.Config;
import com.wahid.sir.stamasofttechnologyallproject.Class.Country;
import com.wahid.sir.stamasofttechnologyallproject.Class.Product;
import com.wahid.sir.stamasofttechnologyallproject.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateFromToActivity extends AppCompatActivity {

    private TextView mDateFromTextView, mDateToTextView;
    private ImageButton mImgBtnDF, mImgBtnDT;

    private Calendar calendar;
    private int year, month, day, hour, minute1;
    private String mFromDate;
    private String mToDate ;

    private List<Product> mProductList = new ArrayList<>() ;
    private RecyclerView mDateDifferenceRV ;
    private DateFromToAdapter mDateFromToAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_from_to);

        Initialize();

        mDateDifferenceRV.setHasFixedSize(true);
        mDateDifferenceRV.setLayoutManager(new LinearLayoutManager(this));
        mDateFromToAdapter = new DateFromToAdapter(getApplicationContext(), mProductList);
        mDateDifferenceRV.setAdapter(mDateFromToAdapter);
        GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false);
        mDateDifferenceRV.setLayoutManager(manager);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR);


    }

    private void Initialize() {
        mDateDifferenceRV = findViewById(R.id.date_fromto_recycler) ;
        mDateFromTextView = findViewById(R.id.text_date_from) ;
        mDateToTextView = findViewById(R.id.text_date_to) ;
        mImgBtnDF = findViewById(R.id.imagebtn_date_from) ;
        mImgBtnDT = findViewById(R.id.imagebtn_date_to) ;
    }

    public void onLinearDateFrom(View view) {
        DatePickerDialog datepick = new DatePickerDialog(DateFromToActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                Calendar selectCalendars = Calendar.getInstance();
                selectCalendars.set(year, month, dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dateFormat = simpleDateFormat.format(selectCalendars.getTime());
                Log.e("date_format", "  dateString:  "  + dateFormat ) ;
                mDateFromTextView.setText(dateFormat);

                mFromDate = dateFormat ;


            }
        } ,year,month,day);
        datepick.setTitle("select date");
        datepick.show();
    }
    public void onLinearDateTo(View view) {
        DatePickerDialog datepick = new DatePickerDialog(DateFromToActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {


                Calendar selectCalendars = Calendar.getInstance();
                selectCalendars.set(year, month, dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dateFormat = simpleDateFormat.format(selectCalendars.getTime());
                Log.e("date_format", "  dateString:  "  + dateFormat ) ;
                mDateToTextView.setText(dateFormat);

                mToDate = dateFormat ;


            }
        } ,year,month,day);
        datepick.setTitle("select date");
        datepick.show();
    }

    public void onSelectClick(View view) {

        mProductList.clear();
        loadProducts(mFromDate, mToDate);


//        long timeDiff = mToDate-mFromDate ;
//        long day = timeDiff / (24*60*60*1000);
//
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        int time = 24*60*60*1000 ;
//        long changeTime = mFromDate;
//
//        mDiffDateList.clear();
//        for (int i =0; i<= day; i++){
//
//            String dateString = formatter.format(new Date(changeTime));
//            mDiffDateList.add(dateString) ;
//            changeTime= changeTime+time ;
//
//
//        }
//        mDateDifferenceAdapter.notifyDataSetChanged();
    }

    private void loadProducts(final String fromDate, final String toDate) {
        StringRequest stringRequest = new StringRequest(Request.Method.POST, Config.DATE_BASED_PRODUCT_URL,
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
                                mProductList.add(new Product(
                                        product.getInt("id"),
                                        product.getString("name"),
                                        product.getString("des"),
                                        product.getString("price"),
                                        product.getString("entrydate")
                                ));
                            }
                            Log.e("serverResponse", "mCountryList: "+ mProductList.toString()) ;

                            mDateFromToAdapter.notifyDataSetChanged();

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
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Log.e("map", "fromDate:"+fromDate+"  toDate:"+toDate ) ;
                Map<String, String> parameters = new HashMap<String, String>();
                parameters.put("from_date", fromDate);
                parameters.put("to_date", toDate);

                return parameters;
            }
        };

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }

}