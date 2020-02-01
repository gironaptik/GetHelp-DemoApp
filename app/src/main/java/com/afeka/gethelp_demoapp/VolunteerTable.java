package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class VolunteerTable extends AppCompatActivity {

    TableLayout layout;
    TextView text;
    TextView textMessage;
    private String Status = "status";
    String whereTo = "withRequest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_table);
        getSupportActionBar().hide();
        layout = findViewById(R.id.requestTable);
        textMessage = findViewById(R.id.text5);
    }


    public void acceptRequest(View view){
        if(view.getTag().equals("1"))
        {
            text = findViewById(R.id.text1);
            text.setText("אושר");
            text.setTypeface(null, Typeface.BOLD);
        }
        if(view.getTag().equals("2"))
        {
            text = findViewById(R.id.text2);
            text.setText("אושר");
            text.setTypeface(null, Typeface.BOLD);
        }
        if(view.getTag().equals("3"))
        {
            text = findViewById(R.id.text3);
            text.setText("אושר");
            text.setTypeface(null, Typeface.BOLD);
        }
        if(view.getTag().equals("4"))
        {
            text = findViewById(R.id.text4);
            text.setText("אושר");
            text.setTypeface(null, Typeface.BOLD);
        }
        textMessage.setText("הבקשה אושרה, נשלחה התראה");
    }

    @Override
    public void onBackPressed() {

    }

}
