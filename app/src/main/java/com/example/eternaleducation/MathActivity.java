package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathActivity extends AppCompatActivity {

    Button note,lecture,liveclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        getSupportActionBar().hide();

        note = findViewById(R.id.mathnote);
        lecture= findViewById(R.id.mathlecture);
        liveclass = findViewById(R.id.mathclass);

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathnote();
            }
        });

        lecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathlecture();
            }
        });

        liveclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathclass();
            }
        });


    }

    private void mathclass() {
        Intent intent = new Intent(this, Mathclass9Activity.class);
        startActivity(intent);
    }

    private void mathlecture() {
        Intent intent = new Intent(this, Mathlet9Activity.class);
        startActivity(intent);
    }

    private void mathnote() {
        Intent intent = new Intent(this, MathnotesActivity.class);
        startActivity(intent);
    }
}