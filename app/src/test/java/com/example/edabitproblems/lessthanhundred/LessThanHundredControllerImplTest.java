package com.example.edabitproblems.lessthanhundred;

import junit.framework.TestCase;

import org.junit.Assert;

public class LessThanHundredControllerImplTest extends TestCase {

    public void testFindIsLessThanHundred() {
        boolean expectedOutput = true;
        boolean actualOutput = new LessThanHundredControllerImpl().findIsLessThanHundred("22", "44");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}