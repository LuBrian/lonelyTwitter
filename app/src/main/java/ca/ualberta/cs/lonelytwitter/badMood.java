package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brianlu on 2017-01-19.
 */

public class BadMood extends Mood {
    public BadMood(Date date, String currentMood) throws MoodTooLongException{
        super(date, currentMood);
    }

    public BadMood(String currentMood) throws MoodTooLongException{
        super(currentMood);

    }
}
