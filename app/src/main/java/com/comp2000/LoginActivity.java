package com.comp2000;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button adminLoginButton;
    private Button employeeLoginButton;

    // SharedPreferences
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String layoutName = "activity_login";
        int layoutId = getLayoutIdByName(layoutName);

        setContentView(layoutId);

        int usernameId = getViewIdByName("username");
        int passwordId = getViewIdByName("password");
        int adminButtonId = getViewIdByName("admin_login_button");
        int employeeButtonId = getViewIdByName("employee_login_button");

        // Bind them in code
        usernameEditText = findViewById(usernameId);
        passwordEditText = findViewById(passwordId);
        adminLoginButton = findViewById(adminButtonId);
        employeeLoginButton = findViewById(employeeButtonId);

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("user_prefs", MODE_PRIVATE);

        // Check if user is already logged in
        if (isUserLoggedIn()) {
            // If already logged in, go directly to the employee page
            navigateToEmployeePage();
        }

        // Set up click listener
        adminLoginButton.setOnClickListener(view -> {
            // Admin login logic ex
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            if (username.equals("admin") && password.equals("admin")) {
                saveUserLoginState();
                navigateToAdminPage();
            } else {
                Toast.makeText(this, "Invalid admin credentials", Toast.LENGTH_SHORT).show();
            }
        });

        // Set up click listener for employee login page
        employeeLoginButton.setOnClickListener(view -> {
            // Employee login logic
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in both fields", Toast.LENGTH_SHORT).show();
            } else {
                saveUserLoginState();
                navigateToEmployeePage();
            }
        });
    }

    // Save login state to SharedPreferences
    private void saveUserLoginState() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("is_logged_in", true);
        editor.apply();
    }

    // Check if the user is logged in
    private boolean isUserLoggedIn() {
        return sharedPreferences.getBoolean("is_logged_in", false);
    }

    // Navigate to employee page
    private void navigateToEmployeePage() {
        Intent intent = new Intent(LoginActivity.this, MainEmployeePageActivity.class);
        startActivity(intent);
        finish(); // Close login activity to prevent user from going back to it
    }

    // Navigate to admin page
    private void navigateToAdminPage() {
        Intent intent = new Intent(LoginActivity.this, MainAdminPageActivity.class);
        startActivity(intent);
        finish(); // Close login activity to prevent user from going back to it
    }

    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }
}



