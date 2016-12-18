package com.example.android.tripplanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Adapter to connect the EventListActivity with the data
 */

public class EventListAdapter extends ArrayAdapter<EventEntry> {
    private static final String LOG_TAG = EventListAdapter.class.getName();

    /**
     * Constructs the Eventlist Adapter. No new functionality required here.
     *
     * @param context for the adapter.
     * @param events the list of events that the adapter will use.
     */
    EventListAdapter(Context context, ArrayList<EventEntry> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View eventView = convertView;

        if (eventView == null) {
            eventView = LayoutInflater.from(getContext()).inflate(
                    R.layout.event_entry, parent, false
            );
        }

        EventEntry currentItem = getItem(position);

        TextView title =
                (TextView) eventView.findViewById(R.id.event_list_title);
        title.setText(currentItem.getTitle());

        TextView description =
                (TextView) eventView.findViewById(R.id.event_list_description);
        description.setText(currentItem.getDescription());

        // formatDate method is called to make sure the date is in the correct
        // format
        TextView startDate =
                (TextView) eventView.findViewById(R.id.event_list_start_date);
        startDate.setText(formatDate(currentItem.getStartDate()));

        TextView endDate =
                (TextView) eventView.findViewById(R.id.event_list_end_date);
        endDate.setText(formatDate(currentItem.getEndDate()));

        return eventView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}
