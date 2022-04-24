package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {

    Button pressBtn ;
    EditText userName ;
    EditText passWord;
    public static final String USER_NAME_KEY = "username";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "+++++++", "onCreate:" );
        pressBtn = findViewById(R.id.btn_login);
        userName = findViewById(R.id.username);
        passWord=findViewById(R.id.password);

        pressBtn.setOnClickListener(view -> {

            String user = userName.getText().toString();
            String pass = passWord.getText().toString();

            if(user.isEmpty())
                Toast.makeText(getApplicationContext(),"Empty Username",Toast.LENGTH_LONG).show();
            else if(pass.isEmpty())
                Toast.makeText(getApplicationContext(),"Empty Password",Toast.LENGTH_LONG).show();
            else if(!pass.equalsIgnoreCase("123"))
                Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_LONG).show();
            else {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra(USER_NAME_KEY, user);
                startActivity(intent);
            }
        });
        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "+++++++", "onStart:" );

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "+++++++", "onStop:" );

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "+++++++", "onResume:" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "+++++++", "onPause:" );

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "+++++++", "onDestroy:" );

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "+++++++", "onRestart:" );
    }
}