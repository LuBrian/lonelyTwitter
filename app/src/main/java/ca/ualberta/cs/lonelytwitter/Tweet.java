package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 *
 * Created by brianlu on 2017-01-17.
 *
 * Tweet class is a super class that implements tweetable
 */

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
//    private String hiddenstring;

    /**
     *
     * @param date
     * @param message
     * Public tweet that receives parameters message and date
     */
    public Tweet(Date date, String message){
        this.date = date;
        this.message = message;
//        this.setMessage(message);

    }

    /**
     *
     * @param message
     * public tweet that receives parameter message and date is automatically set to current date
     */
    public Tweet(String message){
        this.message = message;
//        this.setMessage(message);
        this.date = new Date(); // current time and date
    }

    /**
     *
     * @return
     * public abstract method that check if the tweet important or not
     */
    public abstract Boolean isImportant();

    /**
     *
     * @return
     * get the date and returns the date
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date
     * public setter for the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return
     * public getter for the message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * @throws TweetTooLongException
     * public setter for the message
     * @throws TweetTooLongException if the tweet exceeds the length limit
     */
    public void setMessage(String message) throws TweetTooLongException {
        if(message.length() > 144){
            //todo throw new error here

            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     *
     * @return
     * returns string as regular expression indicated
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
