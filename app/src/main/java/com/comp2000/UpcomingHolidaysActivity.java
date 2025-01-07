package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class UpcomingHolidaysActivity extends Activity {

    // UI Components
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;
    private Button backButton;
    private Button signOutButton;

    private TextView titleUpcomingHolidays;
    private TextView startDate1;
    private TextView endDate1;
    private TextView startDate2;
    private TextView endDate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Dynamically load the layout
        String layoutName = "upcomingholidays";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        // Bind UI elements
        bindViews();

        setupUI();
    }

    // BINDING METHODS

    private void bindViews() {
        calendarButton = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton = findViewById(getViewIdByName("settings_button"));
        backButton = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));

        titleUpcomingHolidays = findViewById(getViewIdByName("title_upcoming_holidays"));
        startDate1 = findViewById(getViewIdByName("start_date_display_1"));
        endDate1 = findViewById(getViewIdByName("end_date_display_1"));
        startDate2 = findViewById(getViewIdByName("start_date_display_2"));
        endDate2 = findViewById(getViewIdByName("end_date_display_2"));
    }

    // HELPER METHODS

    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }

    private void setupUI() {

        if (titleUpcomingHolidays != null) {
            titleUpcomingHolidays.setText("Upcoming Holidays"); // default text
        }

        if (startDate1 != null) {
            startDate1.setText("01/01/2024"); // data
        }

        if (endDate1 != null) {
            endDate1.setText("05/01/2024"); //data
        }

        if (startDate2 != null) {
            startDate2.setText("15/03/2024"); //data
        }

        if (endDate2 != null) {
            endDate2.setText("20/03/2024"); //data
        }


        backButton.setOnClickListener(view -> finish());
    }
}

