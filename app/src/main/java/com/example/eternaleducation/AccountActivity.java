package com.example.eternaleducation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.squareup.picasso.Picasso;


public class AccountActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView imageView;
    Button logout;
    TextView name, mail;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        getSupportActionBar().hide();

        imageView = findViewById(R.id.signpic);

        //bottom navigation view
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Menu_logout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.Menu_home:
                        startActivity(new Intent(getApplicationContext(),logout.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Menu_settings:
                        startActivity(new Intent(getApplicationContext(),SettingsHomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Menu_logout:
                        return true;
                }
                return false;
            }
        });

        name = findViewById(R.id.nametea);
        mail = findViewById(R.id.mail);
        logout = findViewById(R.id.btnlogout);
        imageView = findViewById(R.id.signpic);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        gsc = GoogleSignIn.getClient(this,gso);

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if (account!=null){
            String Name = account.getDisplayName();
            String Mail = account.getEmail();

            name.setText(Name);
            mail.setText(Mail);
            Uri personPhoto = account.getPhotoUrl();

            Picasso.with(this).load(personPhoto).fit().placeholder(R.mipmap.ic_launcher_round).into(imageView);
            imageView.setVisibility(View.VISIBLE);
        }

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignOut();
            }
        });
    }

    private void SignOut() {

        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                finish();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        });
    }
}