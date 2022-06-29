package com.example.eternaleducation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class logout extends AppCompatActivity {

    Button logout,olympiad,jee,cbse,ntse;
    //TextView name, mail;
    GridLayout mainnextbtn;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        getSupportActionBar().hide();

        //bottom navigation view
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Menu_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.Menu_home:
                        return true;

                    case R.id.Menu_settings:
                        startActivity(new Intent(getApplicationContext(),SettingsHomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Menu_logout:
                        startActivity(new Intent(getApplicationContext(),AccountActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        mainnextbtn = (GridLayout) findViewById(R.id.mainnextbtn);

        setSingleEvent(mainnextbtn);


        //name = findViewById(R.id.nametea);
        //mail = findViewById(R.id.mail);
        //logout = findViewById(R.id.btnlogout);
        olympiad = findViewById(R.id.olympiad);
        jee = findViewById(R.id.jee);
        cbse = findViewById(R.id.cbse);
        ntse = findViewById(R.id.ntse);

        //gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                //.requestEmail()
                //.build();

        //gsc = GoogleSignIn.getClient(this,gso);

        //GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
       /// if (account!=null){
           // String Name = account.getDisplayName();
            //String Mail = account.getEmail();

           /// name.setText(Name);
           // mail.setText(Mail);
        //}

        //logout.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //SignOut();
            //}
        //});

        olympiad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                olym();
            }
        });

        jee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jee();
            }
        });

        cbse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cbse();
            }
        });

        ntse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ntse();
            }
        });
    }


    private void ntse() {
        Intent intent = new Intent(this, NtseActivity.class);
        startActivity(intent);
    }

    private void cbse() {
        Intent intent = new Intent(this, CbseActivity.class);
        startActivity(intent);
    }

    private void jee() {
        Intent intent = new Intent(this, JeeActivity.class);
        startActivity(intent);
    }

    private void olym() {
        Intent intent = new Intent(this, OlympiadActivity.class);
        startActivity(intent);
    }

    //private void SignOut() {

    //   gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
     //       @Override
      //      public void onComplete(@NonNull Task<Void> task) {
       //         finish();
        //        startActivity(new Intent(getApplicationContext(), MainActivity.class));

          //  }
      //  });
   // }

    private void setSingleEvent(GridLayout mainnextbtn) {
        for (int i=0;i<mainnextbtn.getChildCount();i++)
        {
            CardView cardView =(CardView)mainnextbtn.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(logout.this, class9Activity.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(logout.this, class10Activity.class);
                        startActivity(intent);
                    }

                }
            });

        }

    }

}
