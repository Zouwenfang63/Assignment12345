package com.example.a1.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class Video1Activity extends AppCompatActivity {
    private VideoView videoView;
    private Button btn_start,btn_end,btn_back;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);
        initView();

    }
    private void initView() {
        videoView= (VideoView) findViewById(R.id.videoView);
        btn_start= (Button) findViewById(R.id.btn_start);
        btn_end= (Button) findViewById(R.id.btn_end);
        btn_back= (Button) findViewById(R.id.btn_back);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init();
            }
        });
        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Video1Activity.this,VedioActivity.class);
                startActivity(intent);
            }
        });
    }
    private void init() {
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        String uri = "android.resource://com.example.a1.myapplication/" + R.raw.lia;
        videoView.setVideoURI(Uri.parse(uri));
        videoView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoView);
        videoView.requestFocus();
        videoView.start();
    }
}
