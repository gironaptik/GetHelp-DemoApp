package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class ListRequestActivity extends AppCompatActivity {

    private String Status = "status";
    String whereTo = "withRequest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_request);
        getSupportActionBar().hide();
    }

    public void cancelRequest(View view){
        startActivity(new Intent(this, CancelActivity.class));
        TableLayout requestTable = findViewById(R.id.requestTable);
        requestTable.removeView(view);
    }

    public void acceptRequest(View view){
        startActivity(new Intent(this, AcceptedActivity.class));

    }

    public void finalRequest(View view){
        Intent activityChangeIntent = new Intent(this, NewRequestActivity.class);
        activityChangeIntent.putExtra(Status, whereTo);
        this.startActivity(activityChangeIntent);

    }
}
