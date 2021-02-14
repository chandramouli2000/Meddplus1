package com.example.meddplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class meet extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet);



    }
    public void status(View view) {
        Intent intent = new Intent(this,status.class);
        startActivity(intent);

    }



    public void opentablets(View view) {
        Intent intent = new Intent(this,tablets.class);
        startActivity(intent);
    }

    public void diagdoc(View view) {
        Intent intent = new Intent(this,tests.class);
        startActivity(intent);
    }

    public void vediocall(View view) {
        Intent intent = new Intent(this,vediocall.class);
        startActivity(intent);
    }
}
