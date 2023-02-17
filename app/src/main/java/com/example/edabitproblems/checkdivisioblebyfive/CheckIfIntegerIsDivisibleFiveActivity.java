package com.example.edabitproblems.checkdivisioblebyfive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityCheckIfIntegerIsDivisibleFiveBinding;

public class CheckIfIntegerIsDivisibleFiveActivity extends AppCompatActivity implements CheckIfIntegerIsDivisibleByFiveView {

    private ActivityCheckIfIntegerIsDivisibleFiveBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckIfIntegerIsDivisibleFiveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleIsDivisibleByFive();
    }

    @Override
    public void handleIsDivisibleByFive() {
        binding.handleDivisionBtn.setOnClickListener(v -> {
            String divisible = binding.nValueTxt.getText().toString();
            boolean fiveDivision = new CheckIfItIntegerIsDivisibleByFiveControllerImpl().checkIfIsIntegerIsDivisibleByFive(divisible);
            binding.isDivisionToastTxt.setText(String.valueOf(fiveDivision));
            binding.isDivisionToastTxt.setVisibility(View.VISIBLE);
        });
    }
}