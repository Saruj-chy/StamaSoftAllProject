package com.wahid.sir.stamasofttechnologyallproject.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.wahid.sir.stamasofttechnologyallproject.Adapter.CountryFilterAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Adapter.DateDifferenceAdapter;
import com.wahid.sir.stamasofttechnologyallproject.Class.Country;
import com.wahid.sir.stamasofttechnologyallproject.MainActivity;
import com.wahid.sir.stamasofttechnologyallproject.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateDifferenceActivity extends AppCompatActivity {
    private TextView mDateFromTextView, mDateToTextView;
    private ImageButton mImgBtnDF, mImgBtnDT;

    private Calendar calendar;
    private int year, month, day, hour, minute1;
    private long mFromDate;
    private long mToDate ;

    private List<String> mDiffDateList = new ArrayList<>() ;
    private RecyclerView mDateDifferenceRV ;
    private DateDifferenceAdapter mDateDifferenceAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_difference);

        Initialize();

        mDateDifferenceRV.setHasFixedSize(true);
        mDateDifferenceRV.setLayoutManager(new LinearLayoutManager(this));
        mDateDifferenceAdapter = new DateDifferenceAdapter(getApplicationContext(), mDiffDateList);
        mDateDifferenceRV.setAdapter(mDateDifferenceAdapter);
        GridLayoutManager manager = new GridLayoutManager(getApplicationContext(), 1, GridLayoutManager.VERTICAL, false);
        mDateDifferenceRV.setLayoutManager(manager);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR);

    }

    private void Initialize() {
        mDateDifferenceRV = findViewById(R.id.date_difference_recycler) ;
        mDateFromTextView = findViewById(R.id.text_date_from) ;
        mDateToTextView = findViewById(R.id.text_date_to) ;
        mImgBtnDF = findViewById(R.id.imagebtn_date_from) ;
        mImgBtnDT = findViewById(R.id.imagebtn_date_to) ;
    }

    public void onLinearDateFrom(View view) {
        DatePickerDialog datepick = new DatePickerDialog(DateDifferenceActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                String dateStr = dayOfMonth+"-"+(month+1)+"-"+year;
                mDateFromTextView.setText(dateStr);


                SimpleDateFormat curFormater = new SimpleDateFormat("dd-MM-yyyy");
                Date dateObj = null;
                try {
                    dateObj = curFormater.parse(dateStr);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                long time = dateObj.getTime() ;
                mFromDate = time ;

//                TimePickerDialog timepick = new TimePickerDialog(DateDifferenceActivity.this, new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//
//                        // Time results here
//
//                    }
//                }, hour, minute1, true);
//                timepick.setTitle("select time");
//                timepick.show();
            }
        } ,year,month,day);
        datepick.setTitle("select date");
        datepick.show();
    }
    public void onLinearDateTo(View view) {
        DatePickerDialog datepick = new DatePickerDialog(DateDifferenceActivity.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                String dateStr = dayOfMonth+"-"+(month+1)+"-"+year;
                mDateToTextView.setText(dateStr);


                SimpleDateFormat curFormater = new SimpleDateFormat("dd-MM-yyyy");
                Date dateObj = null;
                try {
                    dateObj = curFormater.parse(dateStr);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                long time = dateObj.getTime() ;
                mToDate = time ;

//                TimePickerDialog timepick = new TimePickerDialog(DateDifferenceActivity.this, new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//
//                        // Time results here
//
//                    }
//                }, hour, minute1, true);
//                timepick.setTitle("select time");
//                timepick.show();
            }
        } ,year,month,day);
        datepick.setTitle("select date");
        datepick.show();
    }

    public void onSelectClick(View view) {
        long timeDiff = mToDate-mFromDate ;
        long day = timeDiff / (24*60*60*1000);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        int time = 24*60*60*1000 ;
        long changeTime = mFromDate;

        mDiffDateList.clear();
        for (int i =0; i<= day; i++){

            String dateString = formatter.format(new Date(changeTime));
            mDiffDateList.add(dateString) ;
            changeTime= changeTime+time ;


        }
        mDateDifferenceAdapter.notifyDataSetChanged();
    }


}