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

# LifeCycle
https://stackoverflow.com/questions/8515936/android-activity-life-cycle-what-are-all-these-methods-for/8516056#8516056  
release the resources in the onStop()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity","onDestroy");
    }

# Audio Focus
Media Playback talk at BABBQ: https://www.youtube.com/watch?v=XQwe30cZffg  
AudioManager: https://developer.android.com/reference/android/media/AudioManager.html?utm_campaign=adp_series_audiofocus_011316&utm_source=medium&utm_medium=blog  

    AudioManager.OnAudioFocusChangeListener afChangeListener = new AudioManager.OnAudioFocusChangeListener() {
                    public void onAudioFocusChange(int focusChange) {
                        if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) {
                            // Pause playback because your Audio Focus was
                            // temporarily stolen, but will be back soon.
                            // i.e. for a phone call
                        } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                            // Stop playback, because you lost the Audio Focus.
                            // i.e. the user started some other playback app
                            // Remember to unregister your controls/buttons here.
                            // And release the kra — Audio Focus!
                            // You’re done.
                            am.abandonAudioFocus(afChangeListener);
                        } else if (focusChange ==
                                AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                            // Lower the volume, because something else is also
                            // playing audio over you.
                            // i.e. for notifications or navigation directions
                            // Depending on your audio playback, you may prefer to
                            // pause playback here instead. You do you.
                        } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                            // Resume playback, because you hold the Audio Focus
                            // again!
                            // i.e. the phone call ended or the nav directions
                            // are finished
                            // If you implement ducking and lower the volume, be
                            // sure to return it to normal here, as well.
                        }
                    }
                };


# Click ripple animation
Touch feedback provides the user with instantaneous visual confirmation at the point of contact where they interacted with the UI elements on the screen. It is vital that the apps you develop on Android have touch feedback. They can make your app appear fast and responsive, even if nothing else happens yet.  

https://guides.codepath.com/android/ripple-animation
https://classroom.udacity.com/courses/ud853/lessons/1623168625/concepts/16358494290923

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/category_numbers">

        <TextView
            android:id="@+id/numbers"
            style="@style/CategoryStyle"
            android:background="?android:attr/selectableItemBackground"
            android:text="@string/category_numbers" />
    </FrameLayout>


OPTION #2  
Instead of adding a new view to the layout, in the word list layout, you can add the attribute android:drawSelectorOnTop="true" on the ListView XML element. With this one line change, the pressed state will be shown on each list item.  
In word_list.xml:

    <?xml version="1.0" encoding="utf-8"?>
    <ListView xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/list"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:drawSelectorOnTop="true"/>

# Up Button
All screens in your app that are not the main entrance to your app (the "home" screen) should offer the user a way to navigate to the logical parent screen in the app's hierarchy by pressing the Up button in the action bar. This lesson shows you how to properly implement this behavior.  
https://developer.android.com/training/implementing-navigation/ancestral?utm_source=udacity&utm_medium=course&utm_campaign=android_basics#java

    <activity
            android:name=".PhrasesActivity"
            android:label="@string/category_phrases"
            android:parentActivityName=".MainActivity">
            <!-- Parent activity meta-data to support 4.0(API level 15) and lower -->
            <meta-data
                android:name="android.support.PARENT_ACTIVITY"
                android:value=".MainActivity" />
        </activity>

# Tab layout and Android pattern

https://www.youtube.com/watch?v=zQekzaAgIlQ  
https://www.youtube.com/playlist?list=PLWz5rJ2EKKc-lJo_RGGXL2Psr8vVCTWjM  

# View pager

view_pager.xml

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context="com.example.android.miwok.MainActivity">

        <android.support.v4.view.ViewPager
            android:id="@+id/viewpager"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
    </LinearLayout>

MainActivity.java

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Set the content of the activity to use the activity_main.xml layout file
            setContentView(R.layout.view_pager);

            ViewPager viewPager = findViewById(R.id.viewpager);

            MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());

            viewPager.setAdapter(myFragmentPagerAdapter);
            }
    }
    
MyFragmentPagerAdapter.java

    public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new NumbersFragment();
            } else if (position == 1) {
                return new FamilyFragment();
            } else if (position == 2) {
                return new ColorsFragment();
            } else {
                return new PhrasesFragment();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
    
    
# Android Design Support Library

https://android-developers.googleblog.com/2015/05/android-design-support-library.html?utm_source=udacity&utm_medium=course&utm_campaign=android_basics

* Navigation View
* Floating labels for editing text
* Floating Action Button
* Snackbar
* Tabs
* CoordinatorLayout, motion, and scrolling
* CoordinatorLayout and floating action buttons
* CoordinatorLayout and the app bar
* Collapsing Toolbars
* CoordinatorLayout and custom views

