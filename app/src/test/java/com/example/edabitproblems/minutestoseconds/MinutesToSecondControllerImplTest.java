package com.example.edabitproblems.minutestoseconds;

import junit.framework.TestCase;

import org.junit.Assert;

public class MinutesToSecondControllerImplTest extends TestCase {

    public void testMinutesToSeconds() throws Exception {
        int expectedOutput = 60;
        int actualOutput = new MinutesToSecondControllerImpl().minutesToSeconds("1");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}