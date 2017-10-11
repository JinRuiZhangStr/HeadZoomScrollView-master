package com.mrw.headzoomscrollview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.iv);
        DampView damp= (DampView) findViewById(R.id.dzsv);

        damp.setImageView(iv);
        Glide.with(this).load("http://seopic.699pic.com/photo/50008/2836.jpg_wh1200.jpg").into(iv);
    }

}
