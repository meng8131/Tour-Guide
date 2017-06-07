package com.example.android.tourguide;

/**
 * Created by lyman on 2017/6/6.
 */

public class ResClass {

    //Restaurant Name
    private int mResName;
    //Open Time
    private int mResTime;
    //Res Flavor
    private int mResFlavor;
    //Res Recommendation
    private int mResStar;
    //Res Address
    private int mResAddress;
    //Res Logo
    private int mResLogoID;

    //Constructor with Name,Time,Description,LogoID
    public ResClass(int name, int time, int flavor, int star, int address, int logoID){
        mResName = name;
        mResTime = time;
        mResFlavor = flavor;
        mResStar = star;
        mResAddress = address;
        mResLogoID = logoID;
    }

    //Getter methods
    public int getResName(){
        return mResName;
    }
    public int getResTime(){
        return mResTime;
    }
    public int getResFlavor() { return mResFlavor; }
    public int getResStar(){return mResStar;}
    public int getResAddress(){return mResAddress;}
    public int getResLogoID(){return mResLogoID;}
}
