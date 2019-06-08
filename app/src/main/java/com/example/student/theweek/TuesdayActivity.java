package com.example.student.theweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TuesdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);
        ArrayList<CategoryItem> tuesday = new ArrayList<>();
        tuesday.add(new CategoryItem(R.drawable.morning,"Morning"));
        tuesday.add(new CategoryItem(R.drawable.afternoon,"Afternoon"));
        tuesday.add(new CategoryItem(R.drawable.night,"Night"));


        CategoryAdapter adapter = new CategoryAdapter(this,tuesday);
        ListView listView = findViewById(R.id.tuesday_list);
        listView.setAdapter(adapter);
    }
}
