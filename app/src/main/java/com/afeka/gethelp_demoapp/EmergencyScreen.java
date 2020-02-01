package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmergencyScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_screen);
        getSupportActionBar().hide();

    }

    public void emeregencyExit(View view){
        startActivity(new Intent(this, NewRequestActivity.class));
    }

    @Override
    public void onBackPressed() {

    }
}
