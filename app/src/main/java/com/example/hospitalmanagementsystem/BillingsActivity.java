package com.example.hospitalmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class BillingsActivity extends AppCompatActivity implements SelectListenerBilling{
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billings);

        recyclerView = findViewById(R.id.recyclerView);

        List<ItemsBilling> itemsBillings = BillingsData.getBillingsData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterItemsBilling(getApplicationContext(),itemsBillings,this));
    }

    @Override
    public void onItemClicked(ItemsBilling itemsBilling) {

    }
}