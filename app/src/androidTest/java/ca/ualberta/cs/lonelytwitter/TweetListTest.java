package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by brianlu on 2017-02-14.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);

    }
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another Test Tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test","test");
        assertTrue("'test' should start with 't'","test".startsWith("t"));
    }

    public void testDuplicateTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        Tweet tweet1 = new NormalTweet("test tweet");
        tweets.add(tweet);
        try{
            tweets.add(tweet1);
            fail();
        } catch (Exception e){
            assertTrue(tweets.hasTweet(tweet1));
        }
    }


    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test1");
        Tweet tweet1 = new NormalTweet("test2");
        Tweet tweet2 = new NormalTweet("test3");
        tweets.add(tweet);
        tweets.add(tweet2);
        tweets.add(tweet1);

        ArrayList<Tweet> checkList = new ArrayList<Tweet>();
        checkList = tweets.getTweets();
        for(int i = 0; i< checkList.size();i++){
            for(int j = i+1; j < checkList.size();j++){
                if(checkList.get(i).getDate().after(checkList.get(j).getDate()) ){
                    fail();
                }
            }
        }
    }

    public void testHasDuplicate(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("duplicate test");
        tweets.add(tweet);
        Tweet tweet1 = new NormalTweet("duplicate test");
        assertTrue(tweets.hasTweet(tweet1));

    }

    public void testGetCount(){
        int count = 0;
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet1");
        tweets.add(tweet1);
        count+=1;
        Tweet tweet2 = new NormalTweet("tweet2");
        tweets.add(tweet2);
        count+=1;
        Tweet tweet3 = new NormalTweet("tweet3");
        tweets.add(tweet3);
        count+=1;
        Tweet tweet4 = new NormalTweet("tweet4");
        tweets.add(tweet4);
        count+=1;
        assertEquals(true,tweets.getCount() == count);

    }


}
