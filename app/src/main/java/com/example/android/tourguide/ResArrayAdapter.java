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
 * Created by lyman on 2017/6/6.
 */

public class ResArrayAdapter extends ArrayAdapter<ResClass>{
    public ResArrayAdapter(Context context, List<ResClass> objects){
        super(context,0,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //listActivityView is list_activities which is used to store customized activity layout
        View listActivityView = convertView;
        if(listActivityView == null) {
            listActivityView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_restaurant, parent, false);
        }

        //find the current activity to get its info with getter method and assign to convertView components
        //定位当前的Activity并用getter取得其值，然后赋给convertView响应的TextView和ImageView，以便进一步填充到ListView中进行展示
        ResClass currentActivity = getItem(position);

        TextView activityName = (TextView) listActivityView.findViewById(R.id.restaurant_name);
        activityName.setText(currentActivity.getResName());

        TextView activityTime = (TextView) listActivityView.findViewById(R.id.restaurant_time);
        activityTime.setText(currentActivity.getResTime());

        TextView activityDescription = (TextView) listActivityView.findViewById(R.id.restaurant_flavor);
        activityDescription.setText(currentActivity.getResFlavor());

        TextView activityStar = (TextView) listActivityView.findViewById(R.id.restaurant_star);
        activityStar.setText(currentActivity.getResStar());

        TextView activityAddress = (TextView) listActivityView.findViewById(R.id.restaurant_address);
        activityAddress.setText(currentActivity.getResAddress());

        ImageView activityLogo = (ImageView) listActivityView.findViewById(R.id.restaurant_logo);
        activityLogo.setImageResource(currentActivity.getResLogoID());

        //将重新赋值的convertView返回给ListView进行展示
        return listActivityView;
    }
}
