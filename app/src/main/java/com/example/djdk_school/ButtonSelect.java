package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
        Intent intent = new Intent(this, Group_qr_reader.class);
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
