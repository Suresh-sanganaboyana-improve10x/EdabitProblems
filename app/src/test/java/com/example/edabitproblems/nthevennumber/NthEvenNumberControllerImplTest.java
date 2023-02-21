package com.example.edabitproblems.nthevennumber;

import junit.framework.TestCase;

import org.junit.Assert;

public class NthEvenNumberControllerImplTest extends TestCase {

    public void testFindNthEvenNumber() {
        int expectedOutput = 198;
        int actualOutput = new NthEvenNumberControllerImpl().findNthEvenNumber("100");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}