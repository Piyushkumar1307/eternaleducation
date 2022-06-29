package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminClassActivity extends AppCompatActivity {

    Button adminclass9,adminclass10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_class);

        getSupportActionBar().hide();

        adminclass9 = findViewById(R.id.adminclass9);
        adminclass10 = findViewById(R.id.adminclas10);

        adminclass9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clas9();
            }
        });

        adminclass10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clas10();
            }
        });
    }

    private void clas10() {
        Intent intent = new Intent(this, Adminlive10Activity.class);
        startActivity(intent);
    }

    private void clas9() {
        Intent intent = new Intent(this, Adminlive9Activity.class);
        startActivity(intent);
    }
}