package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleSettings;

    // Notification Permissions
    private TextView notificationPermissionMessage;
    private Button noButton;
    private Button yesButton;

    // Sign out
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Dynamically load the layout
        String layoutName = "settings";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        // Bind UI elements
        bindTopBar();
        bindNotificationSection();
        bindSignOutButton();

        // Set up click listeners
        setupTopBarListeners();
        setupNotificationPermissionListeners();
        setupSignOutListener();
    }

    // BINDING METHODS

    private void bindTopBar() {
        calendarButton = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton = findViewById(getViewIdByName("settings_button"));
    }

    private void bindNotificationSection() {
        titleSettings = findViewById(getViewIdByName("title_settings"));
        notificationPermissionMessage = findViewById(getViewIdByName("notification_permission_message"));
        noButton = findViewById(getViewIdByName("no_button"));
        yesButton = findViewById(getViewIdByName("yes_button"));
    }

    private void bindSignOutButton() {
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }

    // LISTENER SETUP

    private void setupTopBarListeners() {
        // Calendar Button
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(this, "Calendar clicked!", Toast.LENGTH_SHORT).show();
            // Navigate to calendar activity
        });

        // Notifications Button
        notificationButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show();
            // Navigate to notifications activity
        });

        // Settings Button
        settingsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show();
            // Already in settings, could refresh the page or show a message
        });
    }

    private void setupNotificationPermissionListeners() {
        // No Button
        noButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications Disabled!", Toast.LENGTH_SHORT).show();
        });

        // Yes Button
        yesButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications Enabled!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupSignOutListener() {
        signOutButton.setOnClickListener(v -> {
            Toast.makeText(this, "Signing Out...", Toast.LENGTH_SHORT).show();
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
