package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brianlu on 2017-01-17.
 */

public abstract class Mood {
    private Date date;
    private String currentMood;

    public Mood(Date date, String currentMood) throws MoodTooLongException {
        this.date = date;
        this.setCurrentMood(currentMood);
    }

    public Mood(String currentMood) throws MoodTooLongException {
        this.setCurrentMood(currentMood);
        this.date = new Date(); // current time and date
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCurrentMood() {
        return currentMood;
    }


    public void setCurrentMood(String currentMood) throws MoodTooLongException {
        if(currentMood.length() > 30){
            //todo throw new error here

            throw new MoodTooLongException();
        } else {
            this.currentMood = currentMood;
        }
    }
}
