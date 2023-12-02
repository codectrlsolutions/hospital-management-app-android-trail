package com.example.hospitalmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ContactUsFragment extends Fragment {

    EditText editText_name,editText_email_address,editText_phone_number,editText_your_query_topic,
            editText_message;
    TextView textView_submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_us, container, false);

        editText_name = view.findViewById(R.id.editText_name);
        editText_email_address = view.findViewById(R.id.editText_email_address);
        editText_phone_number = view.findViewById(R.id.editText_phone_number);
        editText_your_query_topic = view.findViewById(R.id.editText_your_query_topic);
        editText_message = view.findViewById(R.id.editText_message);

        textView_submit = view.findViewById(R.id.textView_submit);

        textView_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkValidation();
            }
        });

        return view;
    }
    private void checkValidation() {
        String local_name,local_email_address,local_phone_number,local_your_query_topic,local_message;

        local_name = editText_name.getText().toString();
        local_email_address = editText_email_address.getText().toString();
        local_phone_number = editText_phone_number.getText().toString();
        local_your_query_topic = editText_your_query_topic.getText().toString();
        local_message = editText_message.getText().toString();


        if(local_name.isEmpty()){
            editText_name.setError("Empty");
        }else if(local_email_address.isEmpty()){
            editText_email_address.setError("Empty");
        }else if(local_phone_number.isEmpty()){
            editText_phone_number.setError("Empty");
        }else if(local_your_query_topic.isEmpty()){
            editText_your_query_topic.setError("Empty");
        }else if(local_message.isEmpty()){
            editText_message.setError("Empty");
        }else{
//            Intent intent = new Intent(getContext(), HomeActivity.class);
//            startActivity(intent);
            Toast.makeText(getContext(), "We will solve your problem as soon as possible", Toast.LENGTH_SHORT).show();
        }
    }
}