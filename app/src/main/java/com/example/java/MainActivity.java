package com.example.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button java;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java = (Button) findViewById(R.id.javabutton);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjava();
            }
        });
    }
    public void openjava(){
        Intent intent = new Intent(this, java_list.class);
        startActivity(intent);
    }
}
