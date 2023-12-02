package com.example.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ForgotPasswordActivity extends AppCompatActivity {
    EditText editText_email_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        editText_email_address = findViewById(R.id.editText_email_address);

        editText_email_address.setText("ccs@gmail.com");
    }
}