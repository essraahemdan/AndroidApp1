package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d( "+++++++", "onCreate 2:" );
        Intent intent = getIntent();
        String user = intent.getExtras().getString(MainActivity.USER_NAME_KEY);
        Toast.makeText(getApplicationContext(),"Welcome" + " " + user,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "+++++++", "onStart 2:" );

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "+++++++", "onStop 2:" );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "+++++++", "onResume 2:" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "+++++++", "onPause 2:" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "+++++++", "onDestroy 2:" );

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "+++++++", "onRestart 2:" );
    }
}