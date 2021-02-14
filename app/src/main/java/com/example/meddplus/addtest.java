package com.example.meddplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addtest extends AppCompatActivity {

    EditText et_send;
    String test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtest);
        et_send = (EditText)findViewById(R.id.sendtest);

    }

    public void send(View view) {

        test = et_send.getText().toString();
        String method = "register";
        BackgroundTaskDiag backgroundTaskDiag = new BackgroundTaskDiag(this);
        backgroundTaskDiag.execute(method,test);
        finish();
    }
}
