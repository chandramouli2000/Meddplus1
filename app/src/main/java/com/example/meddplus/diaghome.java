package com.example.meddplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class diaghome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diaghome);
    }

    public void notifdiag(View view) {
        Intent intent = new Intent(this,diagnotify.class);
        startActivity(intent);
    }

    public void addtest(View view) {
        Intent intent = new Intent(this,addtest.class);
        startActivity(intent);
    }
}
