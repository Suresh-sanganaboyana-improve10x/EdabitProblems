package com.example.edabitproblems.nthevennumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityNthEvenNumberBinding;

public class NthEvenNumberActivity extends AppCompatActivity implements NthEvenNumberView{

    private ActivityNthEvenNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNthEvenNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleFindNthEvenNumber();
    }

    @Override
    public void handleFindNthEvenNumber() {
        binding.nthEvenBtn.setOnClickListener(v -> {
            String nth = binding.inputEvenTxt.getText().toString();
            int findNth = new NthEvenNumberControllerImpl().findNthEvenNumber(nth);
            binding.toastEvenTxt.setText(String.valueOf(findNth));
        });
    }
}