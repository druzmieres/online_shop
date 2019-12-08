package com.interview.demo;


/**
 * This class represents a comment on an item on an online shop.
 * A comment consists of text, a rating, and an author.
 *
 * @author Daniela Ruz
 * @version 0.1
 */
public class Comment
{
    private String author;
    private String text;
    private int rating;
    private int votes;

    /**
     * Create a comment with all necessary details. The initial vote balance is 0.
     */
    public Comment(String author, String text, int rating)
    {
        this.author = author;
        this.text = text;
        this.rating = rating;
        votes = 0;
    }

    /**
     * Return the author of this comment.
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Return the rating of this comment.
     */
    public int getRating()
    {
        return rating;
    }

    /**
     * Return the rating of this comment.
     */
    public String getText()
    {
        return text;
    }
}