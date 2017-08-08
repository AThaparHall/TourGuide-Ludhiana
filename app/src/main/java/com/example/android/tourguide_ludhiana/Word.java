package com.example.android.tourguide_ludhiana;

import android.location.Address;

/**
 * Created by Avneet on 2017-08-07.
 */

public class Word {

    /** Restaurant Name */
    private String mName;

    /** Phone Number */
    private String mPhone;

    /** Timings */
    private String mTimings;

    /** Info */
    private String mInfo;

    private String mAddress;

    /** Create a new Word Object */
    public Word(String name, String phone, String timings, String info, String address){
        mName = name;
        mPhone = phone;
        mTimings = timings;
        mInfo = info;
        mAddress = address;
    }

    /** Get the information necessary for each item*/

    public String getName() { return mName; }

    public String getPhone(){return mPhone; }

    public String getTimings() {return mTimings; }

    public String getInfo() {return mInfo; }

    public String getAddress() {return mAddress; }

}
