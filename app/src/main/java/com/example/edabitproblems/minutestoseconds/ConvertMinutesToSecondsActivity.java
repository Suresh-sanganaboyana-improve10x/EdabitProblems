package com.example.edabitproblems.minutestoseconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.edabitproblems.databinding.ActivityConvertMinutesToSecondsBinding;

public class ConvertMinutesToSecondsActivity extends AppCompatActivity implements MinutesToSecondsView{

    private ActivityConvertMinutesToSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConvertMinutesToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Minutes to seconds");
        handleConvertToMinutes();
    }

    @Override
    public void handleConvertToMinutes() {
        binding.convertToSecondsBtn.setOnClickListener(v -> {
            String minutes = binding.minutesTxt.getText().toString();
            int minToSeconds = 0;
            try {
                minToSeconds = new MinutesToSecondControllerImpl().minutesToSeconds(minutes);
                displaySeconds(String.valueOf(minToSeconds));
            } catch (Exception e) {
                e.printStackTrace();
                displaySeconds("Invalid Input");
            }
        });
    }

    @Override
    public void displaySeconds(String message) {
        binding.secondsTxt.setText(message);
        binding.secondsTxt.setVisibility(View.VISIBLE);
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}