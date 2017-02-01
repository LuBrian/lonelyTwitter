package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by brianlu on 2017-01-17.
 */

public class NormalTweet extends Tweet {
    /**
     *
     * @param date
     * @param message
     * obtains the massages and date
     */
    public NormalTweet(Date date, String message){
        super(date, message);
    }

    /**
     * @param message or data
     */
    public NormalTweet( String message){
        super(message);

    }

    /**
     *
     * @return if this tweet is important or not, this one returns False which is not important
     */
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
