package com.aniket.libraryapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Adminlogin extends AppCompatActivity {
    ImageButton b1;
    EditText ed1, ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        b1 = (ImageButton) findViewById(R.id.imageButton);
        ed1 = (EditText) findViewById(R.id.editTextTextPersonName);
        ed2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1.getText().toString().equals("Aniket17") &&
                        ed2.getText().toString().equals("12345")) {
                    Toast.makeText(getApplicationContext(),
                            "Login Scuessfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Adminlogin.this, Dashboard.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
    public void openNewActivity() {
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        }
    }
