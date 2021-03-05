package com.example.mad_tute02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: I am here, application loaded");
        int x = 5;
        if (x<6){
            Log.d(TAG, "onCreate: x is less than six");
        }else{
            Log.i(TAG, "onCreate: x greater than 6");
        }
        
    }
    @Override
    protected void onStart() {
        Log.i(TAG, "onStart: This is invoked");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, "onRestart: This is invoked");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume: This is invoked");
        super.onResume();
    }
}