package com.example.hospitalmanagementsystem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView_person_image;
    private CardView cardView_personal_information,cardView_change_password,cardView_notifications,
            cardView_upcoming_appointments,cardView_medical_information,cardView_emergency_contact,
            cardView_insurance_information,cardView_appointment_history,cardView_health_records,
            cardView_billing_information,cardView_logOut;
    private static final int CAMERA_REQUEST_CODE = 1;
    private static final int GALLERY_REQUEST_CODE = 1;

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView_person_image = findViewById(R.id.imageView_person_image);
        cardView_personal_information = findViewById(R.id.cardView_personal_information);
        cardView_change_password = findViewById(R.id.cardView_change_password);
        cardView_notifications = findViewById(R.id.cardView_notifications);
        cardView_upcoming_appointments = findViewById(R.id.cardView_upcoming_appointments);
        cardView_medical_information = findViewById(R.id.cardView_medical_information);
        cardView_emergency_contact = findViewById(R.id.cardView_emergency_contact);
        cardView_insurance_information = findViewById(R.id.cardView_insurance_information);
        cardView_appointment_history = findViewById(R.id.cardView_appointment_history);
        cardView_health_records = findViewById(R.id.cardView_health_records);
        cardView_billing_information = findViewById(R.id.cardView_billing_information);
        cardView_logOut = findViewById(R.id.cardView_logOut);

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_message_dialog_1);
        dialog.setCancelable(false);

        TextView textView_Gallery = dialog.findViewById(R.id.textView_Gallery);
        TextView textView_Camera = dialog.findViewById(R.id.textView_Camera);

        textView_Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent,GALLERY_REQUEST_CODE);
            }
        });

        textView_Camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_REQUEST_CODE);
            }
        });

        imageView_person_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == GALLERY_REQUEST_CODE && resultCode == RESULT_OK){
            assert data != null;
//            imageView_person_image.setImageURI(data.getData());
//            dialog.dismiss();
            Bitmap bitmap = (Bitmap)(data.getExtras().get("data"));
            imageView_person_image.setImageBitmap(bitmap);
            dialog.dismiss();
        }
        if(requestCode == CAMERA_REQUEST_CODE && resultCode == RESULT_OK){
            Bitmap bitmap = (Bitmap)(data.getExtras().get("data"));
            imageView_person_image.setImageBitmap(bitmap);
            dialog.dismiss();
        }
    }
}