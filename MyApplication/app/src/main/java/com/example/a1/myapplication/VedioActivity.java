package com.example.a1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VedioActivity extends AppCompatActivity {
    Button btt1,btt11,btt2,btt22,btt3,btt33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);
        btt1=findViewById(R.id.btt1);
        btt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VedioActivity.this,Video1Activity.class);
                startActivity(intent);
            }
        });
        btt11=findViewById(R.id.btt11);
        btt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VedioActivity.this,Video2Activity.class);
                startActivity(intent);
            }
        });
        btt2=findViewById(R.id.btt2);
        btt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VedioActivity.this,Video3Activity.class);
                startActivity(intent);
            }
        });
        btt22=findViewById(R.id.btt22);
        btt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VedioActivity.this,Video4Activity.class);
                startActivity(intent);
            }
        });
        btt3=findViewById(R.id.btt3);
        btt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VedioActivity.this,Video5Activity.class);
                startActivity(intent);
            }
        });
        btt33=findViewById(R.id.btt33);
        btt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VedioActivity.this,Video6Activity.class);
                startActivity(intent);
            }
        });
    }
}
