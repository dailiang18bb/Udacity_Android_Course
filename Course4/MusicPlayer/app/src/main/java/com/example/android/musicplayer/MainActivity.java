package com.example.android.musicplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button playBtn, pauseBtn;
    //
    private AudioManager am;
    private SeekBar seekBar;
    //private VolumeReceiver receiver;
    private ImageView mimageVolume;


    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT){
                mediaPlayer.pause();
            }else if (focusChange == AudioManager.AUDIOFOCUS_LOSS){
                mediaPlayer.stop();
                am.abandonAudioFocus(audioFocusChangeListener);
            }else if(focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                mediaPlayer.pause();
            }else if(focusChange == AudioManager.AUDIOFOCUS_GAIN){
                mediaPlayer.start();
            }
        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        playBtn = (Button) findViewById(R.id.playButton);
        pauseBtn = (Button) findViewById(R.id.pauseButton);
        mediaPlayer = MediaPlayer.create(this, R.raw.need_no_more);
        seekBar = findViewById(R.id.changeVolume);
        mimageVolume = findViewById(R.id.imageVolume);
        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final int result = am.requestAudioFocus(audioFocusChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);



        //control the ImageView to show and disgard the seekbar
        mimageVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seekBar.getVisibility() == View.VISIBLE) {
                    seekBar.setVisibility(View.GONE);
                } else {
                    seekBar.setVisibility(View.VISIBLE);
                }
            }
        });

        //handle the play btn
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){

                    mediaPlayer.start();

                }
            }
        });

        //handle the pause btn
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();

            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this,"I'm done", Toast.LENGTH_SHORT).show();
            }
        });












        /**
         * change the system volume
         */
        //get the System max volume
        int maxVolume = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        seekBar.setMax(maxVolume);
        //get the System current Volume
        int currentVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);
        seekBar.setProgress(currentVolume);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    //set the system volume
                    am.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
                    int currentVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);
                    seekBar.setProgress(currentVolume);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


    }

    /**
     *
     * release the resource when destroy
     */
    @Override
    protected void onDestroy() {
        mediaPlayer.release();
        mediaPlayer = null;
        super.onDestroy();
    }



    /**
     *
     * Audio focus
     */







//    private class VolumeReceiver extends BroadcastReceiver {
//
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
//                int currentVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);
//                seekBar.setProgress(currentVolume);
//
//
//            }
//        }
//    }



}
