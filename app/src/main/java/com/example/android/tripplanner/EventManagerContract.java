package com.example.android.tripplanner;

import android.provider.BaseColumns;

/**
 * Establishes the datamodel that is required.
 */

public final class EventManagerContract {

    private static final String LOG_TAG = EventManagerContract.class.getName();
    private EventManagerContract() {}

    public static class EventEntry implements BaseColumns {
        public static final String TABLE_NAME = "eventEntry";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_START_DATE = "startDate";
        public static final String COLUMN_NAME_END_DATE = "endDate";
        public static final String COLUMN_NAME_STAGE = "stage";
    }
}
