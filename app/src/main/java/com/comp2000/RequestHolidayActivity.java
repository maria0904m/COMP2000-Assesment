package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RequestHolidayActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleRequestHoliday;

    // Form fields
    private EditText startDateInput;
    private EditText endDateInput;
    private EditText numDaysInput;
    private EditText notesInput;
    private Button submitButton;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "requestholiday";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindTitle();
        bindFormFields();
        bindBottomBar();

        setupTopBarListeners();
        setupFormButtonListeners();
        setupBottomBarListeners();
    }

    // BINDING METHODS

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindTitle() {
        titleRequestHoliday = findViewById(getViewIdByName("title_request_holiday"));
    }

    private void bindFormFields() {
        startDateInput = findViewById(getViewIdByName("start_date_input"));
        endDateInput   = findViewById(getViewIdByName("end_date_input"));
        numDaysInput   = findViewById(getViewIdByName("num_days_input"));
        notesInput     = findViewById(getViewIdByName("notes_input"));
        submitButton   = findViewById(getViewIdByName("submit_button"));
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

    private void setupFormButtonListeners() {
        // Submit button
        submitButton.setOnClickListener(v -> {
            String startDate = startDateInput.getText().toString().trim();
            String endDate   = endDateInput.getText().toString().trim();
            String numDays   = numDaysInput.getText().toString().trim();
            String notes     = notesInput.getText().toString().trim();

            Toast.makeText(this,
                    "Requesting Holiday:\n" +
                            "Start: " + startDate + "\n" +
                            "End:   " + endDate   + "\n" +
                            "Days:  " + numDays   + "\n" +
                            "Notes: " + notes,
                    Toast.LENGTH_LONG
            ).show();
        });
    }

    private void setupBottomBarListeners() {
        // Back
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

