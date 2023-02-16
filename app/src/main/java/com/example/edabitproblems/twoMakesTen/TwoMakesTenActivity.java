package com.example.edabitproblems.twoMakesTen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityTwoMakesTenBinding;

public class TwoMakesTenActivity extends AppCompatActivity implements TwoMakesTenView{

    private ActivityTwoMakesTenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwoMakesTenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleTwoMakesTen();
    }

    @Override
    public void handleTwoMakesTen() {
        binding.twoMakesTenBtn.setOnClickListener(v -> {
            String firstParam = binding.firstParamTxt.getText().toString();
            String secondParam = binding.secondParamTxt.getText().toString();
            boolean twoMakesTen = false;
            try {
                twoMakesTen = new TwoMakesTenControllerImpl().isTwoMakesTen(firstParam, secondParam);
                binding.returnTxt.setText(String.valueOf(twoMakesTen));
                binding.returnTxt.setVisibility(View.VISIBLE);
            } catch (Exception e) {
                e.printStackTrace();
                binding.returnTxt.setText("Invalid output");

            }
        });
    }
}