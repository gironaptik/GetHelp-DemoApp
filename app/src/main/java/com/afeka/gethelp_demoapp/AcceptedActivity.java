package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcceptedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accepted);
        getSupportActionBar().hide();

    }

    public void finalRequest(View view){
        startActivity(new Intent(this, VolunteerTable.class));
    }

    @Override
    public void onBackPressed() {

    }
}
