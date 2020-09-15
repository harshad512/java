package com.example.java;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class javatheorylist extends Activity {
    RecyclerView recyclerView;
    CustomAdapter_theory customAdapter_theory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_list);

        recyclerView = (RecyclerView)findViewById(R.id.javatheorylist_recyclerview);

        int []image = new int[]
                {
                        R.drawable.ap,R.drawable.theory
                };
        String []title = new String[]
                {
                        "Chapter 1","Chapter 2"
                };
        String []htmlFile = new String[]
                {
                        "ANDROID", "JAVA"
                };
        customAdapter_theory = new CustomAdapter_theory(this,image,title,htmlFile);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapter_theory);
    }
}
