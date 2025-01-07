package com.comp2000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewEditApprovalActivity extends Activity {

    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;
    private Button noButton;
    private Button yesButton;
    private Button backButton;
    private Button signOutButton;
    private TextView confirmationTitle;
    private TextView confirmationMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getResources().getIdentifier("vieweditapproval", "layout", getPackageName()));

        // Initialize UI components using resource IDs
        calendarButton = findViewById(getResources().getIdentifier("calendar_button", "id", getPackageName()));
        notificationButton = findViewById(getResources().getIdentifier("notification_button", "id", getPackageName()));
        settingsButton = findViewById(getResources().getIdentifier("settings_button", "id", getPackageName()));
        noButton = findViewById(getResources().getIdentifier("no_button", "id", getPackageName()));
        yesButton = findViewById(getResources().getIdentifier("yes_button", "id", getPackageName()));
        backButton = findViewById(getResources().getIdentifier("back_button", "id", getPackageName()));
        signOutButton = findViewById(getResources().getIdentifier("sign_out_button", "id", getPackageName()));
        confirmationTitle = findViewById(getResources().getIdentifier("confirmation_title", "id", getPackageName()));
        confirmationMessage = findViewById(getResources().getIdentifier("confirmation_message", "id", getPackageName()));

        // Set up click listeners for buttons
        setupButtonListeners();
    }

    private void setupButtonListeners() {
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to calendar activity
                Toast.makeText(ViewEditApprovalActivity.this, "Calendar button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to notifications
                Toast.makeText(ViewEditApprovalActivity.this, "Notifications button clicked", Toast.LENGTH_SHORT).show();
                // startActivity(new Intent(ViewEditApprovalActivity.this, NotificationsActivity.class));
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to settings
                Toast.makeText(ViewEditApprovalActivity.this, "Settings button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewEditApprovalActivity.this, "No button clicked", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Yes button clicked
                Toast.makeText(ViewEditApprovalActivity.this, "Yes button clicked", Toast.LENGTH_SHORT).show();
              }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Back button clicked
                Toast.makeText(ViewEditApprovalActivity.this, "Back button clicked", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sign out button clicked
                Toast.makeText(ViewEditApprovalActivity.this, "Sign out button clicked", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
