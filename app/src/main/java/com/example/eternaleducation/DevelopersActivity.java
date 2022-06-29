package com.example.eternaleducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DevelopersActivity extends AppCompatActivity {
    
    ImageView Git, Insta,feed,Git2,Insta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        getSupportActionBar().hide();

        Git = findViewById(R.id.github);
        Insta = findViewById(R.id.proinsta);
        feed = findViewById(R.id.feed);
        Git2 = findViewById(R.id.github2);
        Insta2 = findViewById(R.id.proinsta2);

        Git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Git("https://github.com/Piyushkumar1307");
            }
        });

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feed("https://www.instagram.com/iamyour_pusssy_cat/");
            }
        });

        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Insta("https://www.instagram.com/treta_company/");
            }
        });

        Git2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Git2("https://github.com/manindra-004");
            }
        });

        Insta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Insta2("https://www.instagram.com/manindraaaa/");
            }
        });
    }

    private void Insta2(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void Git2(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void feed(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void Insta(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void Git(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}