package com.example.meddplus;

import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundTaskTablets extends AsyncTask<String, Void, String> {

    Context ctx;

    BackgroundTaskTablets(Context ctx){
        this.ctx = ctx;

    }

    @Override
    protected String doInBackground(String... params) {
        String reg_url = "http://192.168.43.53/doctor/tablets.php";// database
        String  method = params[0];
        if(method.equals("register"))
        {

            String test_name = params[1];
            String test_count = params[2];
            String test_price = params[3];
            String test_countoerday = params[4];
            String test_time = params[5];
            try {
                URL url = new URL(reg_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                //httpURLConnection.setDoInput(true);
                OutputStream OS = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS, "UTF-8"));

                String data = URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode(test_name, "UTF-8") + "&" + URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode(test_count, "UTF-8") + "&" +
                        URLEncoder.encode("user_name", "UTF-8") + "=" + URLEncoder.encode(test_price, "UTF-8") + "&" +
                        URLEncoder.encode("user_pass", "UTF-8") + "=" + URLEncoder.encode(test_countoerday, "UTF-8") + "&" + URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode(test_time, "UTF-8") ;
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS = httpURLConnection.getInputStream();
                IS.close();
                //httpURLConnection.connect();
                httpURLConnection.disconnect();
                return "Registration Success...";
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }




    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
