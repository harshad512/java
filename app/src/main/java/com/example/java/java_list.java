package com.example.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class java_list extends AppCompatActivity {
    private Button theory,programe,compiler,ap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_list);

        theory = (Button) findViewById(R.id.theory);
        programe = (Button) findViewById(R.id.programs);
        compiler = (Button) findViewById(R.id.compiler);
        ap = (Button) findViewById(R.id.apptitudepracticals);

        theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjavatheorylist();
            }
        });

        programe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjavaprogramlist();
            }
        });
        compiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjavacompilerlist();
            }
        });
        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjavaAPlist();
            }
        });
    }
    public void openjavatheorylist(){
        Intent intent = new Intent(this, javatheorylist.class);
        startActivity(intent);
    }
    public void openjavaprogramlist(){
        Intent intent = new Intent(this,javaprogramlist.class);
        startActivity(intent);
    }
    public void openjavacompilerlist(){
        Intent intent = new Intent(this,javacompilerlist.class);
        startActivity(intent);
    }
    public void openjavaAPlist(){
        Intent intent = new Intent(this,javaAPlist.class);
        startActivity(intent);
    }
}
