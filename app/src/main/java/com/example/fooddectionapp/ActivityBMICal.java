package com.example.fooddectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityBMICal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i_cal);
        Button bmiButton = (Button) findViewById(R.id.button2);
        EditText txtname = findViewById(R.id.editTextNumber);
        String weight = txtname.getText().toString();
        EditText txtname2 = findViewById(R.id.editTextNumber2);
        String height = txtname2.getText().toString();
        TextView rs = findViewById(R.id.textView10);
        bmiButton.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                String newres = "Not Available yet";
                rs.setText(newres);

            }

        });
    }
}