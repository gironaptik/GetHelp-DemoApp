package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_request);
        getSupportActionBar().hide();
    }

    public void cancelRequest(View view){
        startActivity(new Intent(this, CancelActivity.class));

    }

    public void acceptRequest(View view){
        startActivity(new Intent(this, AcceptedActivity.class));

    }
}
