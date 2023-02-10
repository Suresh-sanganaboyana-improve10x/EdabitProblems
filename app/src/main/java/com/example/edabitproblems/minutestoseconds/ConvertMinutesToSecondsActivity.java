package com.example.edabitproblems.minutestoseconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.edabitproblems.databinding.ActivityConvertMinutesToSecondsBinding;

public class ConvertMinutesToSecondsActivity extends AppCompatActivity implements MinutesToSecondsView{

    private ActivityConvertMinutesToSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConvertMinutesToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleConvertToMinutes();
    }

    @Override
    public void handleConvertToMinutes() {
        binding.convertToSecondsBtn.setOnClickListener(v -> {
            String minutes = binding.minutesTxt.getText().toString();
            int minToSeconds = new MinutesToSecondControllerImpl().minutesToSeconds(minutes);
            displaySeconds(String.valueOf(minToSeconds));
        });
    }

    @Override
    public void displaySeconds(String message) {
        binding.secondsTxt.setText(message);
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}