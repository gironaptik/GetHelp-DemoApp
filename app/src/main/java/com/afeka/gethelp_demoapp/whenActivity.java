package com.afeka.gethelp_demoapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class whenActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener, View.OnClickListener {

    ImageView forward2;
    TextView yourTime;
    TextView yourDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_when);
        getSupportActionBar().hide();

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button02).setOnClickListener(this);

        forward2 = findViewById(R.id.proceed02);
        yourTime = findViewById(R.id.yourTime);
        yourDate = findViewById(R.id.yourDate);

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView = (TextView) findViewById(R.id.yourTime);
        textView.setText("Hour: " + hourOfDay + " Minute: " + minute);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(), "time picker");
                break;

            case R.id.button02:
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
                break;

            case R.id.proceed:
                if (!(yourTime.getText().toString().equals("") || yourDate.getText().toString().equals("")))
                    forward2.setTag("on");
                if(forward2.getTag().toString().equals("on"))
                    startActivity(new Intent(this, whereActivity.class));
                break;
            default:
                break;
        }
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(currentDateString);
    }
}
