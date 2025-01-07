package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates a holiday requests screen
 */
public class HolidayRequestsPageActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleHolidayRequests;

    // Request buttons
    private Button viewRequest1;
    private Button viewRequest2;
    private Button viewRequest3;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "holidayrequestspage";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindTitle();
        bindRequestButtons();
        bindBottomBar();

        setupTopBarListeners();
        setupRequestButtonsListeners();
        setupBottomBarListeners();
    }

    // BINDING METHODS

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindTitle() {
        titleHolidayRequests = findViewById(getViewIdByName("title_holiday_requests"));
    }

    private void bindRequestButtons() {
        viewRequest1 = findViewById(getViewIdByName("view_request_1"));
        viewRequest2 = findViewById(getViewIdByName("view_request_2"));
        viewRequest3 = findViewById(getViewIdByName("view_request_3"));
    }

    private void bindBottomBar() {
        backButton   = findViewById(getViewIdByName("back_button"));
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

    private void setupRequestButtonsListeners() {
        viewRequest1.setOnClickListener(v ->
                Toast.makeText(this, "Viewing request 1...", Toast.LENGTH_SHORT).show()
        );

        viewRequest2.setOnClickListener(v ->
                Toast.makeText(this, "Viewing request 2...", Toast.LENGTH_SHORT).show()
        );

        viewRequest3.setOnClickListener(v ->
                Toast.makeText(this, "Viewing request 3...", Toast.LENGTH_SHORT).show()
        );
    }

    private void setupBottomBarListeners() {
        // Back
        backButton.setOnClickListener(v -> {
            Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show();

        });

        // Sign Out
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

