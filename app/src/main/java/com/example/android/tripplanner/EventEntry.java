package com.example.android.tripplanner;


import java.util.Date;

/**
 * Class that holds information of an event. Use this class for UI purposes
 * only.
 */

public class EventEntry {

    private static final String LOG_TAG = EventEntry.class.getName();

    /** title of the event. */
    private String mTitle;

    /** description of the event. */
    private String mDescription;

    /** start date of the event. */
    private Date mStartDate;

    /** end date of the event. */
    private Date mEndDate;

    /** stage of the event. */
    private int mStage;

    public EventEntry(String pTitle, String pDescription, Date pStartDate, Date pEndDate, int pStage) {
        mTitle = pTitle;
        mDescription = pDescription;
        mStartDate = pStartDate;
        mEndDate = pEndDate;
        mStage = pStage;
    }

    /**
     * Method to get the title of the Event.
     *
     * @return the title of the event which is a String.
     */
    public String getTitle() { return mTitle; }

    /**
     * Method to get the description of the Event.
     *
     * @return the description of the event which is a String.
     */
    public String getDescription() { return mDescription; }

    /**
     * Method to get the start date of the Event.
     *
     * @return the start date of the event which is a Date object.
     */
    public Date getStartDate() { return mStartDate; }

    /**
     * Method to get the end date of the event.
     *
     * @return the end date of the event which is a Date object.
     */
    public Date getEndDate() { return mEndDate; }

    /**
     * Method to get the stage that the Event in.
     *
     * @return the stage of the event which is an int.
     */
    public int getStage() { return mStage; }
}
