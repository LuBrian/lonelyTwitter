package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by brianlu on 2017-02-14.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    public void add(Tweet tweet){
        boolean add = true;
        for(int i = 0; i< tweets.size();i++){
            if(tweets.get(i).getMessage().equals(tweet.getMessage())){
                add = false;
                throw new IllegalArgumentException("tweet already exists!");
            }
        }
        if(add){
            tweets.add(tweet);
        }
    }

    public boolean hasTweet (Tweet tweet){
        boolean has = false;
        for(int i = 0; i< tweets.size();i++){
            if(tweets.get(i).getMessage().equals(tweet.getMessage())){
                has = true;
            }
        }
        return has;
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);

    }

    public ArrayList<Tweet> getTweets(){
         return tweets;
    }

    public int getCount(){
        return this.tweets.size();
    }
}
