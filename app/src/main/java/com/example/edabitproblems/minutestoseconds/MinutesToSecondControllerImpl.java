package com.example.edabitproblems.minutestoseconds;

public class MinutesToSecondControllerImpl implements MinutesToSecondsController{
    @Override
    public int minutesToSeconds(String minutes) {
        int minutesInInt = Integer.parseInt(minutes);
        int seconds = 0;
        seconds = minutesInInt*60;
        return seconds;
    }
}
