package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by brianlu on 2017-01-17.
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
//    private String hiddenstring;

    public Tweet(Date date, String message){
        this.date = date;
        this.message = message;
//        this.setMessage(message);

    }

    public Tweet(String message){
        this.message = message;
//        this.setMessage(message);
        this.date = new Date(); // current time and date
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            //todo throw new error here

            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
