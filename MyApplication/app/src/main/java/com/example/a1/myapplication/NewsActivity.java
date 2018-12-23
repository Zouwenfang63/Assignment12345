package com.example.a1.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NewsActivity extends AppCompatActivity {

    Button bttn,bttn1,bttn2;
    ImageView IMAGE,IMAGE1,IMAGE2,Image,Image1,Image2,Im3,Im1,Im2;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        bttn=findViewById(R.id.bttn);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewsActivity.this,News1Activity.class);
                startActivity(intent);
            }
        });
        bttn1=findViewById(R.id.bttn1);
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewsActivity.this,News2Activity.class);
                startActivity(intent);
            }
        });
        bttn2=findViewById(R.id.bttn2);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NewsActivity.this,News3Activity.class);
                startActivity(intent);
            }
        });
    }
}
