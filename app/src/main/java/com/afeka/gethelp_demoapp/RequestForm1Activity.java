package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RequestForm1Activity extends AppCompatActivity {

    ImageView requestButton;
    ImageView proceedutton;
    TextView textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_form1);
        getSupportActionBar().hide();

    }

    public void updateButton(View view){
        requestButton = findViewById(R.id.helptake);
        proceedutton = findViewById(R.id.proceed);
        textBox = findViewById(R.id.textView);
        requestButton.setImageResource(R.drawable.smallbuttonpress);
        proceedutton.setImageResource(R.drawable.forward);
        textBox.setText("לקחת אותי לקופת חולים");
    }
}
