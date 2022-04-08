package com.example.fortest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Question2 extends AppCompatActivity {

    Button btnNext, btnPre;
    ImageView imgView;
    int i=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnNext= findViewById(R.id.btnNext);
        btnPre=findViewById(R.id.btnPre);
        imgView=findViewById(R.id.imgView1);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<3) {
                    i++;
                }else if(i==3){
                    i=1;
                }
                int posterId = getResources().getIdentifier("img" + (i), "drawable", getPackageName());
                imgView.setImageResource(posterId);
            }
        });


        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>1) {
                    i--;
                }else if(i==1){
                    i=3;
                }
                int posterId = getResources().getIdentifier("img" + (i), "drawable", getPackageName());
                imgView.setImageResource(posterId);
            }
        });

    }
}