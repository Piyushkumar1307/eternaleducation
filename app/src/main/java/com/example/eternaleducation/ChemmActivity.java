package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChemmActivity extends AppCompatActivity {
    Button notes10,lecture10,liveclass10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemm);

        getSupportActionBar().hide();

        notes10 = findViewById(R.id.chemnote);
        lecture10 = findViewById(R.id.chemlecture);
        liveclass10 = findViewById(R.id.chemclass);

        notes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chemnote();
            }
        });

        lecture10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chemlect();
            }
        });

        liveclass10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chemclass();
            }
        });
    }

    private void chemclass() {
        Intent intent = new Intent(this, chemclass10Activity.class);
        startActivity(intent);
    }

    private void chemlect() {
        Intent intent = new Intent(this, chemlect10Activity.class);
        startActivity(intent);
    }

    private void chemnote() {
        Intent intent = new Intent(this, chemnote10Activity.class);
        startActivity(intent);
    }
}