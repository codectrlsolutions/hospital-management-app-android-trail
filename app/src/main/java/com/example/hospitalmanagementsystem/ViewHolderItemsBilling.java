package com.example.hospitalmanagementsystem;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderItemsBilling extends RecyclerView.ViewHolder {
    TextView textView_patient_name,textView_billings_details,textView_insurance_information,
            textView_payment_information,textView_payment_method,textView_payment_status,
            textView_general_reports,textView_discount_and_promotions;
    CardView cardView;
    public ViewHolderItemsBilling(@NonNull View itemView) {
        super(itemView);
        textView_patient_name = itemView.findViewById(R.id.textView_patient_name);
        textView_billings_details = itemView.findViewById(R.id.textView_billings_details);
        textView_insurance_information = itemView.findViewById(R.id.textView_insurance_information);
        textView_payment_information = itemView.findViewById(R.id.textView_payment_information);
        textView_payment_method = itemView.findViewById(R.id.textView_payment_method);
        textView_payment_status = itemView.findViewById(R.id.textView_payment_status);
        textView_general_reports = itemView.findViewById(R.id.textView_general_reports);
        textView_discount_and_promotions = itemView.findViewById(R.id.textView_discount_and_promotions);

        cardView = itemView.findViewById(R.id.cardView);

    }
}
