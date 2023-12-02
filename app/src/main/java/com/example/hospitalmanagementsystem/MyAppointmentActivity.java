package com.example.hospitalmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class MyAppointmentActivity extends AppCompatActivity {

    ListView listView_myappointments;
    String full_name,phone_number,date,time,message,department,doctor_name,service;

    HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_appointment);

        listView_myappointments = findViewById(R.id.listView_myappointments);

        Intent intent = getIntent();

        if(intent != null){
            full_name = intent.getStringExtra("full_name");
            phone_number = intent.getStringExtra("phone_number");
            date = intent.getStringExtra("date");
            time = intent.getStringExtra("time");
            message = intent.getStringExtra("message");
            department = intent.getStringExtra("department");
            doctor_name = intent.getStringExtra("doctor_name");
            service = intent.getStringExtra("service");

            hashMap = new HashMap<String,String>();
            hashMap.put("full_name",full_name);
            hashMap.put("phone_number",phone_number);
            hashMap.put("date",date);
            hashMap.put("time",time);
            hashMap.put("message",message);
            hashMap.put("department",department);
            hashMap.put("doctor_name",doctor_name);
            hashMap.put("service",service);

            Params.values.add(hashMap);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(MyAppointmentActivity.this, Params.values,R.layout.items_my_appointment,
                new String[]{"full_name","phone_number","date","time","message","department","doctor_name","service"},
                new int[]{R.id.textView_patient_name,R.id.textView_phone_number,R.id.textView_date,R.id.textView_time,R.id.textView_message,R.id.textView_department,R.id.textView_doctor_name,R.id.textView_service});

        listView_myappointments.setAdapter(simpleAdapter);
    }
}