package com.example.regfire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView profileName, profileEmail, profileUsername, profilePassword, profileDOB;
    TextView titleName, titleUsername, titleDOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileName = findViewById(R.id.profileName);
        profileEmail = findViewById(R.id.profileEmail);
        profileUsername = findViewById(R.id.profileUsername);
        profilePassword = findViewById(R.id.profilePassword);
        profileDOB = findViewById(R.id.profileDOB); // Initialize the TextView for DOB
        titleName = findViewById(R.id.titleName);
        titleUsername = findViewById(R.id.titleUsername);
        titleDOB = findViewById(R.id.titleDOB); // Initialize the TextView for DOB

        showAllUserData();
    }

    public void showAllUserData() {
        Intent intent = getIntent();
        String nameUser = intent.getStringExtra("name");
        String emailUser = intent.getStringExtra("email");
        String usernameUser = intent.getStringExtra("username");
        String passwordUser = intent.getStringExtra("password");
        String dobUser = intent.getStringExtra("dob"); // Retrieve DOB from intent

        titleName.setText(nameUser);
        titleUsername.setText(usernameUser);
        profileName.setText(nameUser);
        profileEmail.setText(emailUser);
        profileUsername.setText(usernameUser);
        profilePassword.setText(passwordUser);
        profileDOB.setText(dobUser); // Set the retrieved DOB
    }
}
