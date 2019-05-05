<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.codecool.web.model.Tweet" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/index.css" type="text/css">
    <title>TweetCool</title>
</head>

<body>
<div class="main">
    <h1>Tweetcool test</h1>
            <div class="tweets">
                <h2>Already tweeted:</h2>
                <% List<Tweet> tweets = new ArrayList<>(); %>
                <% if (request.getAttribute("tweets") != null) { %>
                    <% tweets.addAll((List<Tweet>)request.getAttribute("tweets")); %>
                <% } %>
                <% if (tweets.size() > 0) { %>
                    <% for (Tweet tweet : tweets) { %>
                    <p><i><%= tweet.getAuthor() %></i>: <%= tweet.getText() %><br>
                      <%= tweet.getDate() %> </p>
                    <% } %>
                <% } %>
            </div>

        <div class="sender">
            <h2>Tweet here:</h2>
            <form action = "" method = "post">
                Nick: <br>
                <input class = "name" type = "text" name = "author">
                <br>Tweet:
                <br><textarea class = "content" name = "text"></textarea><br>
                <input type = "submit" value = "Send it!" />
            </form>
        </div>
</div>
</body>
</html>
