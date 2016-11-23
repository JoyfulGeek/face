package com.example.mrpei.project.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
;import com.example.mrpei.project.R;

public class SignupActivity extends AppCompatActivity {
    private Button button;
    private RadioButton teacher;
    private RadioButton monitor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_signup);

        teacher=(RadioButton)findViewById(R.id.teacherRB);
        monitor=(RadioButton)findViewById(R.id.monitorRB);
        teacher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    teacher.setChecked(true);
                    monitor.setChecked(false);
                }
            }
        });
        monitor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    teacher.setChecked(false);
                    monitor.setChecked(true);
                }
            }
        });

        button= (Button) findViewById(R.id.tran);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SignupActivity.this, MainActivity.class);
                SignupActivity.this.startActivity(intent);
            }
        });
    }

}

