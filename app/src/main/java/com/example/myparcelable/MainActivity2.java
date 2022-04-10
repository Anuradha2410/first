package com.example.myparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myparcelable.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Students student = getIntent().getParcelableExtra("data");

        binding.tvName.setText(student.getmName());
        binding.tvAge.setText(String.valueOf(student.getmAge()));
        binding.tvRollNo.setText(student.getmRollNo());
        binding.tvDOB.setText(student.getmDOB());
    }
}