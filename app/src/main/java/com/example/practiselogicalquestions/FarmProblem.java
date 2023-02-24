package com.example.practiselogicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practiselogicalquestions.databinding.ActivityFarmProblemBinding;

public class FarmProblem extends AppCompatActivity {
    ActivityFarmProblemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFarmProblemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Farm Problem");
        findTotalLegs();
    }
    void findTotalLegs() {
        binding.checkBtn.setOnClickListener(v -> {
            String chickens = binding.chickenTxt.getText().toString();
            int chickenLegs = Integer.valueOf(chickens);
            String cows = binding.cowsTxt.getText().toString();
            int cowLegs = Integer.valueOf(cows);
            String pigs = binding.pigsTxt.getText().toString();
            int pigLegs = Integer.valueOf(pigs);
            int result = findTotalLegs(chickenLegs, cowLegs, pigLegs);
            binding.totalLegsTxt.setText(String.valueOf(result));
        });
    }

    public static int findTotalLegs(int noOfChickens, int noOfCows, int noOfPigs) {
        int chickenLegs = noOfChickens * 2;
        int cowLegs = noOfCows * 4;
        int pigLegs = noOfPigs * 4;
        int totalLegs = chickenLegs + cowLegs + pigLegs;
        System.out.print("Total Legs : ");
        System.out.println(totalLegs);
        return totalLegs;
    }
}