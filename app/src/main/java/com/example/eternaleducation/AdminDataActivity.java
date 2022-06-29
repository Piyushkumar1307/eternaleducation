package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AdminDataActivity extends AppCompatActivity {

    Button class9,class10,quest,live_class,videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_data);

        getSupportActionBar().hide();

        class9 = findViewById(R.id.class9);
        class10 = findViewById(R.id.clas10);
        quest = findViewById(R.id.quest);
        live_class = findViewById(R.id.live_class);
        videos = findViewById(R.id.videos);

        class9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clas9();
            }
        });

        class10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clas10();
            }
        });

        quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ques0();
            }
        });

        live_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clas();
            }
        });

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videos();
            }
        });


    }

    private void videos() {
        Intent intent = new Intent(this, AdminvideoActivity.class);
        startActivity(intent);
    }

    private void clas() {
        Intent intent = new Intent(this, AdminClassActivity.class);
        startActivity(intent);
    }

    private void ques0() {
        Intent intent = new Intent(this, Adminquest9Activity.class);
        startActivity(intent);
    }

    private void clas10() {
        Intent intent = new Intent(this, Adminclas10Activity.class);
        startActivity(intent);
    }

    private void clas9() {
        Intent intent = new Intent(this, Adminclas9Activity.class);
        startActivity(intent);
    }
}