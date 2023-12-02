package com.example.hospitalmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAppointmentActivity extends AppCompatActivity implements SelectListener{

    RecyclerView recyclerView;

    TextView see_all_categories,see_all_doctors,bookAppointment;

    ImageView imageView_back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_appointment);

        recyclerView = findViewById(R.id.recyclerView_categories);
        see_all_categories = findViewById(R.id.textView_seeAll_categories);
        see_all_doctors = findViewById(R.id.textView_seeAll_doctors);
        bookAppointment = findViewById(R.id.textView_bookAppointment);
        imageView_back_arrow = findViewById(R.id.imageView_back_arrow);

        imageView_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        bookAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookAppointmentActivity.this, FormBookAppointmentActivity.class);
                startActivity(intent);
            }
        });

        see_all_categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookAppointmentActivity.this, CategoriesActivity.class);
                startActivity(intent);
            }
        });

        see_all_doctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookAppointmentActivity.this, DoctorsActivity.class);
                startActivity(intent);
            }
        });

        List<ItemsCategories> items = Constants.getDoctorsData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterItemsCategories(getApplicationContext(),items,this));
    }

    @Override
    public void onItemClicked(ItemsCategories itemsCategories) {
        Intent intent = new Intent(getApplicationContext(), DoctorDetailsActivity.class);
        intent.putExtra("doctor name",itemsCategories.getDoctor_name().toString());
        intent.putExtra("doctor specialization",itemsCategories.getDoctor_specialization().toString());
        intent.putExtra("doctor description",itemsCategories.getDoctor_description().toString());
        intent.putExtra("doctor services",itemsCategories.getDoctor_services().toString());
        intent.putExtra("doctor image",itemsCategories.getDoctor_image());
        startActivity(intent);
    }
}