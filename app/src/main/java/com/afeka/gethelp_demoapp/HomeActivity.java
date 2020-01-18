package com.afeka.gethelp_demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class HomeActivity extends AppCompatActivity {

    ImageView userPicture;
    TextInputEditText userName;
    TextInputEditText userCity;
    TextInputEditText userDateBirth;
    TextInputEditText userTelephone;
    TextInputEditText userRole;
    TextView userBirthWrong;
    CheckBox help;
    CheckBox volunteer;
    CheckBox social;
    CheckBox safety;
    ImageView viStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        vistatus();
    }

    public void setPicture(View view) {
        userPicture = findViewById(R.id.userpicture);
        userPicture.setImageResource(R.drawable.userpicturefull);
        vistatus();
    }

    public void setUserName(View view) {
        userName = findViewById(R.id.textUserName);
        userName.setText("שולה");
        vistatus();
    }

    public void setDateBirthWrong(View view) {
        userBirthWrong = findViewById(R.id.textView2);
        userDateBirth = findViewById(R.id.textUserDateBirth);
        userDateBirth.setError("הנא הכנס שנת לידה מלאה");
        userDateBirth.setText("55");
        vistatus();
    }

    public void setDateBirth(View view) {
        userDateBirth = findViewById(R.id.textUserDateBirth);
        userDateBirth.setText("1955");
        userDateBirth.setError(null);
        vistatus();
    }

    public void setUserCity(View view) {
        userCity = findViewById(R.id.textCity);
        userCity.setText("נס ציונה");
        vistatus();
    }

    public void setUserTelephone(View view) {
        userTelephone = findViewById(R.id.textTelephone);
        userTelephone.setText("0541234567");
        vistatus();
    }

    public void setCheckBoxAsking(View view) {
        userRole = findViewById(R.id.textRole_edit_text);
        volunteer = findViewById(R.id.checkBoxVolunteer);
        social = findViewById(R.id.checkBoxSocialservice);
        safety = findViewById(R.id.checkBox911);
        if(volunteer.isChecked())
            volunteer.toggle();
        if(social.isChecked())
            social.toggle();
        if(safety.isChecked())
            safety.toggle();
        userRole.setText("מבקש עזרה");
        vistatus();
    }

    public void setCheckBoxVolunteer(View view) {
        userRole = findViewById(R.id.textRole_edit_text);
        help = findViewById(R.id.checkBoxAsking);
        social = findViewById(R.id.checkBoxSocialservice);
        safety = findViewById(R.id.checkBox911);
        if(help.isChecked())
            help.toggle();
        if(social.isChecked())
            social.toggle();
        if(safety.isChecked())
            safety.toggle();
        userRole.setText("מתנדב");
        vistatus();
    }

    public void setCheckBoxSocialservice(View view) {
        userRole = findViewById(R.id.textRole_edit_text);
        help = findViewById(R.id.checkBoxAsking);
        volunteer = findViewById(R.id.checkBoxVolunteer);
        safety = findViewById(R.id.checkBox911);
        if(help.isChecked())
            help.toggle();
        if(volunteer.isChecked())
            volunteer.toggle();
        if(safety.isChecked())
            safety.toggle();
        userRole.setText("שירות רווחה");
        vistatus();
    }

    public void setCheckBox911(View view) {
        userRole = findViewById(R.id.textRole_edit_text);
        help = findViewById(R.id.checkBoxAsking);
        volunteer = findViewById(R.id.checkBoxVolunteer);
        social = findViewById(R.id.checkBox911);
        if(help.isChecked())
            help.toggle();
        if(volunteer.isChecked())
            volunteer.toggle();
        if(social.isChecked())
            social.toggle();
        userRole.setText("שירות בטחון והצלה");
        vistatus();
    }

    public void vistatus(){
        userName = findViewById(R.id.textUserName);
        userDateBirth = findViewById(R.id.textUserDateBirth);
        userCity = findViewById(R.id.textCity);
        userTelephone = findViewById(R.id.textTelephone);
        userRole = findViewById(R.id.textRole_edit_text);
        viStatus = findViewById(R.id.viStatus);
        if(!userName.getText().toString().equals("") && !userCity.getText().toString().equals("") &&
                !userDateBirth.getText().toString().equals("") && !userTelephone.getText().toString().equals("") && !userRole.getText().toString().equals("")){
            viStatus.setImageResource(R.drawable.vion);
            viStatus.setTag("on");
        }
    }

    public void jump(View view){
        viStatus = findViewById(R.id.viStatus);
        if(viStatus.getTag().toString().equals("on"))
            startActivity(new Intent(this, SettingsActivity.class));
    }
}
