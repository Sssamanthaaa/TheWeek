package com.example.student.theweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MondayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        ArrayList<CategoryItem> monday = new ArrayList<>();
        monday.add(new CategoryItem(R.drawable.morning,"Morning"));
        monday.add(new CategoryItem(R.drawable.afternoon,"Afternoon"));
        monday.add(new CategoryItem(R.drawable.night,"Night"));

        CategoryAdapter adapter = new CategoryAdapter(this,monday);
        ListView listView = findViewById(R.id.monday_list);
        listView.setAdapter(adapter);
    }
}
