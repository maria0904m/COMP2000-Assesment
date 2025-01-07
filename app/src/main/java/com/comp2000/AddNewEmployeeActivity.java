package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddNewEmployeeActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleAddEmployee;

    // Form fields
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editId;
    private EditText editDateOfBirth;
    private EditText editRole;
    private EditText editSalary;
    private EditText editWorkingSince;

    // Buttons
    private Button deleteButton;
    private Button saveButton;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "activity_addnewemployee";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);


        bindTopBar();
        bindTitle();
        bindFormFields();
        bindActionButtons();
        bindBottomBar();

        // 3) Set up click listeners
        setupTopBarListeners();
        setupFormButtonListeners();
        setupBottomBarListeners();
    }

    /**
     * Binds the top bar buttons: calendar, notification, settings
     */
    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    /**
     * Binds the title text (e.g., "Add New Employee")
     */
    private void bindTitle() {
        titleAddEmployee = findViewById(getViewIdByName("title_add_employee"));
    }

    /**
     * Binds all the EditText fields in the main form
     */
    private void bindFormFields() {
        editFirstName     = findViewById(getViewIdByName("edit_first_name"));
        editLastName      = findViewById(getViewIdByName("edit_last_name"));
        editId            = findViewById(getViewIdByName("edit_id"));
        editDateOfBirth   = findViewById(getViewIdByName("edit_date_of_birth"));
        editRole          = findViewById(getViewIdByName("edit_role"));
        editSalary        = findViewById(getViewIdByName("edit_salary"));
        editWorkingSince  = findViewById(getViewIdByName("edit_working_since"));
    }

    /**
     * Binds the delete and save buttons
     */
    private void bindActionButtons() {
        deleteButton = findViewById(getViewIdByName("delete_button"));
        saveButton   = findViewById(getViewIdByName("save_button"));
    }

    /**
     * Binds the bottom bar buttons, back, sign out
     */
    private void bindBottomBar() {
        backButton   = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }


    // Setup Listeners

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
        // Delete
        deleteButton.setOnClickListener(v -> {
            Toast.makeText(this, "Delete clicked!", Toast.LENGTH_SHORT).show();
            // Clear the form or handle deletion logic
            clearFormFields();
        });

        // Save
        saveButton.setOnClickListener(v -> {
            // Gather data
            String firstName    = editFirstName.getText().toString().trim();
            String lastName     = editLastName.getText().toString().trim();
            String employeeId   = editId.getText().toString().trim();
            String dateOfBirth  = editDateOfBirth.getText().toString().trim();
            String role         = editRole.getText().toString().trim();
            String salary       = editSalary.getText().toString().trim();
            String workingSince = editWorkingSince.getText().toString().trim();

            // For demonstration
            Toast.makeText(this,
                    "Saving:\n"
                            + "First Name: " + firstName + "\n"
                            + "Last Name: " + lastName + "\n"
                            + "ID: " + employeeId + "\n"
                            + "DOB: " + dateOfBirth + "\n"
                            + "Role: " + role + "\n"
                            + "Salary: " + salary + "\n"
                            + "Working Since: " + workingSince,
                    Toast.LENGTH_LONG
            ).show();

        });
    }

    private void setupBottomBarListeners() {
        // Back
        backButton.setOnClickListener(v -> {
            Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show();

            finish();
        });

        // Sign Out
        signOutButton.setOnClickListener(v -> {
            Toast.makeText(this, "Sign Out clicked!", Toast.LENGTH_SHORT).show();
            //navigate to a login screen?
        });
    }

    // Helper Methods


    /**
     * Clears all form fields (delete button behavior example).
     */
    private void clearFormFields() {
        editFirstName.setText("");
        editLastName.setText("");
        editId.setText("");
        editDateOfBirth.setText("");
        editRole.setText("");
        editSalary.setText("");
        editWorkingSince.setText("");
    }

    /**
     * Dynamically gets a layout resource ID by name.
     */
    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    /**
     * Dynamically gets a view ID by name.
     */
    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}
