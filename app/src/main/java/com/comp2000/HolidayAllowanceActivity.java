package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates a holiday allowance screen
 */
public class HolidayAllowanceActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleHolidayAllowance;

    // Fields for allowances
    private EditText annualAllowanceDisplay;
    private EditText remainingAllowanceDisplay;

    // Buttons for holiday info
    private Button upcomingHolidaysButton;
    private Button previousHolidaysButton;
    private Button rejectedHolidayRequestsButton;
    private Button pendingHolidayRequestsButton;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "holidayallowance";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindTitle();
        bindAllowanceFields();
        bindHolidayInfoButtons();
        bindBottomBar();

        setupTopBarListeners();
        setupHolidayInfoListeners();
        setupBottomBarListeners();
    }

    // BINDING METHODS

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindTitle() {
        titleHolidayAllowance = findViewById(getViewIdByName("title_holiday_allowance"));
    }

    private void bindAllowanceFields() {
        annualAllowanceDisplay    = findViewById(getViewIdByName("annual_allowance_display"));
        remainingAllowanceDisplay = findViewById(getViewIdByName("remaining_allowance_display"));
    }

    private void bindHolidayInfoButtons() {
        upcomingHolidaysButton          = findViewById(getViewIdByName("upcoming_holidays_button"));
        previousHolidaysButton          = findViewById(getViewIdByName("previous_holidays_button"));
        rejectedHolidayRequestsButton   = findViewById(getViewIdByName("rejected_holiday_requests_button"));
        pendingHolidayRequestsButton    = findViewById(getViewIdByName("pending_holiday_requests_button"));
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

    private void setupHolidayInfoListeners() {
        upcomingHolidaysButton.setOnClickListener(v ->
                Toast.makeText(this, "Upcoming Holidays clicked!", Toast.LENGTH_SHORT).show()
        );

        previousHolidaysButton.setOnClickListener(v ->
                Toast.makeText(this, "Previous Holidays clicked!", Toast.LENGTH_SHORT).show()
        );

        rejectedHolidayRequestsButton.setOnClickListener(v ->
                Toast.makeText(this, "Rejected Holiday Requests clicked!", Toast.LENGTH_SHORT).show()
        );

        pendingHolidayRequestsButton.setOnClickListener(v ->
                Toast.makeText(this, "Pending Holiday Requests clicked!", Toast.LENGTH_SHORT).show()
        );
    }

    private void setupBottomBarListeners() {
        // Back button
        backButton.setOnClickListener(v -> {
            Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show();
        });

        // Sign out
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

