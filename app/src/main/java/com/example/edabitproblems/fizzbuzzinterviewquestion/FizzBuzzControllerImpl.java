package com.example.edabitproblems.fizzbuzzinterviewquestion;

public class FizzBuzzControllerImpl implements FizzBuzzController{
    @Override
    public String findFizzOrBuzz(String n) {
        int nInInt = Integer.parseInt(n);
        String result = "";
        if (nInInt%3==0 && nInInt%5==0) {
            result = "FizzBuzz";
        } else if (nInInt%3==0) {
            result = "Fizz";
        } else if (nInInt%5==0) {
            result = "Buzz";
        } else {
            result = String.valueOf(nInInt);
        }
        return result;
    }
}
