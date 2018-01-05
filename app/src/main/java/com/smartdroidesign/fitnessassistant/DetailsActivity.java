package com.smartdroidesign.fitnessassistant;



import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView)findViewById(R.id.exerciseImage);
        ConstraintLayout MainBG = (ConstraintLayout)findViewById(R.id.mainBg);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.SECOND_ACTIVITY_TITLE);
        exerciseText.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_WEIGHT)){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            }
            MainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));

        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXCERCISE_YOGA)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            }
            MainBG.setBackgroundColor(Color.parseColor("#916bcd"));

        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            }
            MainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }

    }
}
