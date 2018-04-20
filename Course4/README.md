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
https://www.youtube.com/watch?v=XQwe30cZffg
![MeadiaPlayer](https://github.com/dailiang18bb/Udacity_Android_Course/blob/master/Course4/MediaPlayerState.png)
![MeadiaPlayer2](https://github.com/dailiang18bb/Udacity_Android_Course/blob/master/Course4/mediaplayer_state_diagram.gif)


# SetOnItemClickListener
http://www.jb51.net/article/77792.htm  
当listview中包含button，checkbox等控件的时候，android会默认将focus给了这些控件，也就是说listview的item根本就获取不到focus，所以导致onitemclick时间不能触发。
1. 在checkbox、button对应的view处加android:focusable=”false” 

        android:clickable=”false” 
        android:focusableInTouchMode=”false” 
2.在item最外层添加属性 android:descendantFocusability=”blocksDescendants”
    
# toString()
`CMD + N`->`toString()`->`Log.v("NumbersActivity", "Current word: " + word);`
create toString() to debug
