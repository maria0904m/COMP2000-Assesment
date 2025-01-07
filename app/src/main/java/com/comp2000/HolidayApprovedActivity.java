package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HolidayApprovedActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Main content
    private TextView authorizedMessage;
    private Button goToMainButton;

    // Bottom bar
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "holidayapproved";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindContentSection();
        bindBottomBar();

        setupTopBarListeners();
        setupContentListeners();
        setupBottomBarListener();
    }

    // BINDING METHODS

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindContentSection() {
        authorizedMessage = findViewById(getViewIdByName("authorized_message"));
        goToMainButton    = findViewById(getViewIdByName("go_to_main_button"));
    }

    private void bindBottomBar() {
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }

    // LISTENER SETUP

    private void setupTopBarListeners() {
        // Calendar
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(this, "Calendar clicked!", Toast.LENGTH_SHORT).show();
        });

        // Notifications
        notificationButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show();
        });

        // Settings
        settingsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupContentListeners() {
        goToMainButton.setOnClickListener(v -> {
            Toast.makeText(this, "Going to main page!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupBottomBarListener() {
        // Sign Out
        signOutButton.setOnClickListener(v -> {
            Toast.makeText(this, "Sign Out clicked!", Toast.LENGTH_SHORT).show();
            // Possibly navigate to a login screen
        });
    }

    // HELPER METHODS


    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}

