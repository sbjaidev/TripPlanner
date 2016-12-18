package com.example.android.tripplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getName();

    /**
     * Called when the Activity is first created.
     * @param savedInstanceState - the saved state of the Activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Call this intent only if user has logged in.
        // Transfer the user to the event lister.
        Intent eventListIntent = new Intent(this, EventListActivity.class);
        startActivity(eventListIntent);
    }
}
