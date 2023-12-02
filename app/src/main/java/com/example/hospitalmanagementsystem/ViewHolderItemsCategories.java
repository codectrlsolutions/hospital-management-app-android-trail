package com.example.hospitalmanagementsystem;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderItemsCategories extends RecyclerView.ViewHolder {
    ImageView doctor_image;
    TextView doctor_name,doctor_specialization,doctor_description;

    RelativeLayout relativeLayout;
    public ViewHolderItemsCategories(@NonNull View itemView) {
        super(itemView);
        doctor_image = itemView.findViewById(R.id.imageview_doctor_image);
        doctor_name = itemView.findViewById(R.id.textView_doctor_name);
        doctor_specialization = itemView.findViewById(R.id.textView_doctor_specialization);
        doctor_description = itemView.findViewById(R.id.textView_doctor_description);

        relativeLayout = itemView.findViewById(R.id.relativeLayout_item);
    }
}
