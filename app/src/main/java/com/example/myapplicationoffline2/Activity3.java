package com.example.myapplicationoffline2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

public class Activity3 extends AppCompatActivity {
    private TableRow row1;
    private TableRow row2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        row1=findViewById(R.id.row1);
        row1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        row2=findViewById(R.id.row2);
        row2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });


    }
    public void openActivity4()
    {
        Intent intent=new Intent(this,Activity4.class);
        startActivity(intent);
    }
    public void openActivity5()
    {
        Intent intent=new Intent(this,Activity5.class);
        startActivity(intent);
    }
}
