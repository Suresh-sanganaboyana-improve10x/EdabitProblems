package com.example.edabitproblems.twoMakesTen;

import junit.framework.TestCase;

import org.junit.Assert;

public class TwoMakesTenControllerImplTest extends TestCase {

    public void testIsTwoMakesTen() {
        boolean expectedOutput = true;
        boolean actualOutput = new TwoMakesTenControllerImpl().isTwoMakesTen("7","3");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}