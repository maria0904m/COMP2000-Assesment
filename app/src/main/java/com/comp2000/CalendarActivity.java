package com.comp2000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;


public class CalendarActivity extends Activity {

    // Top bar buttons
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Month selection buttons and text view
    private Button backwardButton;
    private TextView currentMonth;
    private Button forwardButton;

    // Calendar view
    private CalendarView calendarView;

    // Bottom bar buttons
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String layoutName = "activity_calendar";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);


        bindTopBar();
        bindMonthSelection();
        bindCalendarView();
        bindBottomBar();


        setupTopBarListeners();
        setupMonthSelectionListeners();
        setupBottomBarListeners();

        // Add date change listener for calendar
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            Toast.makeText(this,
                    "Selected: " + (month + 1) + "/" + dayOfMonth + "/" + year,
                    Toast.LENGTH_SHORT
            ).show();
        });
    }

    // BINDING METHODS

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindMonthSelection() {
        backwardButton = findViewById(getViewIdByName("backward_button"));
        currentMonth   = findViewById(getViewIdByName("current_month"));
        forwardButton  = findViewById(getViewIdByName("forward_button"));
    }

    private void bindCalendarView() {
        calendarView = findViewById(getViewIdByName("calendar_view"));
    }

    private void bindBottomBar() {
        backButton   = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }


    // LISTENERS (Button click listeners)


    private void setupTopBarListeners() {
        // Calendar button (do nothing if already on the calendar page)
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(this, "Calendar clicked again!", Toast.LENGTH_SHORT).show();
        });

        // Notification button
        notificationButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, NotificationActivity.class);
            startActivity(intent);
        });

        // Settings button
        settingsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        });
    }

    private void setupMonthSelectionListeners() {

        backwardButton.setOnClickListener(v -> {
            Toast.makeText(this, "Backward month clicked!", Toast.LENGTH_SHORT).show();

        });


        forwardButton.setOnClickListener(v -> {
            Toast.makeText(this, "Forward month clicked!", Toast.LENGTH_SHORT).show();

        });
    }

    private void setupBottomBarListeners() {
        // Back button (return to previous activity or screen)
        backButton.setOnClickListener(v -> {
            Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show();
            // Return to the previous screen or finish activity
            finish();
        });

        // Sign out button
        signOutButton.setOnClickListener(v -> {
            Toast.makeText(this, "Sign Out clicked!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
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

