package com.example.edabitproblems.lessthanhundred;

public class LessThanHundredControllerImpl implements LessThanHundredController{
    @Override
    public boolean findIsLessThanHundred(String text1, String text2) {
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);
        boolean lessThanHundred = false;
        if (a+b < 100) {
            lessThanHundred = true;
        }
        return lessThanHundred;
    }
}
