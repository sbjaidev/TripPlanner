package com.example.android.tripplanner;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EventListActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<EventEntry>> {

    public static final String LOG_TAG = EventListActivity.class.getName();
    private ArrayAdapter<com.example.android.tripplanner.EventEntry> mAdapter = null;
    private static final int EVENT_LOADER_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        LoaderManager loaderManager = getLoaderManager();
        loaderManager.initLoader(EVENT_LOADER_ID, null, this);
    }

    private void updateUi(ArrayList<EventEntry> events) {
        mAdapter = new EventListAdapter(this, events);
        ListView eventListView = (ListView) findViewById(R.id.activity_event_list);
        eventListView.setAdapter(mAdapter);

        // TODO: Implement onClickListener for the event list.
        // It should open up the details of the event.
    }

    @Override
    public Loader<ArrayList<EventEntry>> onCreateLoader(int id, Bundle args) {
        return new EventListLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<ArrayList<EventEntry>> loader, ArrayList<EventEntry> data) {
        if (mAdapter != null) { mAdapter.clear(); }

        updateUi(data);

        //TODO: find out what's happening here.
        if (data != null && !data.isEmpty()) { mAdapter.addAll(data); }
    }

    @Override
    public void onLoaderReset(Loader<ArrayList<EventEntry>> loader) {
        mAdapter.clear();
    }
}
