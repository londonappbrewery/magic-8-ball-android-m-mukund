package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView Ball;
        final int[] ballimages={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        Button ask;
        ask=(Button)findViewById(R.id.askbutton);
        Ball=(ImageView)findViewById(R.id.ball);
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random generator= new Random();
                int val= generator.nextInt(5);
                Ball.setImageResource(ballimages[val]);
            }
        });
    }
}
