package com.codecool.web.model;

import java.util.Date;

public final class Tweet {

    private final String author;
    private final String text;
    private final Date date = new Date();

    public Tweet(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("%s: \n\n %20s", text, author);
    }
}

