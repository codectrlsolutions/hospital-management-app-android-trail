package com.example.hospitalmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DoctorDetailsActivity extends AppCompatActivity {

    TextView textView_doctor_name,textView_doctor_specialization,textView_doctor_description,
            textView_doctor_service_description,textView_doctor_name_copy,textView_book_appointment;

    ImageView imageview_doctor_image;
    ImageView imageView_back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        textView_doctor_name = findViewById(R.id.textView_doctor_name);
        textView_doctor_specialization = findViewById(R.id.textView_doctor_specialization);
        textView_doctor_description = findViewById(R.id.textView_doctor_description);
        imageview_doctor_image = findViewById(R.id.imageview_doctor_image);
        textView_doctor_service_description = findViewById(R.id.textView_doctor_service_description);
        textView_doctor_name_copy = findViewById(R.id.textView_doctor_name_copy);

        imageView_back_arrow = findViewById(R.id.imageView_back_arrow);

        textView_book_appointment = findViewById(R.id.textView_book_appointment);


        imageView_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DoctorsActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        String doctor_name = intent.getStringExtra("doctor name");
        String doctor_specialization = intent.getStringExtra("doctor specialization");
        String doctor_description = intent.getStringExtra("doctor description");
        String doctor_services = intent.getStringExtra("doctor services");
        int doctor_image = intent.getIntExtra("doctor image",0);

        // display the string into textView
        textView_doctor_name.setText(doctor_name);
        textView_doctor_name_copy.setText(doctor_name);
        textView_doctor_specialization.setText(doctor_specialization);
        textView_doctor_description.setText(doctor_description);
        textView_doctor_service_description.setText(doctor_services);
        imageview_doctor_image.setImageResource(doctor_image);

        textView_book_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DoctorDetailsActivity.this,FormBookAppointmentActivity.class);
                startActivity(intent1);
            }
        });

    }
}