package com.example.android.tripplanner;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Define of a custom loader to get the list of events from server/disk
 */

public class EventListLoader extends AsyncTaskLoader<ArrayList<EventEntry>> {

    /**
     * Constructs a new {@link EventListLoader}
     * @param context if the activity.
     */
    public EventListLoader(Context context) {
        super(context);
    }

    @Override
    public ArrayList<EventEntry> loadInBackground() {
        // TODO: Implement retrieving the events from the database.
        // Until then fake events to be displayed.
        return generateFakeEvents();
    }

    @Override
    public void onStartLoading() { forceLoad(); }

    private ArrayList<EventEntry> generateFakeEvents() {
        EventEntry tempEvent = null;
        ArrayList<EventEntry> fakeEventEntries = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            try {
                tempEvent = new EventEntry("Title " + i, "A really, really, really long description", new SimpleDateFormat("dd/MM/yyyy").parse("10/11/2012"), new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2013"), 1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            fakeEventEntries.add(tempEvent);
        }
        return fakeEventEntries;
    }
}

