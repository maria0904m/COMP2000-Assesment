package com.comp2000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ViewEditEmployeeActivity extends Activity {

    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;
    private Button backButton;
    private Button signOutButton;
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editHolidayAllowance;
    private EditText editRemainingAllowance;
    private EditText editRole;
    private EditText editSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Manually set content view
        setContentView(getResources().getIdentifier("vieweditemployee", "layout", getPackageName()));

        // Initialize UI components
        calendarButton = findViewById(getResources().getIdentifier("calendar_button", "id", getPackageName()));
        notificationButton = findViewById(getResources().getIdentifier("notification_button", "id", getPackageName()));
        settingsButton = findViewById(getResources().getIdentifier("settings_button", "id", getPackageName()));
        backButton = findViewById(getResources().getIdentifier("back_button", "id", getPackageName()));
        signOutButton = findViewById(getResources().getIdentifier("sign_out_button", "id", getPackageName()));
        editFirstName = findViewById(getResources().getIdentifier("edit_first_name", "id", getPackageName()));
        editLastName = findViewById(getResources().getIdentifier("edit_last_name", "id", getPackageName()));
        editHolidayAllowance = findViewById(getResources().getIdentifier("edit_holiday_allowance", "id", getPackageName()));
        editRemainingAllowance = findViewById(getResources().getIdentifier("edit_remaining_allowance", "id", getPackageName()));
        editRole = findViewById(getResources().getIdentifier("edit_role", "id", getPackageName()));
        editSalary = findViewById(getResources().getIdentifier("edit_salary", "id", getPackageName()));

        // Set up click listeners for buttons
        setupButtonListeners();
    }

    private void setupButtonListeners() {
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to calendar activity
                Toast.makeText(ViewEditEmployeeActivity.this, "Calendar button clicked", Toast.LENGTH_SHORT).show();
              }
        });

        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to notifications
                Toast.makeText(ViewEditEmployeeActivity.this, "Notifications button clicked", Toast.LENGTH_SHORT).show();
                }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to settings
                Toast.makeText(ViewEditEmployeeActivity.this, "Settings button clicked", Toast.LENGTH_SHORT).show();
               }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back
                Toast.makeText(ViewEditEmployeeActivity.this, "Back button clicked", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sign out
                Toast.makeText(ViewEditEmployeeActivity.this, "Sign out button clicked", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}

