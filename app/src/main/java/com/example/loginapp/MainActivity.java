package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    static TextView email_txt;
    static TextView password_txt;
    static boolean isAllFieldsChecked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MaterialButton signinbtn = (MaterialButton) findViewById(R.id.signin_btn);


        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email_txt = findViewById(R.id.email);
                password_txt= findViewById(R.id.password);

                if(email_txt.getText().toString().equals("beril_test@mail.com")&&password_txt.getText().toString().equals("123456789")){
                    Toast.makeText(MainActivity.this, "SIGNIN SUCCESSFUL", Toast.LENGTH_SHORT).show();

                }
                else{
                    isAllFieldsChecked = CheckAllFields();
                    Toast.makeText(MainActivity.this, "INCORRECT EMAIL OR PASSWORD!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean CheckAllFields() {
        if (email_txt.length() == 0 && password_txt.length() == 0) {
            email_txt.setError("Email is required");
            password_txt.setError("Password is required");
            return false;
        }
        else if (email_txt.length() == 0 ) {
            email_txt.setError("Email is required");
            return false;
        }

        else if (password_txt.length() == 0) {
            password_txt.setError("Password is required");
            return false;
        }

        else if (password_txt.length() < 8) {
            password_txt.setError("Password must be minimum 8 characters");
            return false;
        }

        return true;
    }


}