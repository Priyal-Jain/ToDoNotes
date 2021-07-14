package com.example.todonotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public String TAG = "MainActivityLog";
    Boolean isLoggedin = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG,"onRestart");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"onStart");
        super.onStart();
        checkLoginStatus();
    }

    public void checkLoginStatus() {
        if(isLoggedin){
            Log.d(TAG,"LoggedIn");
        } else {
            Log.d(TAG,"Log Out");
        }
    }

    @Override
    protected void onResume() {
        Log.d(TAG,"onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG,"onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop");
        super.onStop();
        isLoggedin = false;
    }
}