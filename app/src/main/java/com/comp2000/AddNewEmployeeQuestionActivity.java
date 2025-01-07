package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates a confirmation screen ("add newmployee") where the user can
 * continue editing or confirm the addition of a new employee.
 */
public class AddNewEmployeeQuestionActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleConfirmEmployee;

    // Confirmation box
    private TextView confirmationMessage;
    private Button continueEditingButton;
    private Button confirmButton;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "activity_addnewemployeequestion";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindConfirmationBox();
        bindBottomBar();

        // Set up click listeners
        setupTopBarListeners();
        setupConfirmationListeners();
        setupBottomBarListeners();
    }

    // -------------------------------------------------
    // BINDING METHODS
    // -------------------------------------------------

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));

        titleConfirmEmployee = findViewById(getViewIdByName("title_confirm_employee"));
    }

    private void bindConfirmationBox() {
        confirmationMessage    = findViewById(getViewIdByName("confirmation_message"));
        continueEditingButton  = findViewById(getViewIdByName("continue_editing_button"));
        confirmButton          = findViewById(getViewIdByName("confirm_button"));
    }

    private void bindBottomBar() {
        backButton   = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }

    // LISTENER SETUP
    private void setupTopBarListeners() {
        // Calendar
        calendarButton.setOnClickListener(v ->
                Toast.makeText(this, "Calendar clicked!", Toast.LENGTH_SHORT).show()
        );

        // Notifications
        notificationButton.setOnClickListener(v ->
                Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show()
        );

        // Settings
        settingsButton.setOnClickListener(v ->
                Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show()
        );
    }

    private void setupConfirmationListeners() {
        // Continue editing / no
        continueEditingButton.setOnClickListener(v -> {
            Toast.makeText(this, "Continue Editing clicked!", Toast.LENGTH_SHORT).show();

        });

        // Confirm / yes
        confirmButton.setOnClickListener(v -> {
            Toast.makeText(this, "Employee details confirmed!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupBottomBarListeners() {
        // Back
        backButton.setOnClickListener(v -> {
            Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show();
            finish();
        });

        // Sign out
        signOutButton.setOnClickListener(v -> {
            Toast.makeText(this, "Sign Out clicked!", Toast.LENGTH_SHORT).show();
            //navigate to a login screen
        });
    }


    // HELPER METHODS


    /**
     * Dynamically get a layout resource ID by name.
     */
    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    /**
     * Dynamically get a view ID by name
     */
    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}
