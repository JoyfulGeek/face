package com.example.mrpei.project.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.mrpei.project.R;

public class TeacherActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private Spinner spinner;
    private Button button_teacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_teacher);

        button_teacher = (Button) findViewById(R.id.button_teacher);
        button_teacher.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TeacherActivity.this, TeacherMainActivity.class);
                TeacherActivity.this.startActivity(intent);
            }
        });

        final String[] arr1 = {"华师", "华工"};
        spinner = (Spinner) findViewById(R.id.spinner1);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setVisibility(View.VISIBLE);

        final String[] arr2 = {"软工", "国商", "城文"};
        spinner = (Spinner) findViewById(R.id.spinner2);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setVisibility(View.VISIBLE);

        final String[] arr3 = {"14", "15", "16"};
        spinner = (Spinner) findViewById(R.id.spinner3);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr3);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setVisibility(View.VISIBLE);

        final String[] arr4 = {"1班", "2班"};
        spinner = (Spinner) findViewById(R.id.spinner4);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr4);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setVisibility(View.VISIBLE);
    }
}


