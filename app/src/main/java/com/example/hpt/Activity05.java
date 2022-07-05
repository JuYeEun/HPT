package com.example.hpt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.Nullable;

import java.util.Calendar;

public class Activity05 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity05);

        TimePicker mTimePicker;


        mTimePicker = (TimePicker)findViewById(R.id.timePicker);
        // = Calendar.getInstance();
        int hour, min;



    }
}
