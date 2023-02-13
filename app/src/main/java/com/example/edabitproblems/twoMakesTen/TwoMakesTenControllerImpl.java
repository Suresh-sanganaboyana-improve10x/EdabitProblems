package com.example.edabitproblems.twoMakesTen;

public class TwoMakesTenControllerImpl implements TwoMakesTenController{


    @Override
    public boolean isTwoMakesTen(String a, String b) {
        int tenA = Integer.parseInt(a);
        int tenB = Integer.parseInt(b);
        boolean isTen = false;
        if (tenA==10 || tenA==10 ||tenA+tenB==10) {
            isTen = true;
        }
        return isTen;
    }
}
