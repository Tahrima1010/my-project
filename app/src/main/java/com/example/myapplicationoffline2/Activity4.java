package com.example.myapplicationoffline2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {
    private ImageView image3, image4, image5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        image3=(ImageView)findViewById(R.id.img3);
        image4=(ImageView)findViewById(R.id.img4);
        image5=(ImageView)findViewById(R.id.img5);
        image3.setOnClickListener(this);

        image4.setOnClickListener(this);

        image5.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.img3) {
            image3.setVisibility(View.GONE);
            image4.setVisibility(View.VISIBLE);


        }
        else if (view.getId() == R.id.img4) {
            image4.setVisibility(View.GONE);
            image5.setVisibility(View.VISIBLE);


        }

        else if (view.getId() == R.id.img5) {
            image5.setVisibility(View.GONE);
            image3.setVisibility(View.VISIBLE);


        }
    }
}