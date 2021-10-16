
package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private int mAudResId;

    private int mIconImage = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudResId = AudioResourceId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mIconImage = ImageResourceId;
        mAudResId = AudioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImageResourceId(){return mIconImage;}


    public boolean hasImage(){
        return mIconImage!= NO_IMAGE_PROVIDED;
    }

    public int getAudResId(){return mAudResId;}
}
