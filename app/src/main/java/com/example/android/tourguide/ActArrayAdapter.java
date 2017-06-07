package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lyman on 2017/6/5.
 */

public class ActArrayAdapter extends ArrayAdapter<ActClass> {

    public ActArrayAdapter(Context context, List<ActClass> objects){
        super(context,0,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //listActivityView is list_activities which is used to store customized activity layout
        View listActivityView = convertView;
        if(listActivityView == null) {
            listActivityView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_activities, parent, false);
        }

        //find the current activity to get its info with getter method and assign to convertView components
        //定位当前的Activity并用getter取得其值，然后赋给convertView响应的TextView和ImageView，以便进一步填充到ListView中进行展示
        ActClass currentActivity = getItem(position);

        TextView activityName = (TextView) listActivityView.findViewById(R.id.activity_name);
        activityName.setText(currentActivity.getActivityName());

        TextView activityTime = (TextView) listActivityView.findViewById(R.id.activity_time);
        activityTime.setText(currentActivity.getActivityTime());

        TextView activityDescription = (TextView) listActivityView.findViewById(R.id.activity_description);
        activityDescription.setText(currentActivity.getActivityDescription());

        ImageView activityLogo = (ImageView) listActivityView.findViewById(R.id.activity_logo);
        activityLogo.setImageResource(currentActivity.getActivityLogoID());

        //将重新赋值的convertView返回给ListView进行展示
        return listActivityView;
    }
}

