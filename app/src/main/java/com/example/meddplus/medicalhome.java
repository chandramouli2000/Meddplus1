package com.example.meddplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class medicalhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicalhome);
    }

    public void tablets(View view) {
        Intent intent = new Intent(this,medicines.class);
        startActivity(intent);
    }

    public void syrup(View view) {
    }

    public void tonics(View view) {
    }



    public void notifimed(View view) {
        Intent intent = new Intent(this,mednotify.class);
        startActivity(intent);
    }

    public void addmed(View view) {
        Intent intent = new Intent(this,addmed.class);
        startActivity(intent);
    }


}
