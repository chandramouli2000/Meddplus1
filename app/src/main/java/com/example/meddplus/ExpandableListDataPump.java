package com.example.meddplus;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("sam");
        cricket.add(" Age = 30");
        cricket.add("backpain");


        List<String> football = new ArrayList<String>();
        football.add("tom");
        football.add("Age  = 36");
        football.add("dry cough");


        List<String> basketball = new ArrayList<String>();
        basketball.add("jimmy");
        basketball.add("Age = 26");
        basketball.add("fever");


        expandableListDetail.put("1", cricket);
        expandableListDetail.put("2", football);
        expandableListDetail.put("3", basketball);
        return expandableListDetail;
    }
}
