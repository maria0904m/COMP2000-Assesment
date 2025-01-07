package com.comp2000;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SignOutActivity extends Activity {

    // UI Components
    private TextView signedOutMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Dynamically load the layout
        String layoutName = "signout";
        int layoutId = getLayoutIdByName(layoutName);
        setContentView(layoutId);

        // Bind UI elements
        bindViews();

        // Set signed out message if required
        displaySignOutMessage();
    }

    // BINDING METHODS

    private void bindViews() {
        signedOutMessage = findViewById(getViewIdByName("signed_out_message"));
    }

    // HELPER METHODS

    private int getLayoutIdByName(String layoutName) {
        return getResources().getIdentifier(layoutName, "layout", getPackageName());
    }

    private int getViewIdByName(String viewName) {
        return getResources().getIdentifier(viewName, "id", getPackageName());
    }

    private void displaySignOutMessage() {
        if (signedOutMessage != null) {
            signedOutMessage.setText("You have successfully signed out.");
        }
    }
}
