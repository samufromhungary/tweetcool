package com.codecool.web.service;

import com.codecool.web.model.Tweet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class TweetService {

    private List<Tweet> tweets;
    private static TweetService ourInstance = new TweetService();

    private TweetService() {
        tweets = new ArrayList<>(Arrays.asList(
            new Tweet("Yuri Tarded", "teszt")
        ));
    }

    public static TweetService getInstance() {
        return ourInstance;
    }

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

}
