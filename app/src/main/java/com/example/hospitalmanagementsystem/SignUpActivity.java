package com.example.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText name,date_of_birth,phone_number,email,password,confirm_password;
    TextView signup,signin;
    Spinner gender_category;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.editText_fullName);
        date_of_birth = findViewById(R.id.editText_date_of_birth);
        phone_number = findViewById(R.id.editText_phone_number);
        email = findViewById(R.id.editText_email_address);
        password = findViewById(R.id.editText_password);
        confirm_password = findViewById(R.id.editText_confirm_password);
        gender_category = findViewById(R.id.spinner_gender);
        signup = findViewById(R.id.textView_btn_signup);
        signin = findViewById(R.id.textView_btn_signin);

        name.setText("ccs");
        date_of_birth.setText("21-01-2000");
        phone_number.setText("9988776655");
        email.setText("abcd@gmail.com");
        password.setText("abcd1234");
        confirm_password.setText("abcd1234");

        String[] items = new String[]{"Select Gender","Male","Female","Other"};
        gender_category.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items));
        gender_category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gender = gender_category.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkValidation();
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }

    private void checkValidation() {
        String local_name,local_date_of_birth,local_phone_number,local_email,local_password,
                local_confirm_password,local_gender;

        local_name = name.getText().toString();
        local_date_of_birth = date_of_birth.getText().toString();
        local_phone_number = phone_number.getText().toString();
        local_email = email.getText().toString();
        local_password = password.getText().toString();
        local_confirm_password = confirm_password.getText().toString();
        local_gender = gender;

        if(local_name.isEmpty()){
            name.setError("Empty");
        }else if(local_date_of_birth.isEmpty()){
            date_of_birth.setError("Empty");
        }else if(local_phone_number.isEmpty()){
            phone_number.setError("Empty");
        }else if(local_email.isEmpty()){
            email.setError("Empty");
        }else if(local_password.isEmpty()){
            password.setError("Empty");
        }else if(local_confirm_password.isEmpty()){
            confirm_password.setError("Empty");
        }else if(local_gender.equals("Select Gender")){
            Toast.makeText(this, "please select category", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
            startActivity(intent);
        }
    }
}