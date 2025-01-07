package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates a screen showing a successful holiday request,
 */
public class HolidayRequestedSuccessActivity extends Activity {

    // Top bar buttons
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Message box
    private TextView confirmationMessage;
    private Button goToMainButton;

    // Sign out button (bottom)
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "holidayrequestedsuccess";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindMessageBox();
        bindSignOutButton();

        setupTopBarListeners();
        setupMessageBoxListeners();
        setupSignOutListener();
    }


    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindMessageBox() {
        confirmationMessage = findViewById(getViewIdByName("confirmation_message"));
        goToMainButton      = findViewById(getViewIdByName("go_to_main_button"));
    }

    private void bindSignOutButton() {
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

    private void setupMessageBoxListeners() {
        goToMainButton.setOnClickListener(v -> {
            Toast.makeText(this, "Go to Main clicked!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupSignOutListener() {
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
