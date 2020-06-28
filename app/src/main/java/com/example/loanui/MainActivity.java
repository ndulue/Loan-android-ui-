package com.example.loanui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button applyLoan;
    Button loanCalculator;
    Button loanApproved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applyLoan = findViewById(R.id.applyLoan);
        applyLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ApplyLoanActivity.class));
            }
        });


        loanApproved = findViewById(R.id.loanApproved);
        loanApproved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoanAprovedActivity.class));
            }
        });

        loanCalculator = findViewById(R.id.loanCalculator);
        loanCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoanCalculatorActivity.class));
            }
        });
    }
}
