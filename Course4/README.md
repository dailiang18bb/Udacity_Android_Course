# MediaPlayer
https://developer.android.com/guide/topics/media/mediaplayer.html

# SeekBar change volume
https://blog.csdn.net/a1533588867/article/details/53738027



    private AudioManager am;
    seekBar = findViewById(R.id.changeVolume);

    /**
         * change the system volume
         */
        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
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
# MediaPlayer Statement
https://developer.android.com/reference/android/media/MediaPlayer.html
![MeadiaPlayer](https://github.com/dailiang18bb/Udacity_Android_Course/blob/master/Course3/MediaPlayerState.png)
