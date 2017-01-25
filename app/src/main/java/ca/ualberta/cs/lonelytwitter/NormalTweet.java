package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by brianlu on 2017-01-17.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(Date date, String message){
        super(date, message);
    }

    public NormalTweet( String message){
        super(message);

    }

    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
