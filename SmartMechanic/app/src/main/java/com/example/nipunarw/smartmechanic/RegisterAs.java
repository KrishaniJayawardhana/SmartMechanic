package com.example.nipunarw.smartmechanic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterAs extends AppCompatActivity {
    Button customer;
    Button mechanic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg_as);
        customer = (Button) findViewById(R.id.c_btn);
        customer.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Customer");
                        startActivity(intent);

                    }
                }
        );
        mechanic = (Button) findViewById(R.id.m_btn);
        mechanic.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Mechanic");
                        startActivity(intent);

                    }
                }
        );
    }
}
