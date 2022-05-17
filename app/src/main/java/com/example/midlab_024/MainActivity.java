package com.example.midlab_024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mcqs;
    String[]  ques1 = {"An Ostrich eye is bigger than its brain", "Bats are blind", "Polar bears have black skin"};
    Boolean[] ans = {true, false};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mcqs = findViewById(R.id.txt);
        mcqs.setText("");
    }
}