package com.example.edabitproblems.checkdivisioblebyfive;

public class CheckIfItIntegerIsDivisibleByFiveControllerImpl implements CheckIfIntegerIsDivisibleByFiveController{
    @Override
    public boolean checkIfIsIntegerIsDivisibleByFive(String n) {
        int nInInt = Integer.parseInt(n);
        boolean result = false;
        if (nInInt%5==0) {
            result = true;
        }
        return result;
    }
}
