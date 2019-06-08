package com.example.student.theweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ThursdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);

        ArrayList<CategoryItem> thursday = new ArrayList<>();
        thursday.add(new CategoryItem(R.drawable.morning,"Morning"));
        thursday.add(new CategoryItem(R.drawable.afternoon,"Afternoon"));
        thursday.add(new CategoryItem(R.drawable.night,"Night"));

        CategoryAdapter adapter = new CategoryAdapter(this,thursday);
        ListView listView = findViewById(R.id.thursday_list);
        listView.setAdapter(adapter);
    }
}
