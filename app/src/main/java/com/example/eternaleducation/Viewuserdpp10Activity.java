package com.example.eternaleducation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Viewuserdpp10Activity extends AppCompatActivity {

    ListView myPdfListview;
    DatabaseReference databaseReference;
    List<uploadPDF> uploadPDFs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewuserdpp10);

        getSupportActionBar().hide();

        myPdfListview = (ListView) findViewById(R.id.myListview);
        uploadPDFs = new ArrayList<>();

        viewAllFiles();


        myPdfListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                uploadPDF uploadPDF = uploadPDFs.get(position);


                Intent intent = new Intent();
                intent.setType(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uploadPDF.getUrl()));
                startActivity(intent);
            }
        });
    }

    private void viewAllFiles() {

        databaseReference = FirebaseDatabase.getInstance().getReference("admin10dppupload");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {

                    uploadPDF uploadPDF = postSnapshot.getValue(com.example.eternaleducation.uploadPDF.class);
                    uploadPDFs.add(uploadPDF);
                }

                String[] uploads = new String[uploadPDFs.size()];
                for (int i = 0; i < uploads.length; i++) {
                    uploads[i] = uploadPDFs.get(i).getName();
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, uploads) {

                    @Override
                    public View getView(int position, View convertView, ViewGroup parent) {

                        View view = super.getView(position, convertView, parent);

                        TextView myText = (TextView) view.findViewById(android.R.id.text1);
                        myText.setTextColor(Color.BLACK);
                        return view;
                    }
                };
                myPdfListview.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}