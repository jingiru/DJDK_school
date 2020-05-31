package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GroupCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_create);

        TextView title = (TextView)findViewById(R.id.name_title);
        Intent end_title = getIntent();
        String title_name;
        title_name = "이끔이: " + end_title.getStringExtra("이름 전달") + ", 모둠원 수: 4명";
        title.setText(String.valueOf(title_name));

    }

    public void backpress(View v)
    {
        onBackPressed();
    }

    public void moveToMake(View view) {
        Intent intent = new Intent(this, make_templet_select.class);
        startActivity(intent);
    }
}
