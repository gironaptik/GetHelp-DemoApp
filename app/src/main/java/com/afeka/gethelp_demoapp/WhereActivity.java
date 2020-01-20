package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WhereActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView requestButton_1;
    ImageView requestButton_2;
    ImageView requestButton_3;
    ImageView requestButton_4;
    ImageView requestButton_5;
    TextView textBox;
    ImageView viStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where);

        requestButton_1 = findViewById(R.id.where02);
        requestButton_2 = findViewById(R.id.where03);
        requestButton_3 = findViewById(R.id.where04);
        requestButton_4 = findViewById(R.id.where05);
        requestButton_5 = findViewById(R.id.where06);

        findViewById(R.id.where02).setOnClickListener(this);
        findViewById(R.id.where03).setOnClickListener(this);
        findViewById(R.id.where04).setOnClickListener(this);
        findViewById(R.id.where05).setOnClickListener(this);
        findViewById(R.id.where06).setOnClickListener(this);
        findViewById(R.id.proceed).setOnClickListener(this);


        viStatus = findViewById(R.id.proceed);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.where02:
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.where07);
                requestButton_2.setImageResource(R.drawable.where03);
                requestButton_3.setImageResource(R.drawable.where04);
                requestButton_4.setImageResource(R.drawable.where05);
                requestButton_5.setImageResource(R.drawable.where06);
                textBox.setText("קופ\"ח רמת ורבר, שרת 22 ,פתח תקווה\n");
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                break;

            case R.id.where03:
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.where02);
                requestButton_2.setImageResource(R.drawable.where08);
                requestButton_3.setImageResource(R.drawable.where04);
                requestButton_4.setImageResource(R.drawable.where05);
                requestButton_5.setImageResource(R.drawable.where06);
                textBox.setText("הרצל 3, פתח תקווה\n");
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                break;
            case R.id.where04:
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.where02);
                requestButton_2.setImageResource(R.drawable.where03);
                requestButton_3.setImageResource(R.drawable.where09);
                requestButton_4.setImageResource(R.drawable.where05);
                requestButton_5.setImageResource(R.drawable.where06);
                textBox.setText("רמי לוי קרית מטלון, הסיבים 33, פתח תקווה\n");
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                break;
            case R.id.where05:
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.where02);
                requestButton_2.setImageResource(R.drawable.where03);
                requestButton_3.setImageResource(R.drawable.where04);
                requestButton_4.setImageResource(R.drawable.where10);
                requestButton_5.setImageResource(R.drawable.where06);
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                textBox.setText("קניון אבנת, ז'בוטינסקי 72, פתח תקווה\n");
                break;
            case R.id.where06:
                textBox = findViewById(R.id.textView);
                requestButton_1.setImageResource(R.drawable.where02);
                requestButton_2.setImageResource(R.drawable.where03);
                requestButton_3.setImageResource(R.drawable.where04);
                requestButton_4.setImageResource(R.drawable.where05);
                requestButton_5.setImageResource(R.drawable.where11);
                textBox.setText("קופ\"ח רמת ורבר, שרת 22 ,פתח תקווה\n");
                viStatus.setTag("on");
                viStatus.setImageResource(R.drawable.vion);
                break;
            case R.id.proceed:
                if(viStatus.getTag().toString().equals("on"))
//                    startActivity(new Intent(this, WhenActivity.class));
                break;
            default:
                break;
        }

    }
}
