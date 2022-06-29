package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhyssActivity extends AppCompatActivity {
    Button notes10,lecture10,liveclass10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physs);

        getSupportActionBar().hide();

        notes10 = findViewById(R.id.phynote10);
        lecture10 = findViewById(R.id.physicslect10);
        liveclass10 = findViewById(R.id.phyclass10);

        notes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                note();
            }
        });

        lecture10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lecture();
            }
        });

        liveclass10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liveclass();
            }
        });
    }

    private void liveclass() {
        Intent intent = new Intent(this, phyliveclass10Activity.class);
        startActivity(intent);
    }

    private void lecture() {
        Intent intent = new Intent(this, phylect10Activity.class);
        startActivity(intent);
    }

    private void note() {
        Intent intent = new Intent(this, Phyclass10Activity.class);
        startActivity(intent);
    }
}