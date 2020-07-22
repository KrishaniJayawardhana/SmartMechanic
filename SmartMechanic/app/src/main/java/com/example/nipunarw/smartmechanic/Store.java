package com.example.nipunarw.smartmechanic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Store extends AppCompatActivity {

    Button add;
    Button req;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        add = (Button) findViewById(R.id.stadd);
        add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".StoreAdd");
                        startActivity(intent);

                    }
                }
        );

        req = (Button) findViewById(R.id.streq);
        req.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".StoreReq");
                        startActivity(intent);

                    }
                }
        );
    }
}
