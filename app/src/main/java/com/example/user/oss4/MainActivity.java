package com.example.user.oss4;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView ImageView;
    private int Before =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setIcon(R.drawable.ss);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Button button = (Button) findViewById(R.id.button);
        ImageView = (ImageView) findViewById(R.id.Image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Rotation(Before + 10);

            }

        });
    }
    public void Rotation(int i) {
        RotateAnimation ro = new RotateAnimation(
                Before,
                i,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        ro.setDuration(250);
        ro.setFillAfter(true);
        ImageView.startAnimation(ro);
        Before = i;
    }
}