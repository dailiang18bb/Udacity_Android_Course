package com.example.android.miwok;

/**
 * Created by charles on 3/26/18.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;


    public Word(String defaultText, String miwokText) {
        mDefaultTranslation = defaultText;
        mMiwokTranslation = miwokText;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
