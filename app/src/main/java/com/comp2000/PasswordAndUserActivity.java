package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PasswordAndUserActivity extends Activity {

    private TextView titleText;
    private EditText usernameField;
    private EditText passwordField;
    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String layoutName = "activity_passwordanduser";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        int titleId        = getViewIdByName("title_text");
        int usernameFieldId = getViewIdByName("username_field");
        int passwordFieldId = getViewIdByName("password_field");
        int submitButtonId  = getViewIdByName("submit_button");

        titleText = findViewById(titleId);
        usernameField = findViewById(usernameFieldId);
        passwordField = findViewById(passwordFieldId);
        submitButton = findViewById(submitButtonId);


        submitButton.setOnClickListener(view -> {
            // Retrieve user inputs
            String username = usernameField.getText().toString().trim();
            String password = passwordField.getText().toString().trim();

            // Display them in a Toast or handle authentication
            Toast.makeText(this,
                    "Username: " + username + "\nPassword: " + password,
                    Toast.LENGTH_SHORT).show();

        });
    }

    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}



