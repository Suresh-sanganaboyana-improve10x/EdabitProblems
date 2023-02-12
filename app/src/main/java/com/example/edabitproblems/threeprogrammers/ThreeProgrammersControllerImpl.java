package com.example.edabitproblems.threeprogrammers;

public class ThreeProgrammersControllerImpl implements ThreeProgrammersController{


    @Override
    public int getDifferenceMaxAndMin(String pr1, String pr2, String pr3) {
        int pr1Salary = Integer.parseInt(pr1);
        int pr2Salary = Integer.parseInt(pr2);
        int pr3Salary = Integer.parseInt(pr3);
        int maxAmount = findMax(pr1Salary, pr2Salary, pr3Salary);
        int minAmount = findMin(pr1Salary, pr2Salary, pr3Salary);
        return maxAmount - minAmount;
    }

    @Override
    public int findMax(int pr1, int pr2, int pr3) {
        if (pr1 > pr2 && pr1 > pr3) {
            return pr1;
        } else if (pr2 > pr3) {
            return pr2;
        } else {
            return pr3;
        }
    }

    @Override
    public int findMin(int pr1, int pr2, int pr3) {
        if (pr1 < pr2 && pr1 < pr3) {
            return pr1;
        } else if (pr2 < pr3) {
            return pr2;
        } else {
            return pr3;
        }
    }
}
