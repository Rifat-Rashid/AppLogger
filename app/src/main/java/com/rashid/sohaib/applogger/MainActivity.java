package com.rashid.sohaib.applogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgView = (ImageView) findViewById(R.id.imageView2);
        Picasso.with(this)
                .load("https://d1oglr07rm6q0i.cloudfront.net/a4f28210-0f5f-4b69-8e7c-3f3b46b6290c.large.jpg")
                .into(imgView);
    }
}
