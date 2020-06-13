package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class template11 extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template11);

        final EditText EditText_first = (EditText)findViewById(R.id.EditText_first);
        final EditText EditText_second = (EditText)findViewById(R.id.EditText_second);
        final EditText EditText_third = (EditText)findViewById(R.id.EditText_third);
        final EditText EditText_fourth = (EditText)findViewById(R.id.EditText_fourth);

        EditText_first.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                EditText_first.setTextSize(50);
                return false;
            }
        });
        EditText_second.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                EditText_second.setTextSize(50);
                return false;
            }
        });
        EditText_third.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                EditText_third.setTextSize(50);
                return false;
            }
        });
        EditText_fourth.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                EditText_fourth.setTextSize(50);
                return false;
            }
        });


    }

    public void backpress(View view) {
        onBackPressed();
    }
}