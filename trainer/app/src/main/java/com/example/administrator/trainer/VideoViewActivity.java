package com.example.administrator.trainer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;

public class VideoViewActivity extends AppCompatActivity {
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //获取VideoView组件
        video=(VideoView) findViewById(R.id.video);
        MediaController mc=new MediaController(this);
        video.setMediaController(mc);
        String uri="android.resource://" + getPackageName() + "/" + R.raw.train;
        video.setVideoURI(Uri.parse(uri));
        video.requestFocus();
        try{
            video.start();
        }catch(Exception e){
            e.printStackTrace();
        }
        //设置VideoView的Completion事件监听器
        video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Toast.makeText(VideoViewActivity.this, "视频播放完毕", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
