package com.example.djdk_school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class make_templet_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_templet_select);

        final ImageView tablev00 = (ImageView) findViewById(R.id.tablev00);
        final ImageView tablev01 = (ImageView) findViewById(R.id.tablev01);
        final ImageView tablev10 = (ImageView) findViewById(R.id.tablev10);
        final ImageView tablev11 = (ImageView) findViewById(R.id.tablev11);
        final ImageView tablev20 = (ImageView) findViewById(R.id.tablev20);
        final ImageView tablev21 = (ImageView) findViewById(R.id.tablev21);

        tablev00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(make_templet_select.this, template00.class);
                startActivity(intent);
            }
        });

        tablev01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(make_templet_select.this, template01.class);
                startActivity(intent);
            }
        });


        tablev10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(make_templet_select.this, template10.class);
                startActivity(intent);
            }
        });
        tablev11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(make_templet_select.this, template11.class);
                startActivity(intent);
            }
        });


        tablev20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(make_templet_select.this, template20.class);
                startActivity(intent);
            }
        });

        tablev21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(make_templet_select.this, template21.class);
                startActivity(intent);
            }
        });
    }

    public void backpress(View view) {
        onBackPressed();
    }
}