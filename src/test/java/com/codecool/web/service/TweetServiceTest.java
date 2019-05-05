package com.codecool.web.service;

import com.codecool.web.model.Tweet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TweetServiceTest {

    private List<Tweet> tests = new ArrayList<>();
    private TweetService service = TweetService.getInstance();
    private Date testDate = new Date(936914400000L);
    private Tweet test = new Tweet("Teszt Janosch", "very maccs teszt");

    @BeforeEach
    void setUp() {
        tests.add(test);
        service.addTweet(test);

    }

    @Test
    void getTweets() {
        assertTrue(service.getTweets().contains(test));
    }
}
