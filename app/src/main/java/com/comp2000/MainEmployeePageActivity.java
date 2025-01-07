package com.comp2000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainEmployeePageActivity extends Activity {

    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;
    private Button requestHolidayButton;
    private Button viewRemainingHolidaysButton;
    private Button viewEditDetailsButton;
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "activity_mainemployeepage";
        int layoutId = getResources().getIdentifier(layoutName, "layout", getPackageName());
        if (layoutId != 0) {
            setContentView(layoutId);
        } else {
            Toast.makeText(this, "Layout not found", Toast.LENGTH_SHORT).show();
            return;
        }

        // Initialize buttons by finding their IDs directly
        calendarButton = findViewById(getResources().getIdentifier("calendar_button", "id", getPackageName()));
        notificationButton = findViewById(getResources().getIdentifier("notification_button", "id", getPackageName()));
        settingsButton = findViewById(getResources().getIdentifier("settings_button", "id", getPackageName()));
        requestHolidayButton = findViewById(getResources().getIdentifier("request_holiday_button", "id", getPackageName()));
        viewRemainingHolidaysButton = findViewById(getResources().getIdentifier("view_remaining_holidays_button", "id", getPackageName()));
        viewEditDetailsButton = findViewById(getResources().getIdentifier("view_edit_details_button", "id", getPackageName()));
        backButton = findViewById(getResources().getIdentifier("back_button", "id", getPackageName()));
        signOutButton = findViewById(getResources().getIdentifier("sign_out_button", "id", getPackageName()));

        // Setup listeners for button clicks
        setupButtonListeners();
    }

    // Method to set up listeners for all buttons
    private void setupButtonListeners() {
        calendarButton.setOnClickListener(v -> navigateToActivity("CalendarActivity"));
        notificationButton.setOnClickListener(v -> navigateToActivity("NotificationActivity"));
        settingsButton.setOnClickListener(v -> navigateToActivity("SettingsActivity"));
        requestHolidayButton.setOnClickListener(v -> navigateToActivity("HolidayRequestsPageActivity"));
        viewRemainingHolidaysButton.setOnClickListener(v -> navigateToActivity("HolidayAllowanceActivity"));
        viewEditDetailsButton.setOnClickListener(v -> navigateToActivity("EditDetailsActivity"));
        backButton.setOnClickListener(v -> finish());  // Close the current activity
        signOutButton.setOnClickListener(v -> navigateToActivity("LoginActivity"));  // Sign out and go to login
    }

    // Method to navigate to an activity based on its class name
    private void navigateToActivity(String activityClassName) {
        try {
            // Get the class of the target activity dynamically
            Class<?> activityClass = Class.forName("com.comp2000." + activityClassName);
            Intent intent = new Intent(MainEmployeePageActivity.this, activityClass);
            startActivity(intent);  // Start the activity
        } catch (ClassNotFoundException e) {
            // If the class is not found, show an error
            Toast.makeText(this, "Error navigating to " + activityClassName, Toast.LENGTH_SHORT).show();
        }
    }
}
