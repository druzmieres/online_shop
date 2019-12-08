package com.interview.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for Comment class.
 *
 * @author Daniela Ruz
 * @version 0.1
 */
public class CommentTest {

    /**
     * Default constructor
     */
    public CommentTest() {
    }

    /**
     * Sets up the test fixture.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     */
    @After
    public void tearDown() {
    }

    /**
     * Tests that a comment is correctly initialised.
     */
    @Test
    public void testInit() {
        Comment comment = new Comment("Luna Ruz", "Bark, bark!", 5);
        assertEquals("Bark, bark!", comment.getText());
        assertEquals("Luna Ruz", comment.getAuthor());
    }

    /**
     * Test that a comment author is correctly added.
     */
    @Test
    public void testGetAuthor() {
        Comment comment = new Comment("Ursula Healy", "I like it.", 4);
        assertEquals("Ursula Healy", comment.getAuthor());
    }

    /**
     * Test that a comment text can be retrieved.
     */
    @Test
    public void testGetText() {
        Comment comment = new Comment("Marco Polo", "I have not told the half of what I saw.", 3);
        assertEquals("I have not told the half of what I saw.", comment.getText());
    }

    /*
     * Test that a comment rating is correctly added.
     */
    @Test
    public void testGetRating() {
        Comment comment = new Comment("Aracely Quispe", "Good product.", 4);
        assertEquals(4, comment.getRating());
    }
}
