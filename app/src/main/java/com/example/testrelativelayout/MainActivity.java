package com.example.testrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imgbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtn1=(ImageButton)findViewById(R.id.ImgBtn1);

        imgbtn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                    imgbtn1.setBackgroundResource(R.drawable.touched);
                else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                    imgbtn1.setBackgroundResource(R.drawable.untouched);
                return false;
            }
        });
    }
}