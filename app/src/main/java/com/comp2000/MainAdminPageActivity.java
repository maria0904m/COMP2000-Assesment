package com.comp2000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainAdminPageActivity extends Activity {

    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;
    private TextView welcomeMessage;
    private ScrollView employeeListScrollView;
    private LinearLayout employeeListContainer;
    private Button holidayRequestsButton;
    private Button addEmployeeButton;
    private Button backButton;
    private Button signOutButton;
    private Button employee1ViewIcon;
    private Button employee2ViewIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "activity_mainadminpage";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        calendarButton = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton = findViewById(getViewIdByName("settings_button"));
        welcomeMessage = findViewById(getViewIdByName("welcome_message"));
        employeeListScrollView = findViewById(getViewIdByName("employee_list_scrollview"));
        employeeListContainer = findViewById(getViewIdByName("employee_list_container"));
        holidayRequestsButton = findViewById(getViewIdByName("holiday_requests_button"));
        addEmployeeButton = findViewById(getViewIdByName("add_employee_button"));
        backButton = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
        employee1ViewIcon = findViewById(getViewIdByName("view_button_1"));
        employee2ViewIcon = findViewById(getViewIdByName("view_button_2"));

        setupButtons();
        setupViewIcons();
    }

    private void setupButtons() {
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(this, "Calendar clicked!", Toast.LENGTH_SHORT).show();
        });

        notificationButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show();
        });

        settingsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show();
        });

        holidayRequestsButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, HolidayRequestsPageActivity.class);
            startActivity(intent);
        });

        addEmployeeButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddNewEmployeeActivity.class);
            startActivity(intent);
        });

        backButton.setOnClickListener(v -> finish()); // Close current activity

        signOutButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }

    // Set up click listeners for the employee view icons
    private void setupViewIcons() {
        employee1ViewIcon.setOnClickListener(v -> {
            Intent intent = new Intent(this, ViewEditEmployeeActivity.class);
            intent.putExtra("employee_id", 1);
            startActivity(intent);
        });

        employee2ViewIcon.setOnClickListener(v -> {
            Intent intent = new Intent(this, ViewEditEmployeeActivity.class);
            intent.putExtra("employee_id", 2);
            startActivity(intent);
        });
    }

    // Dynamically get a layout resource ID by name
    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    // Dynamically get a view ID by name
    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}
