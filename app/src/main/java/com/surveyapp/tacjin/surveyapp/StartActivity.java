package com.surveyapp.tacjin.surveyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onClick(View v){
        Intent myIntent = new Intent(getApplicationContext(), FirstActivity.class);
        startActivity(myIntent);
    }
}
