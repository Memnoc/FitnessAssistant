package com.smartdroidesign.fitnessassistant;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class MainActivity extends Activity {




    public static final String SECOND_ACTIVITY_TITLE = "second.activity.title";
    public static final String EXCERCISE_WEIGHT = "Weight lifting";
    public static final String EXCERCISE_YOGA = "Yoga routine";
    public static final String EXCERCISE_CARDIO = "Cardio routine";
    public static int myBackgroundColor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout weightBtn = (ConstraintLayout) findViewById(R.id.weightLayout);
        ConstraintLayout yogaBtn = (ConstraintLayout) findViewById(R.id.yogaLayout);
        ConstraintLayout cardioBtn = (ConstraintLayout) findViewById(R.id.cardioLayout);
        final ConstraintLayout mainAcBackground = findViewById(R.id.mainAcBackground);




        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXCERCISE_WEIGHT);

            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXCERCISE_YOGA);

            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXCERCISE_CARDIO);

            }
        });
    }

    private void setSupportActionBar(Toolbar mToolbar) {
    }

    private void loadDetailActivity(String exerciseTitle) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.SECOND_ACTIVITY_TITLE, exerciseTitle);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.theme:
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onResume() {
        super.onResume();
        if(myBackgroundColor != 0){
            ConstraintLayout mainAcBackground = (ConstraintLayout) findViewById(R.id.mainAcBackground);
            mainAcBackground.setBackgroundColor(myBackgroundColor);
        }
    }






}