package com.example.practiselogicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practiselogicalquestions.databinding.ActivityDivisibleBy15Binding;

public class DivisibleBy15 extends AppCompatActivity {

    ActivityDivisibleBy15Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    binding = ActivityDivisibleBy15Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Divisible by 15");
        isDivisibleBy15();
    }

    void isDivisibleBy15() {
    binding.checkBtn.setOnClickListener(v -> {
        String number = binding.enterNameTxt.getText().toString();
        int num = Integer.valueOf(number);
        boolean result = isDivisibleByFifteen(num);
        String output = String.valueOf(result);
        binding.resultTxt.setText(output);
    });
    }

    public static boolean isDivisibleByFifteen(int n) {
        boolean result = false;
        if(n % 15 == 0) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

}