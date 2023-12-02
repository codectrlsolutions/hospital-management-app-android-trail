package com.example.hospitalmanagementsystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItemsBilling extends RecyclerView.Adapter<ViewHolderItemsBilling> {
    Context context;
    List<ItemsBilling> items;
    SelectListenerBilling selectListenerBilling;

    public AdapterItemsBilling(Context context, List<ItemsBilling> items, SelectListenerBilling selectListenerBilling) {
        this.context = context;
        this.items = items;
        this.selectListenerBilling = selectListenerBilling;
    }

    @NonNull
    @Override
    public ViewHolderItemsBilling onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderItemsBilling(LayoutInflater.from(context).inflate(R.layout.items_billing,
                parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderItemsBilling holder, int position) {
        holder.textView_patient_name.setText(items.get(position).getPatient_name());
        holder.textView_billings_details.setText(items.get(position).getBilling_details());
        holder.textView_insurance_information.setText(items.get(position).getInsurance_information());
        holder.textView_payment_information.setText(items.get(position).getInsurance_information());
        holder.textView_payment_method.setText(items.get(position).getPayment_method());
        holder.textView_payment_status.setText(items.get(position).getPayment_status());
        holder.textView_general_reports.setText(items.get(position).getGeneral_reports());
        holder.textView_discount_and_promotions.setText(items.get(position).getDiscounts_and_promotions());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectListenerBilling.onItemClicked(items.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
