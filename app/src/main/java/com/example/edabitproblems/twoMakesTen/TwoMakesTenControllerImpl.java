package com.example.edabitproblems.twoMakesTen;

import android.util.Log;

public class TwoMakesTenControllerImpl implements TwoMakesTenController{


    @Override
    public boolean isTwoMakesTen(String a, String b) throws Exception{
        boolean isTen = false;
        try {
            int tenA = Integer.parseInt(a);
            int tenB = Integer.parseInt(b);
            if (tenA == 10 || tenB == 10 || tenA + tenB == 10) {
                isTen = true;
            }
        } catch (Exception ex) {
            Log.e("", ex.getMessage(), ex);
        }
        return isTen;
    }
}
