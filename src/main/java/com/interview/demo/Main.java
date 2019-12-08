package com.interview.demo;


public class Main {

    public static void main(String [] args)
    {
        // Create an item.
        Item headphones = new Item("Bootleg headphones", 0.99);
        // Print the name and price of the item.
        System.out.printf("The item \"%s\" costs %s.%n", headphones.getName().toLowerCase(), headphones.getPrice());
        // Add customer comment.
        String author = "Catalina Bachmann";
        headphones.addComment(author, "Worst headphones ever >:(", 1);
        // Print comment
        System.out.printf("%s commented \"%s\".%n", author, headphones.getComment(author).toLowerCase());
    }
}
