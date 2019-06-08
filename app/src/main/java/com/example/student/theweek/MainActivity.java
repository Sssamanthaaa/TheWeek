package com.example.student.theweek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMondayActivity(View view) {
        Intent i = new Intent(this, MondayActivity.class);
        startActivity(i);
    }

    public void openTuesdayActivity(View view) {
        Intent i = new Intent(this, TuesdayActivity.class);
        startActivity(i);
    }

    public void openWednesdayActivity(View view) {
        Intent i = new Intent(this, WednesdayActivity.class);
        startActivity(i);
    }

    public void openThursdayActivity(View view) {
        Intent i = new Intent(this, ThursdayActivity.class);
        startActivity(i);
    }
    public void openFridayActivity(View view) {
        Intent i = new Intent(this, FridayActivity.class);
        startActivity(i);
    }

}

