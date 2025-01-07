package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates editing employee details without
 */
public class EditEmployeeDetailsActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleEditEmployee;

    // Fields
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editId;
    private EditText editDateOfBirth;
    private EditText editRole;
    private EditText editSalary;
    private EditText editHolidayAllowance;
    private EditText editSalaryIncrement;
    private EditText editHireDate;

    // Discard/Save
    private Button discardChangesButton;
    private Button saveChangesButton;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String layoutName = "activity_editemployeedetails";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindTitle();
        bindEmployeeFields();
        bindDiscardSaveButtons();
        bindBottomBar();


        setupTopBarListeners();
        setupDiscardSaveListeners();
        setupBottomBarListeners();
    }


    // BINDING METHODS

    private void bindTopBar() {
        calendarButton     = findViewById(getViewIdByName("calendar_button"));
        notificationButton = findViewById(getViewIdByName("notification_button"));
        settingsButton     = findViewById(getViewIdByName("settings_button"));
    }

    private void bindTitle() {
        titleEditEmployee = findViewById(getViewIdByName("title_edit_employee"));
    }

    private void bindEmployeeFields() {
        editFirstName      = findViewById(getViewIdByName("edit_first_name"));
        editLastName       = findViewById(getViewIdByName("edit_last_name"));
        editId             = findViewById(getViewIdByName("edit_id"));
        editDateOfBirth    = findViewById(getViewIdByName("edit_date_of_birth"));
        editRole           = findViewById(getViewIdByName("edit_role"));
        editSalary         = findViewById(getViewIdByName("edit_salary"));
        editHolidayAllowance = findViewById(getViewIdByName("edit_holiday_allowance"));
        editSalaryIncrement  = findViewById(getViewIdByName("edit_salary_increment"));
        editHireDate       = findViewById(getViewIdByName("edit_hire_date"));
    }

    private void bindDiscardSaveButtons() {
        discardChangesButton = findViewById(getViewIdByName("discard_changes_button"));
        saveChangesButton    = findViewById(getViewIdByName("save_changes_button"));
    }

    private void bindBottomBar() {
        backButton   = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }

    // LISTENER SETUP

    private void setupTopBarListeners() {
        // Calendar button
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(this, "Calendar clicked!", Toast.LENGTH_SHORT).show();
        });

        // Notifications button
        notificationButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show();
        });

        // Settings button
        settingsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupDiscardSaveListeners() {
        // Discard
        discardChangesButton.setOnClickListener(v -> {
            Toast.makeText(this, "Discarding changes...", Toast.LENGTH_SHORT).show();
            clearFields();
        });

        // Save
        saveChangesButton.setOnClickListener(v -> {
            String firstName       = editFirstName.getText().toString().trim();
            String lastName        = editLastName.getText().toString().trim();
            String id              = editId.getText().toString().trim();
            String dateOfBirth     = editDateOfBirth.getText().toString().trim();
            String role            = editRole.getText().toString().trim();
            String salary          = editSalary.getText().toString().trim();
            String holidayAllowance = editHolidayAllowance.getText().toString().trim();
            String salaryIncrement  = editSalaryIncrement.getText().toString().trim();
            String hireDate        = editHireDate.getText().toString().trim();

            // Show user input in a toast
            Toast.makeText(this,
                    "Saving:\n" +
                            "First Name: " + firstName + "\n" +
                            "Last Name: " + lastName  + "\n" +
                            "ID: " + id + "\n" +
                            "DOB: " + dateOfBirth + "\n" +
                            "Role: " + role + "\n" +
                            "Salary: " + salary + "\n" +
                            "Holiday Allowance: " + holidayAllowance + "\n" +
                            "Salary Increment: " + salaryIncrement + "\n" +
                            "Hire Date: " + hireDate,
                    Toast.LENGTH_LONG
            ).show();

        });
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

    /**
     * Clears all text fields (used for discarding changes).
     */
    private void clearFields() {
        editFirstName.setText("");
        editLastName.setText("");
        editId.setText("");
        editDateOfBirth.setText("");
        editRole.setText("");
        editSalary.setText("");
        editHolidayAllowance.setText("");
        editSalaryIncrement.setText("");
        editHireDate.setText("");
    }

    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}

