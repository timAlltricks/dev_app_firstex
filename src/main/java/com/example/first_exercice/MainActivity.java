package com.example.first_exercice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: ");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity", "onStart: ");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MainActivity", "onStop: ");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "onCreate: ");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity", "onResume: ");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity", "onDestroy: ");
    }
}
