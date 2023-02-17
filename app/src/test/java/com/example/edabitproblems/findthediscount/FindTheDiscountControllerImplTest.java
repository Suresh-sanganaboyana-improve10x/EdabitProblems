package com.example.edabitproblems.findthediscount;

import junit.framework.TestCase;

import org.junit.Assert;

public class FindTheDiscountControllerImplTest extends TestCase {

    public void testGetDiscount() {
        int expectedOutput = 500;
        int actualOutput = new FindTheDiscountControllerImpl().getDiscount("1000", "50");
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}