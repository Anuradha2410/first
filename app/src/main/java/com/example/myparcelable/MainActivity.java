package com.example.myparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.myparcelable.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<EditText> etList = new ArrayList<>();
        etList.add(binding.etName);
        etList.add(binding.etAge);
        etList.add(binding.etRollNo);
        etList.add(binding.etDOB);

        binding.button.setOnClickListener(view ->{
            if(this.validate(etList)){
                Students student = new Students();
                student.setmName(binding.etName.getText().toString());
                student.setmAge(Integer.parseInt(binding.etAge.getText().toString()));
                student.setmRollNo(binding.etRollNo.getText().toString());
                student.setmDOB(binding.etDOB.getText().toString());

                Intent in = new Intent(MainActivity.this, MainActivity2.class);
                in.putExtra("data",student);
                startActivity(in);
            }
        });

    }

    private boolean validate(ArrayList<EditText> etList){
        for(EditText et: etList){
            if(!hasText(et,"Required")) return false;
        }
        return true;
    }


    private boolean hasText(EditText editText, String error_message){

        String text = editText.getText().toString().trim();

        editText.setError(null);

        if(text.length() == 0){
            editText.setError(error_message);
            return false;
        }
        return true;
    }
}






