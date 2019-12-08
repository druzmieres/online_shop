package com.interview.demo;

import java.util.ArrayList;

/**
 * This class represents an item in an online shop.
 * Item objects store the information of item, like name, price, etc.
 *
 * @author Daniela Ruz
 * @version 0.1
 */
public class Item
{
    private String name;
    private double price; // in dollars
    private ArrayList<Comment> comments;

    /**
     * Create a new sales item.
     */
    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
        comments = new ArrayList<>();
    }

    /**
     * Return the name of this item.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Return the price of this item.
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Return the number of comments for this item.
     */
    public int getNumberOfComments()
    {
        return comments.size();
    }

    /**
     * Add a comment to the comment list of this item. Return true if successful, and false otherwise.
     *
     * Only one comment per author is allowed. Valid ratings are in the range [1..5].
     */
    public boolean addComment(String author, String text, int rating)
    {
        if(isInvalidRating(rating)) {  // reject invalid ratings
            return false;
        }

        if(findCommentByAuthor(author) != null) {  // reject mutiple comments by same author
            return false;
        }

        comments.add(new Comment(author, text, rating));
        return true;
    }

    /**
     * Check whether the given rating is invalid. Return true if it is, false otherwise.
     * Valid ratings are between 1 and 5.
     */
    private boolean isInvalidRating(int rating)
    {
        return rating < 1 || rating > 5;
    }

    /**
     * Find the comment by the author with the given name.
     *
     * @return The comment if it exists; null if it doesn't.
     */
    private Comment findCommentByAuthor(String author)
    {
        for(Comment comment : comments) {
            if(comment.getAuthor().equals(author)) {
                return comment;
            }
        }
        return null;
    }
}