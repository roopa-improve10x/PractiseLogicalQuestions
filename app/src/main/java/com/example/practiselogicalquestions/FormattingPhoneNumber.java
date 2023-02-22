package com.example.practiselogicalquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.practiselogicalquestions.databinding.ActivityFormattingPhoneNumberBinding;

import java.util.Arrays;

public class FormattingPhoneNumber extends AppCompatActivity {
        ActivityFormattingPhoneNumberBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormattingPhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Formatting Phone Number");
       // formatedPhoneNumber();
    }
    /* void formatedPhoneNumber() {
    binding.phNumberButton.setOnClickListener(v -> {
        String number = binding.phoneNumber.getText().toString();
        int[] num = String.valueOf(number);
        formatPhoneNumber(num);
    });
    }

    public static String formatPhoneNumber(int[] array) {
        try{
            String phoneNumber;
            phoneNumber ="(" + array[0] + array[1] + array[2] + ") " +
                    array[3] + array[4] + array[5] + "-" + array[6] +
                    array[7] + array[8] + array[9];
            System.out.println(phoneNumber);
            return phoneNumber;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }*/
}