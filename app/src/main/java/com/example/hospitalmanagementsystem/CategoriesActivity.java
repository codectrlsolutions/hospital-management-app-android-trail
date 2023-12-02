package com.example.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CategoriesActivity extends AppCompatActivity {
    ImageView imageView_back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        imageView_back_arrow = findViewById(R.id.imageView_back_arrow);

        imageView_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BookAppointmentActivity.class);
                startActivity(intent);
            }
        });
    }
}