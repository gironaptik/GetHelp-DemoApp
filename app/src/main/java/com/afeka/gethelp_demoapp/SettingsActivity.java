package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SettingsActivity extends AppCompatActivity {

    private String Status = "status";
    String whereTo = "empty";
    ImageView viStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().hide();
    }

    public void jump2(View view) {
        Intent activityChangeIntent = new Intent(this, NewRequestActivity.class);
        activityChangeIntent.putExtra(Status, whereTo);
        this.startActivity(activityChangeIntent);
    }
}
