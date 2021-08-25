package com.example.prefecturalcapital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1_onClick(View view){
        Intent i = new Intent(this,com.example.prefecturalcapital.SubActivity.class);
        startActivity(i);
    }
}