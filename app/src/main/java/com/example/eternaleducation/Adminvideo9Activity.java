package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adminvideo9Activity extends AppCompatActivity {

    Button math,phy,chem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminvideo9);

        getSupportActionBar().hide();

        math = findViewById(R.id.admin9math);
        phy = findViewById(R.id.admin9physics);
        chem = findViewById(R.id.admin9chem);

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
    }

    private void math() {
        Intent intent = new Intent(this, Adminvideo9Activity.class);
        startActivity(intent);
    }

    private void phy() {
        Intent intent = new Intent(this, Adminvideo9Activity.class);
        startActivity(intent);
    }

    private void chem() {
        Intent intent = new Intent(this, Adminvideo9Activity.class);
        startActivity(intent);
    }
}