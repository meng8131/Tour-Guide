package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener onClickListenerJD = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JDMainActivity.class);
                startActivity(intent);
            }
        };
        TextView jiaDing = (TextView)findViewById(R.id.attraction_1);
        jiaDing.setOnClickListener(onClickListenerJD);

        View.OnClickListener onClickListenerRM = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RMMainActivity.class);
                startActivity(intent);
            }
        };
        TextView renMin = (TextView)findViewById(R.id.attraction_2);
        renMin.setOnClickListener(onClickListenerRM);

        View.OnClickListener onClickListenerNJ = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NJMainActivity.class);
                startActivity(intent);
            }
        };
        TextView nanJing = (TextView)findViewById(R.id.attraction_3);
        nanJing.setOnClickListener(onClickListenerNJ);

        View.OnClickListener onClickListenerXJ = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XJMainActivity.class);
                startActivity(intent);
            }
        };
        TextView xuJia = (TextView)findViewById(R.id.attraction_4);
        xuJia.setOnClickListener(onClickListenerXJ);

    }
}
