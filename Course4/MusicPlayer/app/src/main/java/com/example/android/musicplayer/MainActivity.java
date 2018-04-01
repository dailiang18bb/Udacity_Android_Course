package com.example.android.musicplayer;

import android.graphics.Bitmap;
import android.media.MediaPlayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button playBtn, pauseBtn;
    //
    private String tilte;//歌名
    private String artist;//歌手
    private Bitmap bitmap;//专辑海报
    private long duration;//时长

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = (Button) findViewById(R.id.playButton);
        pauseBtn = (Button) findViewById(R.id.pauseButton);
        mediaPlayer = MediaPlayer.create(this, R.raw.need_no_more);


        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();

            }
        });


    }
}
