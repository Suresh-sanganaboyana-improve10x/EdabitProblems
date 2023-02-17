package com.example.edabitproblems.findthediscount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.edabitproblems.R;
import com.example.edabitproblems.databinding.ActivityFindTheDiscountBinding;

public class FindTheDiscountActivity extends AppCompatActivity implements FindTheDiscountView{

    private ActivityFindTheDiscountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindTheDiscountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleFindTheDiscount();
    }

    @Override
    public void handleFindTheDiscount() {
        binding.discountBtn.setOnClickListener(v -> {
            String priceText = binding.priceTxt.getText().toString();
            String percentageText = binding.discountPercentageTxt.getText().toString();
            int finalPrice = new FindTheDiscountControllerImpl().getDiscount(priceText, percentageText);
            binding.toastDiscountTxt.setText(String.valueOf(finalPrice));
            binding.toastDiscountTxt.setVisibility(View.VISIBLE);
        });
    }
}