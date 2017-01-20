package ca.ualberta.cs.lonelytwitter;

/**
 * Created by brianlu on 2017-01-17.
 */

public class MoodTooLongException extends Exception {
    public MoodTooLongException() {
    }

    public MoodTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
