package com.example.meddplus;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class tests extends AppCompatActivity {
    EditText et_send;
    String test;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests);

    }

    public void send(View view) {
        test = et_send.getText().toString();
        String method = "register";
        BackgroundTaskDiagDoc backgroundTaskDiagDoc = new BackgroundTaskDiagDoc(this);
        backgroundTaskDiagDoc.execute(method,test);
        finish();
    }
}