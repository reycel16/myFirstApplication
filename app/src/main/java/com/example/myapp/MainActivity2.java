package com.example.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView;
        Button showBtn;
        EditText inputText;

        showBtn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        inputText = findViewById(R.id.editTextText);
        showBtn.setOnClickListener(view -> textView.setText("Hi " + inputText.getText()));
        }

    }
