package com.wahid.sir.stamasofttechnologyallproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.wahid.sir.stamasofttechnologyallproject.Class.Config;
import com.wahid.sir.stamasofttechnologyallproject.MainActivity;
import com.wahid.sir.stamasofttechnologyallproject.R;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    private EditText mEmailEditText, mPasswordEditText;
    private TextView mForgetTextView, mBackTextView;
    private Button mSignInBtn, mSignUpBtn, mSubmitBtn ;

    private String mEmail, mPassword ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Initialize();

        mSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData("sign_up") ;
            }
        });

        mSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData("sign_in") ;
            }
        });

        mForgetTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPasswordEditText.setVisibility(View.GONE);
                mSignUpBtn.setVisibility(View.GONE);
                mSignInBtn.setVisibility(View.GONE);
                mForgetTextView.setVisibility(View.GONE);
                mBackTextView.setVisibility(View.VISIBLE);
                mSubmitBtn.setVisibility(View.VISIBLE);
            }
        });

        mBackTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPasswordEditText.setVisibility(View.VISIBLE);
                mSignUpBtn.setVisibility(View.VISIBLE);
                mSignInBtn.setVisibility(View.VISIBLE);
                mBackTextView.setVisibility(View.GONE);
                mForgetTextView.setVisibility(View.VISIBLE);
                mSubmitBtn.setVisibility(View.GONE);
            }
        });
        mSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadProducts();
            }
        });

    }

    private void insertData(final String state) {
        mEmail = mEmailEditText.getText().toString().trim() ;
        mPassword = mPasswordEditText.getText().toString().trim() ;
        StringRequest stringRequest = new StringRequest(Request.Method.POST, Config.INSERT_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(LoginActivity.this, response, Toast.LENGTH_SHORT).show();
                        Log.e("TAG", "response: "+ response ) ;
                        mEmailEditText.setText("");
                        mPasswordEditText.setText("");

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
                Map<String, String> parameters = new HashMap<String, String>();
                parameters.put("email", mEmail );
                parameters.put("password", mPassword );
                parameters.put("state", state );
                return parameters;
            }

        };

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }
    private void loadProducts() {
        mEmail = mEmailEditText.getText().toString().trim();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, Config.MAIL_SENT_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(LoginActivity.this, response, Toast.LENGTH_SHORT).show();
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

                Map<String, String> parameters = new HashMap<String, String>();
                parameters.put("email", mEmail);
                return parameters;
            }

        };
        Volley.newRequestQueue(this).add(stringRequest);
    }

    private void Initialize() {
        mEmailEditText = findViewById(R.id.edit_email) ;
        mPasswordEditText = findViewById(R.id.edit_password) ;
        mForgetTextView = findViewById(R.id.text_forget) ;
        mBackTextView = findViewById(R.id.text_back) ;
        mSignInBtn = findViewById(R.id.btn_sign_in) ;
        mSignUpBtn = findViewById(R.id.btn_sign_up) ;
        mSubmitBtn = findViewById(R.id.btn_submit) ;
    }
}