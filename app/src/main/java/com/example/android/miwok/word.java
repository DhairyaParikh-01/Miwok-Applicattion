package com.example.android.miwok;

public class word{


    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int    mImageResourceId = NO_IMAGE_PROVIDED;
    private static  final  int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceid;


    public word (String defaultTranslation, String miwokTranslation, int audioResourceid)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceid = audioResourceid;
    }

    public word (String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceid = audioResourceId;
    }



    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId()
    {
        return  mAudioResourceid;
    }


    @Override
    public String toString() {
        return "word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceid=" + mAudioResourceid +
                '}';
    }
}
