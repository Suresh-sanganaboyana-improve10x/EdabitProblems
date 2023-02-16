package com.example.edabitproblems.lessthanhundred;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityLessthanHundredBinding;

public class LessThanHundredActivity extends AppCompatActivity implements LessThanHundredView{

    private ActivityLessthanHundredBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLessthanHundredBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleIsLessThanHundred();
    }

    @Override
    public void handleIsLessThanHundred() {
        binding.findLessThanBtn.setOnClickListener(v -> {
            String one = binding.text1.getText().toString();
            String two = binding.text2.getText().toString();
            boolean findHundred = false;
            try {
                findHundred = new LessThanHundredControllerImpl().findIsLessThanHundred(one, two);
            } catch (Exception e) {
                e.printStackTrace();
            }
            binding.booleanText.setText(String.valueOf(findHundred));
            binding.booleanText.setVisibility(View.VISIBLE);
        });
    }
}