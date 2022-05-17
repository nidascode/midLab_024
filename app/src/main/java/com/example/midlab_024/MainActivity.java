package com.example.midlab_024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView mcqs;
    String[]  ques1 = {"An Ostrich eye is bigger than its brain", "Bats are blind", "Polar bears have black skin"};
    Boolean[] ans = {true, false, true};
    private Spinner spinner;
    private Button check;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mcqs = findViewById(R.id.txt1);
        check = findViewById(R.id.btn);
        spinner = findViewById(R.id.spinner);

    }

    @Override
    protected void onResume() {
        super.onResume();
        selectMcq();

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectAns = spinner.getSelectedItem().toString();
                if ((selectAns.equals("True") && ans[num])== true || (selectAns.equals("False") && ans[num])==false)
                {
                    Toast.makeText(MainActivity.this, "ans is correct", Toast.LENGTH_SHORT).show();
                    selectMcq();
                }
                else
                    Toast.makeText(MainActivity.this, "ans is false", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void selectMcq() {
        num = getRandomNumberInRange(0,2);
        mcqs.setText(ques1[num]);
    }

    private int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}