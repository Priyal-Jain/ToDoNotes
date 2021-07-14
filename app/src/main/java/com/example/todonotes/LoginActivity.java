package com.example.todonotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    EditText editTextFullName, editTextUserName;
    MaterialButton materialButtonLogin;
    public String TAG = "LoginActivity" , fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextFullName = findViewById(R.id.editTextFullName);
        editTextUserName = findViewById(R.id.editTextUserName);
        materialButtonLogin = findViewById(R.id.materialButtonLogin);

        fullName = String.valueOf(editTextFullName.getText());

        View.OnClickListener onClickListener = v -> Log.d(TAG,"on Click");
        Intent intent = new Intent(LoginActivity.this, MyNotesActivity.class);
        intent.putExtra("Full_NAME", fullName);
        startActivity(intent);
        
        materialButtonLogin.setOnClickListener(onClickListener);
    }
}