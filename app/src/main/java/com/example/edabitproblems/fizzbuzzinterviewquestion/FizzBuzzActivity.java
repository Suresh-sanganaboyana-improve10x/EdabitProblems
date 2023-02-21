package com.example.edabitproblems.fizzbuzzinterviewquestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityFizzBuzzBinding;

public class FizzBuzzActivity extends AppCompatActivity implements FizzBuzzView{

    private ActivityFizzBuzzBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFizzBuzzBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleFizzBuzz();
    }

    @Override
    public void handleFizzBuzz() {
        binding.fizzBuzzBtn.setOnClickListener(v -> {
            String fizzBuzzStr = binding.inputFizzBuzzTxt.getText().toString();
            String findFizzBuzz = new FizzBuzzControllerImpl().findFizzOrBuzz(fizzBuzzStr);
            binding.toastFizzBuzzTxt.setText(findFizzBuzz);
        });
    }
}