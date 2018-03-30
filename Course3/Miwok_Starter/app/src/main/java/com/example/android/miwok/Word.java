package com.example.android.miwok;

import android.graphics.Color;
import android.support.constraint.solver.widgets.Rectangle;

/**
 * Created by charles on 3/26/18.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage = NO_IMAGE;
    private static final int NO_IMAGE = -1;


    public Word(String defaultText, String miwokText) {
        mDefaultTranslation = defaultText;
        mMiwokTranslation = miwokText;
    }

    /**
     * @param defaultText
     * @param miwokText
     * @param mImageSrc
     */

    public Word(String defaultText, String miwokText, int mImageSrc) {
        this.mDefaultTranslation = defaultText;
        this.mMiwokTranslation = miwokText;
        this.mImage = mImageSrc;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImage() {
        return mImage;
    }

    public boolean hasImage(){
        return mImage != NO_IMAGE;
    }
}


