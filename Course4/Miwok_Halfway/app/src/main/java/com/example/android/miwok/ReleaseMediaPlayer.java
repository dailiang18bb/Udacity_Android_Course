package com.example.android.miwok;

import android.media.MediaPlayer;
import android.util.Log;

public class ReleaseMediaPlayer {

    public static MediaPlayer mMediaPlayer;

    public static void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
            Log.v("Media Player", "your Media Player has been released");
        }
    }
}
