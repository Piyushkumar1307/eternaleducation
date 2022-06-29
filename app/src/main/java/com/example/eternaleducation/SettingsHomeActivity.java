package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsHomeActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Button about,Teacher,developes,utube,Insta,course;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_home);

        getSupportActionBar().hide();

        about = findViewById(R.id.about_us);
        Teacher = findViewById(R.id.Teacher);
        developes = findViewById(R.id.developers);
        utube = findViewById(R.id.utube);
        Insta = findViewById(R.id.Insta);
        course = findViewById(R.id.course);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aboutus();
            }
        });

        Teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teach();
            }
        });

        developes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                develop();
            }
        });

        utube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                utubee("https://www.youtube.com/channel/UCfWXRT72MvZ3i2UAu9T99ng/videos");
            }
        });

        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Instag("https://www.instagram.com/treta_company/");
            }
        });

        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cours();
            }
        });

        //bottom navigation view
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Menu_settings);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.Menu_home:
                        startActivity(new Intent(getApplicationContext(),logout.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Menu_settings:
                        return true;

                    case R.id.Menu_logout:
                        startActivity(new Intent(getApplicationContext(),AccountActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    private void Instag(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void utubee(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void cours() {
        Intent intent = new Intent(this, UpcomingcousreActivity.class);
        startActivity(intent);
    }

    private void develop() {
        Intent intent = new Intent(this, DevelopersActivity.class);
        startActivity(intent);
    }

    private void teach() {
        Intent intent = new Intent(this, TeachersActivity.class);
        startActivity(intent);
    }

    private void aboutus() {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }
}