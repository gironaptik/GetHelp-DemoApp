package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_request);
        getSupportActionBar().hide();

    }

    public void jump3(View view) {
        startActivity(new Intent(this, RequestForm1Activity.class));
    }

    public void emergencyScreen(View view){
        startActivity(new Intent(this, EmergencyScreen.class));
    }

    public void limberest(View view){
        startActivity(new Intent(this, ListRequestActivity.class));
    }
}
