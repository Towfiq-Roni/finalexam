package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.io.CharArrayReader;

public class LogInActivity extends AppCompatActivity {
    EditText studentID, Password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_activity);
        studentID = findViewById(R.id.StudentID);
        Password = findViewById(R.id.Password);
        loginBtn = findViewById(R.id.login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String StudentIDText = studentID.getText().toString();
                String PasswordText = Password.getText().charAt();
                if(PasswordText.charAt(4)="s"){
                    Intent intent = new Intent(LogInActivity.this,NextActivity.class);
                    startActivity(intent);
                }
                else{
                    View rootLayout = null;
                    Snackbar.make(rootLayout, "Login Failed! Please Enter your password again!", Snackbar.LENGTH_SHORT)

                            .setAction("Undo", new View.OnClickListener() {
                                @Override

                                public void onClick(View v) {

                                }

                            })

                            .show();
                }
            }
        });
    }
}