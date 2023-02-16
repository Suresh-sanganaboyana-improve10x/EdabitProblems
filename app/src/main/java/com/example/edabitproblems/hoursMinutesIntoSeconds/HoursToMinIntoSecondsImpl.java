package com.example.edabitproblems.hoursMinutesIntoSeconds;

import android.util.Log;

public class HoursToMinIntoSecondsImpl implements HoursToMinIntoSecondsController {
    @Override
    public int hoursToMinuteIntoSeconds(String hours, String minutes) throws Exception {
        int seconds = 0;
        int hourInInt = Integer.parseInt(hours);
        int minuteInInt = Integer.parseInt(minutes);
        seconds = hourInInt * 3600 + minuteInInt * 60;
        return seconds;
    }
}
