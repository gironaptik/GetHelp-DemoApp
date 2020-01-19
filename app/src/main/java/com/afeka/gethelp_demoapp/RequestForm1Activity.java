package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RequestForm1Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView requestButton_1;
    ImageView requestButton_2;
    ImageView requestButton_3;
    ImageView requestButton_4;
    ImageView proceedutton;
    TextView textBox;
    ImageView viStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_form1);
        getSupportActionBar().hide();

        findViewById(R.id.helptake_1).setOnClickListener(this);
        findViewById(R.id.helptake_2).setOnClickListener(this);
        findViewById(R.id.helptake_3).setOnClickListener(this);
        findViewById(R.id.helptake_4).setOnClickListener(this);
        findViewById(R.id.proceed).setOnClickListener(this);

        requestButton_1 = findViewById(R.id.helptake_1);
        requestButton_2 = findViewById(R.id.helptake_2);
        requestButton_3 = findViewById(R.id.helptake_3);
        requestButton_4 = findViewById(R.id.helptake_4);
        viStatus = findViewById(R.id.proceed);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.helptake_1:
//                proceedutton = findViewById(R.id.proceed);
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.smallbuttonpress_1);
                requestButton_2.setImageResource(R.drawable.smallbutton_2);
                requestButton_3.setImageResource(R.drawable.smallbutton_3);
                requestButton_4.setImageResource(R.drawable.smallbutton_4);
//                proceedutton.setImageResource(R.drawable.forward);
                textBox.setText("לקחת אותי לקופת חולים");
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                break;

            case R.id.helptake_2:
//                proceedutton = findViewById(R.id.proceed);
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.smallbutton_1);
                requestButton_2.setImageResource(R.drawable.smallbuttonpress_2);
                requestButton_3.setImageResource(R.drawable.smallbutton_3);
                requestButton_4.setImageResource(R.drawable.smallbutton_4);
//                proceedutton.setImageResource(R.drawable.forward);
                textBox.setText("חזרתי מקניות וקשה לי להרים לבית");
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                break;
            case R.id.helptake_3:
//                proceedutton = findViewById(R.id.proceed);
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.smallbutton_1);
                requestButton_2.setImageResource(R.drawable.smallbutton_2);
                requestButton_3.setImageResource(R.drawable.smallbuttonpress_3);
                requestButton_4.setImageResource(R.drawable.smallbutton_4);
//                proceedutton.setImageResource(R.drawable.forward);
                textBox.setText("הטלויזיה רושמת שאין אות");
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                break;
            case R.id.helptake_4:
//                proceedutton = findViewById(R.id.proceed);
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.smallbutton_1);
                requestButton_2.setImageResource(R.drawable.smallbutton_2);
                requestButton_3.setImageResource(R.drawable.smallbutton_3);
                requestButton_4.setImageResource(R.drawable.smallbuttonpress_4);
//                proceedutton.setImageResource(R.drawable.forward);
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                textBox.setText("צריכה לשלוח מסמכים באתר של ביטוח לאומי");
                break;
            case R.id.proceed:
                if(viStatus.getTag().toString().equals("on"))
                    startActivity(new Intent(this, whenActivity.class));
                break;
            default:
                break;
        }
    }

    private void jump04() {
        if(viStatus.getTag().toString().equals("on"))
            startActivity(new Intent(this, whenActivity.class));
    }
}
