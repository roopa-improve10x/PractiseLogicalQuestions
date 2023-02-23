package com.example.practiselogicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.practiselogicalquestions.databinding.ActivityIndexBinding;

public class IndexActivity extends AppCompatActivity {

    ActivityIndexBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIndexBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findIndex();
    }

    void findIndex() {
        binding.phNum.setOnClickListener(v -> {
            Intent intent = new Intent(this, FormattingPhoneNumber.class);
            startActivity(intent);
        });
        binding.divisibleByFive.setOnClickListener(v -> {
            Intent intent = new Intent(this, DivisibleBy5.class);
            startActivity(intent);
        });
        binding.divisibleBy15.setOnClickListener(v -> {
            Intent intent = new Intent(this, DivisibleBy15.class);
            startActivity(intent);
        });
    }

}