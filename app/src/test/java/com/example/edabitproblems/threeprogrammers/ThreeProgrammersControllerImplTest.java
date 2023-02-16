package com.example.edabitproblems.threeprogrammers;

import junit.framework.TestCase;

import org.junit.Assert;

public class ThreeProgrammersControllerImplTest extends TestCase {

    public void testGetDifferenceMaxAndMin() {
        int expectedOutput = 25;
        int actualOutput = new ThreeProgrammersControllerImpl().getDifferenceMaxAndMin("20", "30", "5");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}