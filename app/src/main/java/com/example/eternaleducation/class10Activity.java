package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class class10Activity extends AppCompatActivity {

    Button math,phy,chem,dpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10);

        getSupportActionBar().hide();

        math = findViewById(R.id.mathh);
        phy = findViewById(R.id.physicss);
        chem = findViewById(R.id.chemm);
        dpp = findViewById(R.id.dppp);

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
        dpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dp();
            }
        });
    }

    private void dp() {
        Intent intent = new Intent(this, Viewuserdpp10Activity.class);
        startActivity(intent);
    }

    private void chem() {
        Intent intent = new Intent(this, ChemmActivity.class);
        startActivity(intent);
    }

    private void phy() {
        Intent intent = new Intent(this, PhyssActivity.class);
        startActivity(intent);
    }

    private void math() {

        Intent intent = new Intent(this, MathssActivity.class);
        startActivity(intent);
    }
}