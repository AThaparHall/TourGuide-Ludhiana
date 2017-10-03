package com.example.android.tourguide_ludhiana;

/**
 * Created by Avneet on 2017-08-07.
 */

public class Word {

    /**
     * Constant value that represents no image was provided for this object
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Restaurant Name */
    private String mName;
    /** Phone Number */
    private String mPhone;
    /** Timings */
    private String mTimings;
    /** Info */
    private String mInfo;
    /**
     * Image resource ID
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Address */
    private String mAddress;

    /** Create a new Word Object */
    public Word(String name, String phone, String timings, String info, String address){
        mName = name;
        mPhone = phone;
        mTimings = timings;
        mInfo = info;
        mAddress = address;
    }

    /**
     * Create a new Word object
     */
    public Word(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }

    /** Get the information necessary for each item*/

    public String getName() { return mName; }

    public String getPhone(){return mPhone; }

    public String getTimings() {return mTimings; }

    public String getInfo() {return mInfo; }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this object.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
