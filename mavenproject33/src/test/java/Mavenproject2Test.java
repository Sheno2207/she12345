package com.mycompany.mavenproject33;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test class for Mavenproject2
 */
public class Mavenproject2Test {

    Mavenproject33 app;

    public Mavenproject2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() {
        System.out.println("Before each test");
        app = new Mavenproject33();
    }

    @After
    public void tearDown() {
        System.out.println("After each test");
    }

    @Test
    public void testAdd() {
        int result = app.add(5, 7);
        assertEquals(12, result);
    }

    @Test
    public void testMessage() {
        String msg = app.getMessage();
        assertNotNull(msg);
        assertEquals("Hello, NetBeans!", msg);
    }
}