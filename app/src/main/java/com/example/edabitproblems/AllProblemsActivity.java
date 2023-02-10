package com.example.edabitproblems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.edabitproblems.minutestoseconds.ConvertMinutesToSecondsActivity;
import com.example.edabitproblems.threeprogrammers.ThreeProgrammersActivity;

public class AllProblemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_problems);
        threeProgrammers();
        convertMinutesIntoSeconds();
    }

    private void threeProgrammers() {
        Button threeProgrammersBtn = findViewById(R.id.three_programmers_btn);
        threeProgrammersBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThreeProgrammersActivity.class);
            startActivity(intent);
        });
    }

    private void convertMinutesIntoSeconds() {
        Button minutesSecondsBtn = findViewById(R.id.minutes_seconds_btn);
        minutesSecondsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ConvertMinutesToSecondsActivity.class);
            startActivity(intent);
        });
    }
}