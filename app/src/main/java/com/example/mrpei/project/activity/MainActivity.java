package com.example.mrpei.project.activity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;//注意view的大小写
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.mrpei.project.R;


public class MainActivity extends AppCompatActivity {
    private Button my_button = null;
    private Button button=null;

    private EditText user;
    private EditText password;
    private String userValue;
    private String passwordValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        user=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.password);

        my_button = (Button) findViewById(R.id.signup);
        my_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SignupActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        button=(Button)findViewById(R.id.login);
        button.setOnClickListener(new ButtonListenr());
    }

    private class ButtonListenr implements View.OnClickListener {
        public void onClick(View v) {
            userValue=user.getText().toString();
            passwordValue=password.getText().toString();
            if(userValue.equals("teacher") && passwordValue.equals("12345")) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TeacherActivity.class);
                MainActivity.this.startActivity(intent);
            }
            if(userValue.equals("monitor") && passwordValue.equals("1234")) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MonitorActivity.class);
                MainActivity.this.startActivity(intent);
            }
        }
    }
}