package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by brianlu on 2017-01-17.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(Date date, String message){
        super(date, message);
    }

    public ImportantTweet( String message){
        super(message);

    }

    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    @Override
    public String getMessage(){
        return super.getMessage() + " !!!";
    }
}
