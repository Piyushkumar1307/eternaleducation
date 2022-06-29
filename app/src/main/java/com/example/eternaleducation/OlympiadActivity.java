package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OlympiadActivity extends AppCompatActivity {
    Button math,phy,chem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olympiad);

        getSupportActionBar().hide();

        math = findViewById(R.id.matholym);
        phy = findViewById(R.id.physicsolympi);
        chem = findViewById(R.id.chemolympi);


        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matholymp();
            }
        });

        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phyolymp();
            }
        });

        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chemolymp();
            }
        });


    }

    private void chemolymp() {
        Intent intent = new Intent(this, Chemolympctivity.class);
        startActivity(intent);
    }

    private void phyolymp() {
        Intent intent = new Intent(this, PhyolympActivity.class);
        startActivity(intent);
    }

    private void matholymp() {
        Intent intent = new Intent(this, MatholympActivity.class);
        startActivity(intent);
    }
}