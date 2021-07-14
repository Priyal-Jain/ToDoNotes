package com.example.todonotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyNotesActivity extends AppCompatActivity {

    String TAG = "MyNotesActivity" , fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notes);

        Intent intent = getIntent();
        fullName = intent.getStringExtra("full_name");
        Log.d(TAG,fullName);

        getSupportActionBar().setTitle(fullName);
    }
}