package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void moveToButtonSelect(View v)
    {

        EditText input_name = (EditText) findViewById((R.id.enter_name));
        String name_string = input_name.getText().toString();

        if(name_string.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),"이름을 입력하세요",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,25);
            toast.show();

        }
        else{
            Intent intent = new Intent(getApplicationContext(), ButtonSelect.class);
            intent.putExtra("입력한 이름",name_string);
            startActivity(intent);
        }

    }


}