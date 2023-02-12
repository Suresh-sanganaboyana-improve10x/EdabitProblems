package com.example.edabitproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.edabitproblems.databinding.ActivityAllProblemsBinding;
import com.example.edabitproblems.databinding.ActivityMainBinding;
import com.example.edabitproblems.hoursMinutesIntoSeconds.HoursAndMinutesIntoSecondsActivity;
import com.example.edabitproblems.minutestoseconds.ConvertMinutesToSecondsActivity;
import com.example.edabitproblems.threeprogrammers.ThreeProgrammersActivity;

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
}