package com.example.profile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {


    ImageView imgProfile;
    TextView txtName, txtEmail;
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgProfile = findViewById(R.id.imgProfile);
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        btnEdit = findViewById(R.id.btnEdit);


        txtName.setText("مهدی مرادی");
        txtEmail.setText("mhdi.mrd@email.com");

        btnEdit.setOnClickListener(v -> {
            Toast.makeText(this, "ویرایش پروفایل به‌زودی!", Toast.LENGTH_SHORT).show();
        });
    }
}