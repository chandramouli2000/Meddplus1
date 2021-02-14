package com.example.meddplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class vediocall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vediocall);
    }

    public void back(View view) {
        Intent i = new Intent(this,meet.class);
        startActivity(i);
    }
}