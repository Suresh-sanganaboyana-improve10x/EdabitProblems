package com.example.edabitproblems.checkdivisioblebyfive;

import junit.framework.TestCase;

import org.junit.Assert;

public class CheckIfItIntegerIsDivisibleByFiveControllerImplTest extends TestCase {

    public void testCheckIfIsIntegerIsDivisibleByFive() {
        boolean expectedOutput = true;
        boolean actualOutput = new CheckIfItIntegerIsDivisibleByFiveControllerImpl().checkIfIsIntegerIsDivisibleByFive("25");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}