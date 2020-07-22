package com.example.nipunarw.smartmechanic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mview extends AppCompatActivity {

    Button store;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mview);

        store = (Button) findViewById(R.id.btnstore2);
        store.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Store");
                        startActivity(intent);

                    }
                }
        );
    }
}
