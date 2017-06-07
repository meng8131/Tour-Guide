package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lyman on 2017/6/5.
 */

//JD代表嘉定
//RM代表人民广场
//NJ代表南京西路
//XJ代表徐家汇

public class XJPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public XJPagerAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new XJActFragment();
        } else if (position == 1){
            return new XJHisFragment();
        } else {
            return new XJResFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.tab_name_1);
        } else if (position == 1){
            return mContext.getString(R.string.tab_name_2);
        } else {
            return mContext.getString(R.string.tab_name_3);
        }
    }
}
