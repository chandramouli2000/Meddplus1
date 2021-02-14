package com.example.meddplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class doctorreg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorreg);
    }

    public void docreg(View view) {
        Intent i = new Intent(this,doctorhome.class);
        startActivity(i);
    }
}