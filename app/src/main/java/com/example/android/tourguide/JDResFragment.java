package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

//JD代表嘉定
//RM代表人民广场
//NJ代表南京西路
//XJ代表徐家汇

public class JDResFragment extends Fragment {


    public JDResFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);

        ArrayList<ResClass> activity = new ArrayList<>();
        activity.add(new ResClass(R.string.jd_res_1_name,R.string.jd_res_1_time,R.string.jd_res_1_flavor,R.string.jd_res_1_star,R.string.jd_res_1_address,R.drawable.jd_res_1));
        activity.add(new ResClass(R.string.jd_res_2_name,R.string.jd_res_2_time,R.string.jd_res_2_flavor,R.string.jd_res_2_star,R.string.jd_res_2_address,R.drawable.jd_res_2));
        activity.add(new ResClass(R.string.jd_res_3_name,R.string.jd_res_2_time,R.string.jd_res_3_flavor,R.string.jd_res_3_star,R.string.jd_res_3_address,R.drawable.jd_res_3));

        ResArrayAdapter resArrayAdapter =new ResArrayAdapter(getActivity(), activity);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(resArrayAdapter);

        return rootView;
    }

}
