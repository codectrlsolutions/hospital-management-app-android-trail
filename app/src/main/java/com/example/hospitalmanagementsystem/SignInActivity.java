package com.example.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class SignInActivity extends AppCompatActivity {

    private EditText editText_email_address,editText_password;
    private TextView textView_forgot_password,textView_btn_signin,textView_btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        editText_email_address = findViewById(R.id.editText_email_address);
        editText_password = findViewById(R.id.editText_password);
        textView_btn_signin = findViewById(R.id.textView_btn_signin);
        textView_forgot_password = findViewById(R.id.textView_forgot_password);
        textView_btn_signup = findViewById(R.id.textView_btn_signup);

        editText_email_address.setText("ccs@gmail.com");
        editText_password.setText("abcd1234");

        textView_forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        textView_btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String local_email = Objects.requireNonNull(editText_email_address.getText()).toString();
                String local_password = Objects.requireNonNull(editText_password.getText()).toString();

                if(local_email.isEmpty()){
                    editText_email_address.setError("Empty");
                } else if (local_password.isEmpty()) {
                    editText_password.setError("Empty");
                } else if (local_password.length() <8) {
                    editText_password.setError("Minimum length required");
                }else {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
                }
            }
        });

        textView_btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}