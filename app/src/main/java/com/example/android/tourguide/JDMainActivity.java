package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class JDMainActivity extends AppCompatActivity {
    //JD代表嘉定
    //RM代表人民广场
    //NJ代表南京西路
    //XJ代表徐家汇

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jd);

        //locate view pager
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager_jd);
        //construct pager adapter
        JDPagerAdapter actAdapter = new JDPagerAdapter(this, getSupportFragmentManager());
        //set pager adapter
        viewPager.setAdapter(actAdapter);

        //locate TabLayout
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_jd);
        //setup TabLayout with view pager
        tabLayout.setupWithViewPager(viewPager);

    }

}
