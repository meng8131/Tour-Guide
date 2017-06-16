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

    static class ActHolder{
        TextView activityName;
        TextView activityTime;
        TextView activityDescription;
        ImageView activityLogo;
    }

    public ActArrayAdapter(Context context, List<ActClass> objects){
        super(context,0,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //define view holder to reduce usage of findViewByID
        ActHolder actHolder;

        //listActivityView is list_activities which is used to store customized activity layout
        View listActivityView = convertView;

        //initialize view holder
        if(listActivityView == null) {
            listActivityView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_activities, parent, false);

            actHolder = new ActHolder();
            actHolder.activityName = (TextView) listActivityView.findViewById(R.id.activity_name);
            actHolder.activityTime = (TextView) listActivityView.findViewById(R.id.activity_time);
            actHolder.activityDescription = (TextView) listActivityView.findViewById(R.id.activity_description);
            actHolder.activityLogo = (ImageView) listActivityView.findViewById(R.id.activity_logo);

            listActivityView.setTag(actHolder);
        } else {
            actHolder = (ActHolder) listActivityView.getTag();
        }

        //find the current activity to get its info with getter method and assign to convertView components
        //定位当前的Activity并用getter取得其值，然后赋给convertView响应的TextView和ImageView，以便进一步填充到ListView中进行展示
        ActClass currentActivity = getItem(position);

        actHolder.activityName.setText(currentActivity.getActivityName());
        actHolder.activityTime.setText(currentActivity.getActivityTime());
        actHolder.activityDescription.setText(currentActivity.getActivityDescription());
        actHolder.activityLogo.setImageResource(currentActivity.getActivityLogoID());

        //将重新赋值的convertView返回给ListView进行展示
        return listActivityView;
    }
}

