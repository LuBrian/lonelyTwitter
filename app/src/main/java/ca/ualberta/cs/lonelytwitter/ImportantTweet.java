package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by brianlu on 2017-01-17.
 */

public class ImportantTweet extends Tweet {
    /**
     *
     * @param date
     * @param message
     * get date and message
     */
    public ImportantTweet(Date date, String message){
        super(date, message);
    }

    /**
     *
     * @param message
     * obtain the messages
     */
    public ImportantTweet( String message){
        super(message);

    }

    /**
     *
     * @return returns if this tweet important or not, this is Important tweet, thus returns True
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    /**
     *
     * @return the message that get message
     */
    @Override
    public String getMessage(){
        return super.getMessage() + " !!!";
    }
}
