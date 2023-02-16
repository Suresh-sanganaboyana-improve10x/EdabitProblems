package com.example.edabitproblems.hoursMinutesIntoSeconds;

import junit.framework.TestCase;

import org.junit.Assert;

public class HoursToMinIntoSecondsImplTest extends TestCase {

    public void testHoursToMinuteIntoSeconds() throws Exception {
        int expectedOutput = 3900;
        int actualOutput = new HoursToMinIntoSecondsImpl().hoursToMinuteIntoSeconds("1", "5");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}