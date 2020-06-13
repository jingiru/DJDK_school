package com.example.djdk_school;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

    }

    public void moveToButtonSelect(View v)
    {

        EditText input_name = (EditText) findViewById((R.id.enter_name));
        String name_string = input_name.getText().toString();
        String password = "111111";

        if(name_string.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),"이름을 입력하세요",Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,25);
            toast.show();

        }
        else{
            String name_email;
            name_email = name_string + "@temp.com";

            mAuth.createUserWithEmailAndPassword(name_email, password)
                    .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(MainActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }

                            // ...
                        }
                    });


            Intent intent = new Intent(getApplicationContext(), ButtonSelect.class);
            intent.putExtra("입력한 이름",name_string);
            startActivity(intent);
        }

    }


}