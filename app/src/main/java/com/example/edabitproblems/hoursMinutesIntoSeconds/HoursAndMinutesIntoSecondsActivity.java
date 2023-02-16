package com.example.edabitproblems.hoursMinutesIntoSeconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityHoursAndMinutesIntoSecondsBinding;

public class HoursAndMinutesIntoSecondsActivity extends AppCompatActivity implements HoursToMinIntoSecondsView{

    private ActivityHoursAndMinutesIntoSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHoursAndMinutesIntoSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        convertHoursToMinutesIntoSeconds();
    }

    @Override
    public void convertHoursToMinutesIntoSeconds() {
        binding.cnrtHrToMinSecBtn.setOnClickListener(v -> {
            String hours = binding.hoursTxt.getText().toString();
            String minutes = binding.minutesTxt.getText().toString();
            int hoursToMinIntoSec = 0;
            try {
                hoursToMinIntoSec = new HoursToMinIntoSecondsImpl().hoursToMinuteIntoSeconds(hours, minutes);
                getSeconds(String.valueOf(hoursToMinIntoSec));
            } catch (Exception e) {
                e.printStackTrace();
                getSeconds("Invalid input");
            }
        });
    }

    @Override
    public void getSeconds(String message) {
        binding.secondsTxt.setText(message);
        binding.secondsTxt.setVisibility(View.VISIBLE);

    }
}