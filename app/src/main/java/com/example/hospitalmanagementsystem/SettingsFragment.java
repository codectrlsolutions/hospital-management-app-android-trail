package com.example.hospitalmanagementsystem;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SettingsFragment extends Fragment {

    CardView cardView_notification,cardView_privacy_policy,cardView_terms_and_conditions,cardView_about_us,
            cardView_logout,cardView_change_language;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        cardView_notification = view.findViewById(R.id.cardView_notification);
        cardView_privacy_policy = view.findViewById(R.id.cardView_privacy_policy);
        cardView_terms_and_conditions = view.findViewById(R.id.cardView_terms_and_conditions);
        cardView_about_us = view.findViewById(R.id.cardView_about_us);
        cardView_change_language = view.findViewById(R.id.cardView_change_language);
        cardView_logout = view.findViewById(R.id.cardView_logout);

        cardView_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), NotificationSettingsActivity.class);
                startActivity(intent);
            }
        });

        cardView_privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),PrivacyPolicyActivity.class);
                startActivity(intent);
            }
        });

        cardView_terms_and_conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), TermsAndConditionsActivity.class);
                startActivity(intent);
            }
        });

        cardView_about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AboutUsActivity.class);
                startActivity(intent);
            }
        });

        cardView_change_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LanguageSettingsActivity.class);
                startActivity(intent);
            }
        });

        cardView_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SignInActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}