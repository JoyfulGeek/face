package com.example.mrpei.project.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.example.mrpei.project.R;

public class WelcomeActivity extends Activity {

    private final long SPLASH_LENGTH = 1500;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        handler.postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                              finish();
                }
             }, SPLASH_LENGTH);
    }
}
