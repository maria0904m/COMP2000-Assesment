package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates a screen indicating user preferences have been saved,
 */
public class PreferencesSavedActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Center box
    private TextView preferencesSavedMessage;
    private Button goToMainButton;

    // Sign Out button
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "preferencessaved";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        //Bind UI elements
        bindTopBar();
        bindCenterBox();
        bindSignOutButton();

        //Set up click listeners
        setupTopBarListeners();
        setupCenterBoxListeners();
        setupSignOutListener();
    }

    // BINDING METHODS
    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindCenterBox() {
        preferencesSavedMessage = findViewById(getViewIdByName("preferences_saved_message"));
        goToMainButton          = findViewById(getViewIdByName("go_to_main_button"));
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

    private void setupCenterBoxListeners() {
        //main button
        goToMainButton.setOnClickListener(v -> {
            Toast.makeText(this, "Going to main page!", Toast.LENGTH_SHORT).show();
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

