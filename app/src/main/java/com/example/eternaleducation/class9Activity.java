package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class class9Activity extends AppCompatActivity {

    Button math,phy,chem,DPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class9);

        getSupportActionBar().hide();

        math = findViewById(R.id.math);
        phy = findViewById(R.id.physics);
        chem = findViewById(R.id.chem);
        DPP = findViewById(R.id.dpp);

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math();
            }
        });

        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phy();
            }
        });

        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chem();
            }
        });
        DPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DPP();
            }
        });
    }

    private void DPP() {
        Intent intent = new Intent(this, Viewuserdpp9Activity.class);
        startActivity(intent);
    }

    private void chem() {
        Intent intent = new Intent(this, ChemActivity.class);
        startActivity(intent);
    }

    private void phy() {
        Intent intent = new Intent(this, phyActivity.class);
        startActivity(intent);
    }

    private void math() {
        Intent intent = new Intent(this, MathActivity.class);
        startActivity(intent);
    }
}