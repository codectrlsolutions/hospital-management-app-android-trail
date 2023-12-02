package com.example.hospitalmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormBookAppointmentActivity extends AppCompatActivity {

    Spinner department_category, doctors_category, service_category;
    EditText editText_fullName, editText_phone_number, editText_date, editText_time, editText_message;
    TextView textView_add_appointment;
    String department, doctor, service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_book_appointment);

        department_category = findViewById(R.id.spinner_select_department);
        doctors_category = findViewById(R.id.spinner_select_doctors);
        service_category = findViewById(R.id.spinner_select_service);

        editText_fullName = findViewById(R.id.editText_fullName);
        editText_phone_number = findViewById(R.id.editText_phone_number);
        editText_date = findViewById(R.id.editText_date);
        editText_time = findViewById(R.id.editText_time);
        editText_message = findViewById(R.id.editText_message);


        textView_add_appointment = findViewById(R.id.textView_add_appointment);

        String[] items_department = new String[]{"Select Department", "General Practitioners", "Surgeons", "Emergency Medicine Physicians",
                "Anesthesiologists", "Radiologists", "Pathologists", "Ophthalmologists", "ENT (Ear, Nose, and Throat) Specialists",
                "Dentists", "Physiotherapists", "Cardiologist", "Dermatologist", "Neurologist"};
        department_category.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items_department));
        department_category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                department = department_category.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        String[] items_doctors = new String[]{"Select Doctor", "John wick", "Robert j", "James Gunn", "Ricky tales",
                "Micky mose", "Pick War"};
        doctors_category.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items_doctors));
        doctors_category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                doctor = doctors_category.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        String[] items_services = new String[]{"Select Service", "General Checkup", "body checkup", "operation"};
        service_category.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items_services));
        service_category.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                service = service_category.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        textView_add_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkValidation();
            }
        });

    }

    private void checkValidation() {
        String local_full_name, local_phone_number, local_date, local_time, local_message, local_department,
                local_service, local_doctor_name;

        local_full_name = editText_fullName.getText().toString();
        local_phone_number = editText_phone_number.getText().toString();
        local_date = editText_date.getText().toString();
        local_time = editText_time.getText().toString();
        local_message = editText_message.getText().toString();
        local_department = department;
        local_service = service;
        local_doctor_name = doctor;
        if (local_department.isEmpty() || local_department.equals("Select Department")) {
            Toast.makeText(this, "Please select the Department", Toast.LENGTH_SHORT).show();
        } else if (local_doctor_name.isEmpty() || local_doctor_name.equals("Select Doctor")) {
            Toast.makeText(this, "Please select the doctor", Toast.LENGTH_SHORT).show();
        } else if (local_service.isEmpty() || local_service.equals("Select Service")) {
            Toast.makeText(this, "Please select the service", Toast.LENGTH_SHORT).show();
        } else if (local_full_name.isEmpty()) {
            editText_fullName.setError("Empty");
        } else if (local_full_name.length() < 6) {
            editText_fullName.setError("Patient name required");
        } else if (local_phone_number.isEmpty()) {
            editText_phone_number.setError("Empty");
        } else if (local_phone_number.length() != 10) {
            editText_phone_number.setError("phone number 10 digits required");
        } else if (local_date.isEmpty()) {
            editText_date.setError("Empty");
        } else if (local_time.isEmpty()) {
            editText_time.setError("Empty");
        } else if (local_message.isEmpty()) {
            editText_message.setError("Empty");
        } else {
            Intent intent = new Intent(getApplicationContext(), MyAppointmentActivity.class);
            intent.putExtra("full_name", editText_fullName.getText().toString());
            intent.putExtra("phone_number", editText_phone_number.getText().toString());
            intent.putExtra("date", editText_date.getText().toString());
            intent.putExtra("time", editText_time.getText().toString());
            intent.putExtra("message", editText_message.getText().toString());
            intent.putExtra("department", department);
            intent.putExtra("doctor_name", doctor);
            intent.putExtra("service", service);
            startActivity(intent);
        }
    }
}
    //    private boolean checkFullName() {
//        if(editText_fullName.getText().toString().isEmpty()){
//            editText_fullName.setError("Empty");
//            return false;
//        }
//        if(editText_fullName.getText().toString().length() < 6){
//            editText_fullName.setError("Minimum length required");
//            return false;
//        }
//        return true;
//    }
//
//    private boolean checkPhoneNumber() {
//        if(editText_phone_number.getText().toString().isEmpty()){
//            editText_phone_number.setError("Empty");
//            return false;
//        }
////        if(editText_phone_number.getText().toString().length() != 10){
////            editText_phone_number.setError("10 numbers required");
////            return false;
////        }
//        return true;
//    }
//    private boolean checkDoctorName() {
//        if(doctor.isEmpty() || doctor.equals("Select Doctor")){
//            Toast.makeText(this, "Please select the doctor", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        return true;
//    }
//
//    private boolean checkService() {
//        if(service.isEmpty() || service.equals("Select Service")){
//            Toast.makeText(this, "Please select the service", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        return true;
//    }
//
//    private boolean checkDepartment() {
//        if(service.isEmpty() || service.equals("Select Department")){
//            Toast.makeText(this, "Please select the Department", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        return true;
//    }
//
//    private boolean checkMessage() {
//        return true;
//    }
//    private boolean checkTime() {
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(editText_time.getText().toString());
//            LocalDate date = LocalDate.parse("HH:mm", formatter);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    private boolean checkDate() {
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(editText_date.getText().toString());
//            LocalDate date = LocalDate.parse("dd-MM-yyyy", formatter);
//            return true;
//        } else {
//            return false;
//        }
//    }

//    private boolean checkPhoneNumberPattern(String str) {
//        // Creating a Pattern class object
//        Pattern pattern = Pattern.compile("^[0-9]{10}");
//
//        // Pattern class contains matcher() method
//        // to find matching between given number
//        // and regular expression for which
//        // object of Matcher class is created
//        Matcher m = pattern.matcher(str);
//
//        // Returning boolean value
//        return (m.matches());
//
//    }
