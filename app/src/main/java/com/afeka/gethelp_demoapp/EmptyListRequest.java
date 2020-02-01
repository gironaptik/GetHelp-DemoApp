package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmptyListRequest extends AppCompatActivity {


    private String Status = "status";
    String whereTo = "empty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_list_request);
        getSupportActionBar().hide();
    }

    public void finalRequest(View view){
        Intent activityChangeIntent = new Intent(this, NewRequestActivity.class);
        activityChangeIntent.putExtra(Status, whereTo);
        this.startActivity(activityChangeIntent);
    }
}
