package com.example.edabitproblems.minutestoseconds;

import android.util.Log;

public class MinutesToSecondControllerImpl implements MinutesToSecondsController{
    @Override
    public int minutesToSeconds(String minutes) {
        int seconds = 0;
        try {
            int minutesInInt = Integer.parseInt(minutes);
            seconds = minutesInInt * 60;
        } catch (Exception ex) {
            Log.e("", ex.getMessage(), ex);
        }
        return seconds;
    }
}
