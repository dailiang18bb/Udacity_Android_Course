package com.example.android.miwok;

/**
 * Created by charles on 3/26/18.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private int mediaResource;

    /**
     * @param defaultText
     * @param miwokText
     * @param mediaRes
     */

    public Word(String defaultText, String miwokText, int mediaRes) {
        this.mDefaultTranslation = defaultText;
        this.mMiwokTranslation = miwokText;
        this.mediaResource = mediaRes;
    }

    /**
     * @param defaultText
     * @param miwokText
     * @param mImageSrc
     * @param mediaRes
     */
    public Word(String defaultText, String miwokText, int mImageSrc, int mediaRes) {
        this.mDefaultTranslation = defaultText;
        this.mMiwokTranslation = miwokText;
        this.mImage = mImageSrc;
        this.mediaResource = mediaRes;
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

    public boolean hasImage() {
        return mImage != NO_IMAGE;
    }

    public int getMediaResource() {
        return mediaResource;
    }
}


