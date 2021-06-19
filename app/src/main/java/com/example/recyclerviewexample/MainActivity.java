package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<exampleitem> exampleList = new ArrayList<>();
        exampleList.add(new exampleitem(R.drawable.ic_baseline, "line1"));
        exampleList.add(new exampleitem(R.drawable.ic_android, "line2"));
        exampleList.add(new exampleitem(R.drawable.ic_airplay, "line3"));
        exampleList.add(new exampleitem(R.drawable.ic_android, "line4"));
        exampleList.add(new exampleitem(R.drawable.ic_baseline, "line1"));
        exampleList.add(new exampleitem(R.drawable.ic_android, "line2"));
        exampleList.add(new exampleitem(R.drawable.ic_airplay, "line3"));
        exampleList.add(new exampleitem(R.drawable.ic_android, "line4"));
        exampleList.add(new exampleitem(R.drawable.ic_baseline, "line1"));
        exampleList.add(new exampleitem(R.drawable.ic_android, "line2"));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutmanager = new LinearLayoutManager(this);
        adapter = new exampleadapter(exampleList);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setAdapter(adapter);

        

    }

}