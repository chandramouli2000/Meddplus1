package com.example.meddplus;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class tablets extends AppCompatActivity {
    EditText et_name,et_count,et_price,et_countoerday,et_time;
    String test_name,test_count,test_price,test_countoerday,test_time;
    MultiAutoCompleteTextView text1;
    String[] languages={"susru medicals ","Aruna Pharmacy","Mouli Medicals","Reddy Parma","JDBC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablets);

        text1=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);

        ArrayAdapter adapter = new
                ArrayAdapter(this,android.R.layout.simple_list_item_1,languages);

        text1.setAdapter(adapter);
        text1.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }

    public void submit(View view) {
        test_name = et_name.getText().toString();
        test_count = et_count.getText().toString();
        test_price = et_price.getText().toString();
        test_countoerday = et_countoerday.getText().toString();
        test_time = et_time.getText().toString();
        String method = "register";
        BackgroundTaskTablets backgroundTaskTablets = new BackgroundTaskTablets(this);
        backgroundTaskTablets.execute(method,test_name,test_count,test_price,test_countoerday,test_time);
        finish();
    }
}