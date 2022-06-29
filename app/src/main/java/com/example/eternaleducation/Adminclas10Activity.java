package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adminclas10Activity extends AppCompatActivity {
    Button math,phy,chem,dpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminclas10);

        getSupportActionBar().hide();

        math = findViewById(R.id.admin10math);
        phy = findViewById(R.id.admin10physics);
        chem = findViewById(R.id.admin10chem);
        dpp = findViewById(R.id.admin10DPP);

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
                dppp();
            }
        });
    }

    private void dppp() {
        Intent intent = new Intent(this, DPP10Activity.class);
        startActivity(intent);
    }

    private void math() {
        Intent intent = new Intent(this, Admin10mathActivity.class);
        startActivity(intent);
    }

    private void phy() {Intent intent = new Intent(this, admin10phyActivity.class);
        startActivity(intent);
    }

    private void chem() {
        Intent intent = new Intent(this, Admin10chemActivity.class);
        startActivity(intent);
    }
}