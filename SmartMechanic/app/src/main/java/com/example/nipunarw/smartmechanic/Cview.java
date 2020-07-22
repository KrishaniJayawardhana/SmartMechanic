package com.example.nipunarw.smartmechanic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cview extends AppCompatActivity {
    Button report;
    Button book;
    Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cview);
        report = (Button) findViewById(R.id.btnreport2);
        report.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Report");
                        startActivity(intent);

                    }
                }
        );

        book = (Button) findViewById(R.id.btnstatus);
        book.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Booking");
                        startActivity(intent);
                    }
                }
        );

        profile = (Button) findViewById(R.id.btnmprofile);
        profile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Mprofile");
                        startActivity(intent);
                    }
                }
        );
    }
}