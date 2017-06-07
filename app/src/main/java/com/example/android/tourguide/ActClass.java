package com.example.android.tourguide;

/**
 * Created by lyman on 2017/6/5.
 */

//This class is shared bt both activities and historic sites

public class ActClass {

    //Activity Name
    private int mActivityName;
    //Activity Time
    private int mActivityTime;
    //Activity Description
    private int mActivityDescription;
    //Activity Logo
    private int mActivityLogoID;

    //Constructor with Name,Time,Description,LogoID
    public ActClass(int name, int time, int description, int logoID){
        mActivityName = name;
        mActivityTime = time;
        mActivityDescription = description;
        mActivityLogoID = logoID;
    }

    //Getter methods
    public int getActivityName(){
        return mActivityName;
    }
    public int getActivityTime(){
        return mActivityTime;
    }
    public int getActivityDescription(){
        return mActivityDescription;
    }
    public int getActivityLogoID(){
        return mActivityLogoID;
    }

}
