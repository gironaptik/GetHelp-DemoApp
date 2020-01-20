package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        getSupportActionBar().hide();
    }

    public void next(View view){
        startActivity(new Intent(this, SendingRequest.class));

    }

    public void backRequestScreen(View view){
        startActivity(new Intent(this, NewRequestActivity.class));

    }
}
