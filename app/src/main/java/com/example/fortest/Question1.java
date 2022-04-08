package com.example.fortest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question1 extends AppCompatActivity {

    Button btnFirst, btnSecond, btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst= findViewById(R.id.btnFirst);
        btnSecond= findViewById(R.id.btnSecond);
        btnThird= findViewById(R.id.btnThird);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFirst.setText("1ST BUTTON!");
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnSecond.setText("2ND BUTTON!");
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnThird.setText("3RD BUTTON!");
            }
        });


    }
}