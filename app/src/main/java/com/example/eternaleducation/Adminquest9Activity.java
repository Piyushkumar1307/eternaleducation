package com.example.eternaleducation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class Adminquest9Activity extends AppCompatActivity {

    Button OLYMPIAD,JEE,CBSE,NTSE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminquest9);

        getSupportActionBar().hide();

        OLYMPIAD = findViewById(R.id.OLYMPadmin);
        JEE = findViewById(R.id.JEEadmin);
        CBSE = findViewById(R.id.CBSEADMIN);
        NTSE = findViewById(R.id.ntseadmin);

        OLYMPIAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OLYMP();
            }
        });

        JEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JEEADMIN();
            }
        });

        CBSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CBSEADMIN();
            }
        });

        NTSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NTSEADMIN();
            }
        });
    }

    private void NTSEADMIN() {
        Intent intent = new Intent(this, AdminntsequesActivity.class);
        startActivity(intent);
    }

    private void CBSEADMIN() {
        Intent intent = new Intent(this, AdmincbsequesActivity.class);
        startActivity(intent);
    }

    private void JEEADMIN() {
        Intent intent = new Intent(this, AdminjeequesActivity.class);
        startActivity(intent);
    }

    private void OLYMP() {
        Intent intent = new Intent(this, AdminolympquestActivity.class);
        startActivity(intent);
    }
}

