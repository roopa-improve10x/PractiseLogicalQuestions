package com.example.practiselogicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practiselogicalquestions.databinding.ActivityDiscountBinding;

public class Discount extends AppCompatActivity {

    ActivityDiscountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiscountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Find Discount");
        findDiscount();
    }

    void findDiscount() {
        binding.checkBtn.setOnClickListener(v -> {
            String price = binding.originalPriceTxt.getText().toString();
            int originalPrice = Integer.valueOf(price);
            String discount = binding.discountPercetageTxt.getText().toString();
            int discPrice = Integer.valueOf(discount);
            double finalPrice = findTheDiscount(originalPrice, discPrice);
            binding.finalPriceTxt.setText(String.valueOf(finalPrice));
        });

    }

    public static double findTheDiscount(int originalPrice, int discountPercentage) {
        double finalPrice;
        int discountRate = originalPrice * discountPercentage/100;
        finalPrice = originalPrice-discountRate;
        System.out.println(finalPrice);
        return finalPrice;
    }
}