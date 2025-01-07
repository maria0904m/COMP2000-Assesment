package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewHolidayPageActivity extends Activity {

    private Button calendarButton, notificationButton, settingsButton, backButton, signOutButton;
    private Button declineButton, acceptButton;
    private TextView viewStartDate, viewEndDate, viewFirstName, viewLastName, viewHolidayAllowance, viewRemainingAllowance, viewNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view dynamically
        setContentView(getResources().getIdentifier("viewholidaypage", "layout", getPackageName()));

        // Initialize UI components
        initializeUIComponents();

        // Set up button listeners
        setupButtonListeners();
    }

    private void initializeUIComponents() {
        calendarButton = findViewById(getResources().getIdentifier("calendar_button", "id", getPackageName()));
        notificationButton = findViewById(getResources().getIdentifier("notification_button", "id", getPackageName()));
        settingsButton = findViewById(getResources().getIdentifier("settings_button", "id", getPackageName()));
        backButton = findViewById(getResources().getIdentifier("back_button", "id", getPackageName()));
        signOutButton = findViewById(getResources().getIdentifier("sign_out_button", "id", getPackageName()));
        declineButton = findViewById(getResources().getIdentifier("decline_button", "id", getPackageName()));
        acceptButton = findViewById(getResources().getIdentifier("accept_button", "id", getPackageName()));

        viewStartDate = findViewById(getResources().getIdentifier("view_start_date", "id", getPackageName()));
        viewEndDate = findViewById(getResources().getIdentifier("view_end_date", "id", getPackageName()));
        viewFirstName = findViewById(getResources().getIdentifier("view_first_name", "id", getPackageName()));
        viewLastName = findViewById(getResources().getIdentifier("view_last_name", "id", getPackageName()));
        viewHolidayAllowance = findViewById(getResources().getIdentifier("view_holiday_allowance", "id", getPackageName()));
        viewRemainingAllowance = findViewById(getResources().getIdentifier("view_remaining_allowance", "id", getPackageName()));
        viewNotes = findViewById(getResources().getIdentifier("view_notes", "id", getPackageName()));
    }

    private void setupButtonListeners() {
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(ViewHolidayPageActivity.this, "Calendar clicked", Toast.LENGTH_SHORT).show();
            // Navigate to Calendar activity
        });

        notificationButton.setOnClickListener(v -> {
            Toast.makeText(ViewHolidayPageActivity.this, "Notifications clicked", Toast.LENGTH_SHORT).show();
            // Navigate to Notifications activity
        });

        settingsButton.setOnClickListener(v -> {
            Toast.makeText(ViewHolidayPageActivity.this, "Settings clicked", Toast.LENGTH_SHORT).show();
            // Navigate to Settings activity
        });

        backButton.setOnClickListener(v -> {
            Toast.makeText(ViewHolidayPageActivity.this, "Back clicked", Toast.LENGTH_SHORT).show();
            finish();
        });

        signOutButton.setOnClickListener(v -> {
            Toast.makeText(ViewHolidayPageActivity.this, "Signed out", Toast.LENGTH_SHORT).show();
            finish();
        });

        declineButton.setOnClickListener(v -> {
            Toast.makeText(ViewHolidayPageActivity.this, "Holiday request declined", Toast.LENGTH_SHORT).show();
        });

        acceptButton.setOnClickListener(v -> {
            Toast.makeText(ViewHolidayPageActivity.this, "Holiday request accepted", Toast.LENGTH_SHORT).show();
        });
    }
}
