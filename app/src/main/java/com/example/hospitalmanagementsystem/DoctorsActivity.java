package com.example.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class DoctorsActivity extends AppCompatActivity implements SelectListener{

    RecyclerView recyclerView;
    ImageView imageView_back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);

        recyclerView = findViewById(R.id.recyclerView_doctors);
        imageView_back_arrow = findViewById(R.id.imageView_back_arrow);

        imageView_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BookAppointmentActivity.class);
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