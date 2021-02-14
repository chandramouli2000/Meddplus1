package com.example.meddplus;

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

    public void doctor(View view) {
        Intent intent = new Intent(this, doctorreg.class);
        startActivity(intent);
    }

    public void medical(View view) {
        Intent intent = new Intent(this, pharmareg.class);
        startActivity(intent);
    }

    public void diag(View view) {
        Intent intent = new Intent(this, diagreg.class);
        startActivity(intent);
    }
}
