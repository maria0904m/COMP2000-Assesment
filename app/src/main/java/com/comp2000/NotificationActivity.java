package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates a notifications screen
 */
public class NotificationActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleNotifications;

    // Notification examples
    private TextView notificationMessage1;
    private CheckBox seenCheckbox1;
    private TextView notificationMessage2;
    private CheckBox seenCheckbox2;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "notification";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        // 2) Bind UI elements
        bindTopBar();
        bindTitle();
        bindNotificationExamples();
        bindBottomBar();

        // 3) Set up click listeners
        setupTopBarListeners();
        setupNotificationCheckListeners();
        setupBottomBarListeners();
    }

    // BINDING METHODS

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindTitle() {
        titleNotifications = findViewById(getViewIdByName("title_notifications"));
    }

    private void bindNotificationExamples() {
        notificationMessage1 = findViewById(getViewIdByName("notification_message_1"));
        seenCheckbox1        = findViewById(getViewIdByName("seen_checkbox_1"));
        notificationMessage2 = findViewById(getViewIdByName("notification_message_2"));
        seenCheckbox2        = findViewById(getViewIdByName("seen_checkbox_2"));
    }

    private void bindBottomBar() {
        backButton   = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }

    // LISTENER SETUP

    private void setupTopBarListeners() {
        // Calendar button
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(this, "Calendar clicked!", Toast.LENGTH_SHORT).show();
        });

        // Notifications button
        notificationButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show();
        });

        // Settings button
        settingsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupNotificationCheckListeners() {
        seenCheckbox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Notification 1 marked as seen.", Toast.LENGTH_SHORT).show();
            }
        });

        seenCheckbox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Notification 2 marked as seen.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setupBottomBarListeners() {
        // Back button
        backButton.setOnClickListener(v -> {
            Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show();
        });

        // Sign out button
        signOutButton.setOnClickListener(v -> {
            Toast.makeText(this, "Sign Out clicked!", Toast.LENGTH_SHORT).show();
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

