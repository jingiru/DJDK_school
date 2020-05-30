package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GroupCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_create);

        TextView title = (TextView)findViewById(R.id.name_title);
        Intent intent_title = getIntent();

        String name = "이끔이: " + intent_title.getStringExtra("입력한 이름") + ", 모둠원 수: 4명";

        title.setText(String.valueOf(name));


    }
}
