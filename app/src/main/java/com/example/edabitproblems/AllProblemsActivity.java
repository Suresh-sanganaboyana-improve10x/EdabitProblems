package com.example.edabitproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.edabitproblems.checkdivisioblebyfive.CheckIfIntegerIsDivisibleFiveActivity;
import com.example.edabitproblems.databinding.ActivityAllProblemsBinding;
import com.example.edabitproblems.databinding.ActivityMainBinding;
import com.example.edabitproblems.findthediscount.FindTheDiscountActivity;
import com.example.edabitproblems.hoursMinutesIntoSeconds.HoursAndMinutesIntoSecondsActivity;
import com.example.edabitproblems.lessthanhundred.LessThanHundredActivity;
import com.example.edabitproblems.minutestoseconds.ConvertMinutesToSecondsActivity;
import com.example.edabitproblems.nthevennumber.NthEvenNumberActivity;
import com.example.edabitproblems.threeprogrammers.ThreeProgrammersActivity;
import com.example.edabitproblems.twoMakesTen.TwoMakesTenActivity;

public class AllProblemsActivity extends AppCompatActivity {

    private ActivityAllProblemsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAllProblemsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        threeProgrammers();
        convertMinutesIntoSeconds();
        convertHoursToMinutesIntoSeconds();
        twoMakesTen();
        findLessThanHundredBtn();
        checkIfIsDivisibleByFive();
        findDiscount();
        findNthEvenNUmber();
    }

    private void findNthEvenNUmber() {
        binding.findNthEvenNumBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, NthEvenNumberActivity.class);
            startActivity(intent);
        });
    }

    private void threeProgrammers() {
        binding.threeProgrammersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThreeProgrammersActivity.class);
            startActivity(intent);
        });
    }

    private void convertMinutesIntoSeconds() {
        binding.minutesSecondsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ConvertMinutesToSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void convertHoursToMinutesIntoSeconds() {
        binding.hoursMinutesSecondsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, HoursAndMinutesIntoSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void twoMakesTen() {
        binding.twoTenBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TwoMakesTenActivity.class);
            startActivity(intent);
        });
    }

    private void findLessThanHundredBtn() {
        binding.lessThanHundredBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, LessThanHundredActivity.class);
            startActivity(intent);
        });
    }

    private void checkIfIsDivisibleByFive() {
        binding.checkIfDivisibleBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckIfIntegerIsDivisibleFiveActivity.class);
            startActivity(intent);
        });
    }

    private void findDiscount() {
        binding.findDisBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, FindTheDiscountActivity.class);
            startActivity(intent);
        });
    }
}