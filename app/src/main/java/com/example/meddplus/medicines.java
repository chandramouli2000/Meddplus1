package com.example.meddplus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class medicines extends Activity {

    String[] listviewTitle = new String[]{
            "paracetmol", "caripil", "Zincovita", "ZINCOVITA",

    };

    int[] listviewImage = new int[]{
            R.drawable.paracetmol, R.drawable.caripil, R.drawable.iron, R.drawable.zinc,

    };

    String[] listviewShortDescription = new String[]{
            "10", "20", "89", "50",
    };

    ListView listview;
    Button addButton;
    EditText GetValue;
    String[] ListElements = new String[] {
            "Android",
            "PHP",
            "Python",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 4; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.customlistview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);

   /*     listview = findViewById(R.id.listview);
        addButton = findViewById(R.id.button1);
        GetValue = findViewById(R.id.edittext);

        final List<String> ListElementsArrayList = new ArrayList<>(Arrays.asList(ListElements));
        final ArrayAdapter<String> adapter = new ArrayAdapter<>
                (medicines.this, android.R.layout.simple_list_item_1, ListElementsArrayList);
        listview.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListElementsArrayList.add(GetValue.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });*/
    }
}
