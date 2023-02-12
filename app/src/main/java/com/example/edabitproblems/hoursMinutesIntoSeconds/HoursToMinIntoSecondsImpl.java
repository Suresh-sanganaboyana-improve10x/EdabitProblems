package com.example.edabitproblems.hoursMinutesIntoSeconds;

public class HoursToMinIntoSecondsImpl implements HoursToMinIntoSecondsController{
    @Override
    public int hoursToMinuteIntoSeconds(String hours, String minutes) {
        int hourInInt = Integer.parseInt(hours);
        int minuteInInt = Integer.parseInt(minutes);
        int seconds = hourInInt * 3600 + minuteInInt * 60;
        return seconds;
    }
}
