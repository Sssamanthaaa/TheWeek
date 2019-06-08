package com.example.student.theweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WednesdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);

        ArrayList<CategoryItem> wednesday = new ArrayList<>();
        wednesday.add(new CategoryItem(R.drawable.morning,"Morning"));
        wednesday.add(new CategoryItem(R.drawable.afternoon,"Afternoon"));
        wednesday.add(new CategoryItem(R.drawable.night,"Night"));

        CategoryAdapter adapter = new CategoryAdapter(this,wednesday);
        ListView listView = findViewById(R.id.wednesday_list);
        listView.setAdapter(adapter);
    }
}
