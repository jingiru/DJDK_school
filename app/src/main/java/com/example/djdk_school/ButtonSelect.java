package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;

public class ButtonSelect extends AppCompatActivity {

    public String name_trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_select);

        Intent intent_title = getIntent();
        name_trans = intent_title.getStringExtra("입력한 이름");
        //String name = "이끔이: " + intent_title.getStringExtra("입력한 이름") + ", 모둠원 수: 4명";

    }

    public void moveToGroupCreate(View v)
    {
        Intent intent = new Intent(this, GroupCreate.class);
        intent.putExtra("이름 전달",name_trans);
        startActivity(intent);
    }

    public void moveToQRGenerator(View v)
    {
        Intent intent = new Intent(this, Group_qr_generator.class);
        startActivity(intent);
    }

    public void moveToGuidebook(View v)
    {
        Intent intent = new Intent(this, Guidebook.class);
        startActivity(intent);
    }


    public void moveToSettings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
