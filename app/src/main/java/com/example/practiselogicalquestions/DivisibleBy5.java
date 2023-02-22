package com.example.practiselogicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practiselogicalquestions.databinding.ActivityDivisibleBy5Binding;

public class DivisibleBy5 extends AppCompatActivity {

    ActivityDivisibleBy5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDivisibleBy5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Divisible By 5");
        isDivisibleBy5();
    }
    void isDivisibleBy5() {
        binding.checkBtn.setOnClickListener(v -> {
            String number = binding.enterNameTxt.getText().toString();
            int num = Integer.valueOf(number);
            boolean result = isDivisibleByFive(num);
            String output = String.valueOf(result);
            binding.enterNumber.setText(output);
        });
    }

    public static boolean isDivisibleByFive(int n) {
        boolean result = false;
        if(n % 5 == 0) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}