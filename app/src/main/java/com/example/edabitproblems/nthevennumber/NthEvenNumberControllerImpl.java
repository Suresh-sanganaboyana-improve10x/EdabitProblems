package com.example.edabitproblems.nthevennumber;

public class NthEvenNumberControllerImpl implements NthEvenNumberController{
    @Override
    public int findNthEvenNumber(String n) {
       int ninInt = Integer.parseInt(n);
       int evenNumber =0;
       evenNumber = 2*ninInt-2;
        return evenNumber;
    }
}
