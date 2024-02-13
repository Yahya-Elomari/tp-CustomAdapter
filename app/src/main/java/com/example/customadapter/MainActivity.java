package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list1);

        ArrayList<String> countries = new ArrayList<>();

        countries.add("Yamen");
        countries.add("Morocco");
        countries.add("Saudi");
        countries.add("Egypt");
        countries.add("Palestine");

        MyAdapterItem myadapteritem = new MyAdapterItem(this,countries);
        lv.setAdapter(myadapteritem);
    }
}