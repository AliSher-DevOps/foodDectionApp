package com.example.fooddectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button yourButton = (Button) findViewById(R.id.buttonwelcome);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        Button aboutButton = (Button) findViewById(R.id.buttonAbout);

        aboutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ActivityAbout.class));
            }
        });
        Button exitButton = (Button) findViewById(R.id.buttonExit);

        exitButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });

    }


}