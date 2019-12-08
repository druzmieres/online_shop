package com.interview.demo;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;

/**
 * Unit tests for Item class.
 *
 * @author  Daniela Ruz
 * @version 0.1
 */
public class ItemTest
{
    /**
     * Default constructor
     */
    public ItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Tests that a sales item is correctly initialised.
     */
    @Test
    public void testInit()
    {
        Item item1 = new Item("1982", 10.90);
        assertEquals("1982", item1.getName());
        // the third value (delta) refers to how close the numbers can be and still be considered equal
        assertEquals(10.90, item1.getPrice(), 0);
    }

    /**
     * Test that a comment can be correctly added.
     */
    @Test
    public void testAddComment()
    {
        Item item1 = new Item("Don Quixote", 8.90);
        assertEquals(true, item1.addComment("Juan Mieres", "Best book ever!", 5));
        assertEquals(1, item1.getNumberOfComments());
    }

    /**
     * Test that a comment using a negative rating value is rejected.
     */
    @Test
    public void testNegativeRating()
    {
        Item item1 = new Item("One Hundred Years of Solitude", 11.80);
        assertEquals(false, item1.addComment("Marwan Crowther", "I like the Spanish version better.", -1));
    }

}