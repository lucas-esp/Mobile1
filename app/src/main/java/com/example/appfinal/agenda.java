package com.example.appfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class agenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        getSupportActionBar().setTitle("Agenda telefonica");
    }


}