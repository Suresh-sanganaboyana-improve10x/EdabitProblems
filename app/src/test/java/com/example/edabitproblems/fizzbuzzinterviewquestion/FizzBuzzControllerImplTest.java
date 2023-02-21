package com.example.edabitproblems.fizzbuzzinterviewquestion;

import junit.framework.TestCase;

import org.junit.Assert;

public class FizzBuzzControllerImplTest extends TestCase {

    public void testFindFizzOrBuzz() {
         String expectedOutput = "FizzBuzz";
         String actualOutput = new FizzBuzzControllerImpl().findFizzOrBuzz("15");
         Assert.assertEquals(expectedOutput, actualOutput);
    }
}