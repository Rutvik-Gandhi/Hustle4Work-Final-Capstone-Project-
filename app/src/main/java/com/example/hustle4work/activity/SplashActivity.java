package com.example.hustle4work.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.hustle4work.R;
import com.example.hustle4work.utility.CSPreferences;

public class SplashActivity extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {



            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                if (CSPreferences.getBoolean(SplashActivity.this,"login") == true){
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                }else {
                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(i);
                }



                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}