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
    CheckBox male;
    CheckBox female;
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
        help = findViewById(R.id.checkBoxAsking);
        volunteer = findViewById(R.id.checkBoxVolunteer);
        userName = findViewById(R.id.textUserName);
        if(help.isChecked()) {
            userName.setText("שולה");
        }
        else
            if(volunteer.isChecked()){
                userName.setText("רונן");
            }
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
        help = findViewById(R.id.checkBoxAsking);
        volunteer = findViewById(R.id.checkBoxVolunteer);
        userName = findViewById(R.id.textUserName);
        if(help.isChecked()) {
            userDateBirth.setText("1955");
        }
        else
        if(volunteer.isChecked()){
            userDateBirth.setText("1990");
        }
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
        female = findViewById(R.id.checkBoxFemale);
        female.setChecked(true);
        male = findViewById(R.id.checkBoxMale);
        male.setChecked(false);
        userRole = findViewById(R.id.textRole_edit_text);
        volunteer = findViewById(R.id.checkBoxVolunteer);
        social = findViewById(R.id.checkBoxSocialservice);
        safety = findViewById(R.id.checkBox911);
        userPicture = findViewById(R.id.userpicture);
        userPicture.setImageResource(R.drawable.userpicturefull);
        userPicture.setTag("ask");
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
        male = findViewById(R.id.checkBoxMale);
        male.setChecked(true);
        female = findViewById(R.id.checkBoxFemale);
        female.setChecked(false);
        userRole = findViewById(R.id.textRole_edit_text);
        help = findViewById(R.id.checkBoxAsking);
        social = findViewById(R.id.checkBoxSocialservice);
        safety = findViewById(R.id.checkBox911);
        userPicture = findViewById(R.id.userpicture);
        userPicture.setImageResource(R.drawable.voluntteravatar);
        userPicture.setTag("volunteer");
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
        social = findViewById(R.id.checkBoxSocialservice);
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
        userPicture = findViewById(R.id.userpicture);
        if(viStatus.getTag().toString().equals("on"))
            if(userPicture.getTag().toString().equals("ask")) {
                startActivity(new Intent(this, SettingsActivity.class));
            }
            else
            if(userPicture.getTag().toString().equals("volunteer")) {
                startActivity(new Intent(this, VolunteerTable.class));
            }
        }

    @Override
    public void onBackPressed() {

    }

}
