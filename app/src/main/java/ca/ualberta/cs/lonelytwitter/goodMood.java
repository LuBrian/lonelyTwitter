package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by brianlu on 2017-01-19.
 */

public class GoodMood extends Mood {
    public GoodMood(Date date, String currentMood) throws MoodTooLongException{
        super(date, currentMood);
    }

    public GoodMood(String currentMood) throws MoodTooLongException{
        super(currentMood);

    }
}
