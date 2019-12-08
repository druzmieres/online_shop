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
}