package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phyActivity extends AppCompatActivity {
    Button phynote,phylecture,phyclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy);

        getSupportActionBar().hide();

        phynote = findViewById(R.id.phynote);
        phylecture = findViewById(R.id.phylecture);
        phyclass = findViewById(R.id.phyclass);

        phynote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                note();
            }
        });

        phylecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lecture();
            }
        });

        phyclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clas();
            }
        });
    }

    private void clas() {
        Intent intent = new Intent(this, phyclass9Activity.class);
        startActivity(intent);
    }

    private void lecture() {
        Intent intent = new Intent(this, phylect9Activity.class);
        startActivity(intent);
    }

    private void note() {
        Intent intent = new Intent(this, phynotesActivity.class);
        startActivity(intent);
    }
}