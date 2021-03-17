package com.wahid.sir.stamasofttechnologyallproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.wahid.sir.stamasofttechnologyallproject.Adapter.LoadMoreDataAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Class.Config;
import com.wahid.sir.stamasofttechnologyallproject.Class.MoreData;
import com.wahid.sir.stamasofttechnologyallproject.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class LoadMoreDataActivity extends AppCompatActivity {

    private EditText mFilterEdit ;
    private RecyclerView mRecyclerView ;
    private List<MoreData> mDataList ;
    private LoadMoreDataAdapter adapter ;

    private int totalItemCount, pastVisiblesItems,  visibleItemCount, page =1, previousTotal ;
    private boolean loading = true ;
    private  GridLayoutManager manager ;

    private ProgressBar progressbar;
    private int testLast = 0, lengthArray=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_more_data);

        mFilterEdit = findViewById(R.id.edit_load) ;
        mRecyclerView = findViewById(R.id.load_recyclerView) ;
        progressbar = findViewById(R.id.progressbar) ;
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mDataList = new ArrayList<>();

        loadProducts(0);


    }





    private void loadProducts(final int number) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, Config.LOAD_MORE_DATA_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        Log.e("TAGs", "response: "+response );
                        try {
                            JSONArray array = new JSONArray(response);

                            lengthArray = array.length() ;

                            ForLoadMoreData(array, number) ; //initial load data

                            adapter = new LoadMoreDataAdapter(getApplicationContext(), mDataList);
                            mRecyclerView.setAdapter(adapter);
                            manager = new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false);
                            mRecyclerView.setLayoutManager(manager);

                            loadMoreData(array) ;

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        Volley.newRequestQueue(this).add(stringRequest);
    }

    private void ForLoadMoreData(JSONArray array, int number) {
        if(number==lengthArray){
            return;
        }

        for (int i = number; i < number+ 10 ; i++) {
            testLast = i ;

            JSONObject product = null;
            try {
                product = array.getJSONObject(i);

                mDataList.add(new MoreData(
                        product.getInt("userId"),
                        product.getInt("id"),
                        product.getString("title"),
                        product.getString("body")
                ));
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }

    private void loadMoreData(final JSONArray array) {
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

                if (dy > 0)
                {
                    visibleItemCount = manager.getChildCount();
                    totalItemCount = manager.getItemCount();
                    pastVisiblesItems = manager.findFirstVisibleItemPosition();

                    if (loading) {
                        if ((visibleItemCount + pastVisiblesItems) >= totalItemCount-1) {
                            loading = false;
                            progressbar.setVisibility(View.VISIBLE);

                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    loadNextDataFromApi(array);
                                }
                            }, 1000);

                        }
                    }
                }
            }
        });
    }

    public void loadNextDataFromApi(JSONArray array) {
        loading = true;
        int j = testLast+1;
        ForLoadMoreData(array, j); //  2nd --- final load data

        progressbar.setVisibility(View.GONE);
        adapter.notifyDataSetChanged();
    }



}