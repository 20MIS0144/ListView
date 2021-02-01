package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView MyListView=(ListView)findViewById(R.id.MyListView);
        ArrayList<String>myFamily=new ArrayList<String>();
        myFamily.add("Father");
        myFamily.add("Mother");
        myFamily.add("Brother");
        myFamily.add("Sister");
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
        MyListView.setAdapter(arrayAdapter);
        MyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Log.i("Person tapped:", myFamily.get(position));

            }
        });
    }
}