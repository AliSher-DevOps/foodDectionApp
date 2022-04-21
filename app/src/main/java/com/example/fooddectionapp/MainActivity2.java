package com.example.fooddectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b = (Button)findViewById(R.id.buttonCamera);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(MainActivity2.this, MainActivity6.class));
            }
        });
        Button yourButton = (Button) findViewById(R.id.buttonHistory);
        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });
        Button calButton = (Button) findViewById(R.id.buttonCal);
        calButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity2.this, MainActivity4.class));
            }
        });
        Button openGalleryButton = (Button) findViewById(R.id.buttonGallery);
        openGalleryButton.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){

                startActivity(new Intent(MainActivity2.this, MainActivity5.class));
            }

        });
        Button bmiButton = (Button) findViewById(R.id.buttonbmi);
        bmiButton.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){

                startActivity(new Intent(MainActivity2.this, ActivityBMICal.class));
            }

        });
    }
    }
