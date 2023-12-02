package com.example.hospitalmanagementsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItemsCategories extends RecyclerView.Adapter<ViewHolderItemsCategories>{

    Context context;
    List<ItemsCategories> items;

    SelectListener selectListener;

    public AdapterItemsCategories(Context context, List<ItemsCategories> items,SelectListener selectListener) {
        this.context = context;
        this.items = items;
        this.selectListener = selectListener;
    }

    @NonNull
    @Override
    public ViewHolderItemsCategories onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderItemsCategories(LayoutInflater.from(context).inflate(R.layout.items_categories,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderItemsCategories holder, int position) {
        holder.doctor_name.setText(items.get(position).getDoctor_name());
        holder.doctor_specialization.setText(items.get(position).getDoctor_specialization());
        holder.doctor_image.setImageResource(items.get(position).getDoctor_image());
        holder.doctor_description.setText(items.get(position).getDoctor_description());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectListener.onItemClicked(items.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
