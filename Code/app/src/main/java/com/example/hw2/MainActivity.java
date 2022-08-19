package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.nameET);
        EditText age = findViewById(R.id.ageET);
        EditText job = findViewById(R.id.jobET);
        EditText PN = findViewById(R.id.PNET);
        EditText email = findViewById(R.id.EmailET);

        Button button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                CV khaled = new CV ("Khaled", 17, "Doctor", 392949, "kabab@sha76oo6.com");



                intent.putExtra("itemname", khaled.getName());
                intent.putExtra("itemage", khaled.getAge());
                intent.putExtra("itemjob", khaled.getJob());
                intent.putExtra("itemPN", khaled.getPN());
                intent.putExtra("itememail", khaled.getEmail());

                startActivity(intent);
            }
        });


    }
}