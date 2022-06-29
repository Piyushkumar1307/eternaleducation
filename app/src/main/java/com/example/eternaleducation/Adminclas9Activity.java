package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adminclas9Activity extends AppCompatActivity {

    Button math,phy,chem,dpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminclas9);

        getSupportActionBar().hide();

        math = findViewById(R.id.admin9math);
        phy = findViewById(R.id.admin9physics);
        chem = findViewById(R.id.admin9chem);
        dpp = findViewById(R.id.admin9DPP);

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
                dop();
            }
        });
    }

    private void dop() {
        Intent intent = new Intent(this, DPP9Activity.class);
        startActivity(intent);
    }

    private void math() {
        Intent intent = new Intent(this, Admin9mathActivity.class);
        startActivity(intent);
    }

    private void phy() {
        Intent intent = new Intent(this, Admin9phyActivity.class);
        startActivity(intent);
    }

    private void chem() {
        Intent intent = new Intent(this, Admin9chemActivity.class);
        startActivity(intent);
    }
}