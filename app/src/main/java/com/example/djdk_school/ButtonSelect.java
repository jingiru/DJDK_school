package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_select);
    }

    public void moveToGuidebook(View v)
    {
        Intent intent = new Intent(this, Guidebook.class);
        startActivity(intent);
    }

}
