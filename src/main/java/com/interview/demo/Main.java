package com.interview.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // Create a Logger
        Logger logger = Logger.getLogger(Main.class.getName());

        // Create an item.
        Item headphones = new Item("Bootleg headphones", 0.99);
        // Print the name and price of the item.
        logger.log(Level.INFO, String.format("The item %s costs $%s.%n",
                headphones.getName().toLowerCase(), headphones.getPrice()));
        // Add customer comment.
        String author = "Catalina Bachmann";
        headphones.addComment(author, "Worst headphones ever >:(", 1);
        // Print comment
        logger.log(Level.INFO, String.format("%s commented \"%s.\"%n",
                author, headphones.getComment(author).toLowerCase()));
    }
}
