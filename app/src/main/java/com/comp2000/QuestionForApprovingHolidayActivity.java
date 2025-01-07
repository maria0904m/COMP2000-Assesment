package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates a screen where the admin is asked to confirm authorizing a holiday,
 */
public class QuestionForApprovingHolidayActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Main confirmation content
    private TextView authorizeConfirmationMessage;
    private Button viewAgainButton;
    private Button confirmAuthorizeButton;

    // Bottom bar
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String layoutName = "questionforapprovingholiday";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindContentSection();
        bindBottomBar();

        setupTopBarListeners();
        setupContentListeners();
        setupBottomBarListener();
    }

    // BINDING METHODS
    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindContentSection() {
        authorizeConfirmationMessage = findViewById(getViewIdByName("authorize_confirmation_message"));
        viewAgainButton             = findViewById(getViewIdByName("view_again_button"));
        confirmAuthorizeButton      = findViewById(getViewIdByName("confirm_authorize_button"));
    }

    private void bindBottomBar() {
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

    private void setupContentListeners() {
        // View again
        viewAgainButton.setOnClickListener(v -> {
            Toast.makeText(this, "View holiday details again!", Toast.LENGTH_SHORT).show();
        });

        // Confirm Authorize
        confirmAuthorizeButton.setOnClickListener(v -> {
            Toast.makeText(this, "Holiday Authorized!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupBottomBarListener() {
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

