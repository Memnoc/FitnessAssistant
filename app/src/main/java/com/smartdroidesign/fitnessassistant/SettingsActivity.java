package com.smartdroidesign.fitnessassistant;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class SettingsActivity extends Activity {

    ConstraintLayout mainAcBackground;
    public static final String ACTIVITY_COLOR = "color";








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Menu settings = (Menu) findViewById(R.id.action_setting);
        Menu theme = (Menu) findViewById(R.id.theme);
        final ConstraintLayout settingBG = findViewById(R.id.settingBG);
        final ConstraintLayout mainAcBackground = findViewById(R.id.mainAcBackground);
        final CheckBox nightMode = (CheckBox)findViewById(R.id.NightMode);






        nightMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()){
                    MainActivity.myBackgroundColor = Color.parseColor("#FFFFFF");

                }else if(isChecked = false)
                    MainActivity.myBackgroundColor = Color.parseColor("#2ca5f5");

            }
        });

    }

    private void loadSettingsActivity(String colorCode) {
        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
        startActivity(intent);
    }





}
