package com.example.edabitproblems.threeprogrammers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityThreeProgrammersBinding;

public class ThreeProgrammersActivity extends AppCompatActivity implements ThreeProgrammersView{

    private ActivityThreeProgrammersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThreeProgrammersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleFindDifference();
    }

    @Override
    public void handleFindDifference() {
        binding.defferenceBtn.setOnClickListener(v -> {
            String pr1Salary = binding.prOneSalary.getText().toString();
            String pr2Salary = binding.prTwoSalary.getText().toString();
            String pr3Salary = binding.prThreeSalary.getText().toString();
            if (pr1Salary.equals("") == false && pr2Salary.equals("") == false && pr3Salary.equals("") == false) {
                int diffMaxAndMin = new ThreeProgrammersControllerImpl().getDifferenceMaxAndMin(pr1Salary, pr2Salary, pr3Salary);
                displayDifferenceTxt(String.valueOf(diffMaxAndMin));
            }
        });
    }

    @Override
    public void displayDifferenceTxt(String message) {
        binding.defferenceTxt.setText(message);
    }
}