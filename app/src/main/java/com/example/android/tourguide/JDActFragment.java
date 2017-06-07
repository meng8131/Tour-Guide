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
public class JDActFragment extends Fragment {

    //JD代表嘉定
    //RM代表人民广场
    //NJ代表南京西路
    //XJ代表徐家汇

    public JDActFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);

        ArrayList<ActClass> activity = new ArrayList<>();
        activity.add(new ActClass(R.string.jd_act_1_name,R.string.jd_act_1_time,R.string.jd_act_1_des,R.drawable.jd_act_1));
        activity.add(new ActClass(R.string.jd_act_2_name,R.string.jd_act_2_time,R.string.jd_act_2_des,R.drawable.jd_act_2));
        activity.add(new ActClass(R.string.jd_act_3_name,R.string.jd_act_3_time,R.string.jd_act_3_des,R.drawable.jd_act_3));

        ActArrayAdapter actArrayAdapter =new ActArrayAdapter(getActivity(), activity);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(actArrayAdapter);

        return rootView;
    }

}
