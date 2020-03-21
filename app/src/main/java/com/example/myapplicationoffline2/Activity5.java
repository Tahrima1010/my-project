package com.example.myapplicationoffline2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity5 extends AppCompatActivity implements View.OnClickListener {
    private ImageView Photo1, Photo2, Photo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        Photo1=(ImageView)findViewById(R.id.pic1);
        Photo2=(ImageView)findViewById(R.id.pic2);
        Photo3=(ImageView)findViewById(R.id.pic3);
        Photo1.setOnClickListener(this);

        Photo2.setOnClickListener(this);

        Photo3.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.pic1) {
            Photo1.setVisibility(View.GONE);
            Photo2.setVisibility(View.VISIBLE);


        }
        else if (view.getId() == R.id.pic2) {
            Photo2.setVisibility(View.GONE);
            Photo3.setVisibility(View.VISIBLE);


        }

        else if (view.getId() == R.id.pic3) {
            Photo3.setVisibility(View.GONE);
            Photo1.setVisibility(View.VISIBLE);


        }
    }
}