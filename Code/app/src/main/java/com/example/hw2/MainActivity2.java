package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView name5= findViewById(R.id.NameTV);
        TextView age5= findViewById(R.id.AgeTV);
        TextView job5= findViewById(R.id.JoBTV);
        TextView PN5= findViewById(R.id.pntv);
        TextView email5= findViewById(R.id.emailTV);




        Bundle Bundle = getIntent().getExtras();

        String name3 = Bundle.getString("itemname");
        int age3 = Bundle.getInt("itemage");
        String Job3 =   Bundle.getString("itemjob");
        int PN3 = Bundle.getInt("itemPN");
        String email3 = Bundle.getString("itememail");


        name5.setText(name3);
        age5.setText(String.valueOf(age3));
        job5.setText(Job3);
        PN5.setText(String.valueOf(PN3));
        email5.setText(email3);
    }
}