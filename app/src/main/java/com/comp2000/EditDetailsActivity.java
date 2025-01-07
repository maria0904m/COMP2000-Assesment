package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrates editing user details
 */
public class EditDetailsActivity extends Activity {

    // Top bar
    private Button calendarButton;
    private Button notificationButton;
    private Button settingsButton;

    // Title
    private TextView titleEditDetails;

    // Form fields
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editDateOfBirth;
    private EditText editAddress;
    private EditText editPostcode;
    private EditText editEmail;
    private EditText editPhoneNumber;

    // Action buttons
    private Button discardChangesButton;
    private Button saveChangesButton;

    // Bottom bar
    private Button backButton;
    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String layoutName = "activity_editdetails";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        bindTopBar();
        bindTitle();
        bindFormFields();
        bindActionButtons();
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
        titleEditDetails = findViewById(getViewIdByName("title_edit_details"));
    }

    private void bindFormFields() {
        editFirstName    = findViewById(getViewIdByName("edit_first_name"));
        editLastName     = findViewById(getViewIdByName("edit_last_name"));
        editDateOfBirth  = findViewById(getViewIdByName("edit_date_of_birth"));
        editAddress      = findViewById(getViewIdByName("edit_address"));
        editPostcode     = findViewById(getViewIdByName("edit_postcode"));
        editEmail        = findViewById(getViewIdByName("edit_email"));
        editPhoneNumber  = findViewById(getViewIdByName("edit_phone_number"));
    }

    private void bindActionButtons() {
        discardChangesButton = findViewById(getViewIdByName("discard_changes_button"));
        saveChangesButton    = findViewById(getViewIdByName("save_changes_button"));
    }

    private void bindBottomBar() {
        backButton    = findViewById(getViewIdByName("back_button"));
        signOutButton = findViewById(getViewIdByName("sign_out_button"));
    }

    // LISTENER SETUP

    private void setupTopBarListeners() {
        // Calendar
        calendarButton.setOnClickListener(v -> {
            Toast.makeText(this, "Calendar clicked!", Toast.LENGTH_SHORT).show();
            // Possibly navigate to calendar activity
        });

        // Notifications
        notificationButton.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked!", Toast.LENGTH_SHORT).show();
            //  open notifications screen
        });

        // Settings
        settingsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupFormButtonListeners() {
        // discard changes
        discardChangesButton.setOnClickListener(v -> {
            Toast.makeText(this, "Discarding changes...", Toast.LENGTH_SHORT).show();
            // Clear form fields
            clearFormFields();
        });

        // Save changes
        saveChangesButton.setOnClickListener(v -> {

            String firstName   = editFirstName.getText().toString().trim();
            String lastName    = editLastName.getText().toString().trim();
            String dob         = editDateOfBirth.getText().toString().trim();
            String address     = editAddress.getText().toString().trim();
            String postcode    = editPostcode.getText().toString().trim();
            String email       = editEmail.getText().toString().trim();
            String phoneNumber = editPhoneNumber.getText().toString().trim();


            Toast.makeText(this,
                    "Saving:\n" +
                            "First Name: " + firstName + "\n" +
                            "Last Name: "  + lastName  + "\n" +
                            "DOB: "        + dob       + "\n" +
                            "Address: "    + address   + "\n" +
                            "Postcode: "   + postcode  + "\n" +
                            "Email: "      + email     + "\n" +
                            "Phone: "      + phoneNumber,
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


    private void clearFormFields() {
        editFirstName.setText("");
        editLastName.setText("");
        editDateOfBirth.setText("");
        editAddress.setText("");
        editPostcode.setText("");
        editEmail.setText("");
        editPhoneNumber.setText("");
    }


    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}
