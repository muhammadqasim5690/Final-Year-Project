package com.example.numberplaterecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView txt_firstname,txt_lastname,txt_mobile,txt_password,txt_confirmpassword;
    EditText edit_firstname,edit_lastname,edit_mobile,edit_password,edit_confirmpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        this.setTitle("Sign Up");
       txt_firstname=findViewById(R.id.txt_firstname);
        txt_lastname=findViewById(R.id.txt_lastname);
        txt_mobile=findViewById(R.id.txt_mobile);
        txt_password=findViewById(R.id.txt_password);
        txt_confirmpassword=findViewById(R.id.txt_confirmpassword);
    }
}
