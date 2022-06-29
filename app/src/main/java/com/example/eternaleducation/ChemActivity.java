package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChemActivity extends AppCompatActivity {

    Button notes9,lecture9,liveclass9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem);

        getSupportActionBar().hide();

        notes9 = findViewById(R.id.note);
        lecture9 = findViewById(R.id.lecture);
        liveclass9 = findViewById(R.id.live);

        notes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                note();
            }
        });

        lecture9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lecture();
            }
        });

        liveclass9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liveclass();
            }
        });
    }

    private void liveclass() {
        Intent intent = new Intent(this, chemclass9Activity.class);
        startActivity(intent);
    }

    private void lecture() {
        Intent intent = new Intent(this, chemlect9Activity.class);
        startActivity(intent);
    }

    private void note() {
        Intent intent = new Intent(this, ChemnotesActivity.class);
        startActivity(intent);
    }
}