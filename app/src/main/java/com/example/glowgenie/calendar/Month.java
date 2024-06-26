package com.example.glowgenie.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glowgenie.R;

import java.util.ArrayList;
import java.util.List;

public class Month extends AppCompatActivity {
    TextView Bulan;
    ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_month);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Today", "Hydrating Day", "Face Wash \n Toner \n Serum \n Moisturizer \n Sunscreen", "Cleansing Oil \n FaceWash \n Toner \n Moisturizer"));
        items.add(new Item("Tomorrow", "Exfoliating Day", "Face Wash \n Toner \n Serum \n Moisturizer \n Sunscreen", "Cleansing Oil \n FaceWash \n Toner \n Moisturizer"));
        items.add(new Item("Wednesday", "Skin Barrier Day", "Face Wash \n Toner \n Serum \n Moisturizer \n Sunscreen", "Cleansing Oil \n FaceWash \n Toner \n Moisturizer"));
        items.add(new Item("Thursday", "Hydrating Day", "Face Wash \n Toner \n Serum \n Moisturizer \n Sunscreen", "Cleansing Oil \n FaceWash \n Toner \n Moisturizer"));
        items.add(new Item("Friday", "Hydrating Day", "Face Wash \n Toner \n Serum \n Moisturizer \n Sunscreen", "Cleansing Oil \n FaceWash \n Toner \n Moisturizer"));
        items.add(new Item("Tomorrow", "Exfoliating Day", "Face Wash \n Toner \n Serum \n Moisturizer \n Sunscreen", "Cleansing Oil \n FaceWash \n Toner \n Moisturizer"));
        items.add(new Item("Wednesday", "Skin Barrier Day", "Face Wash \n Toner \n Serum \n Moisturizer \n Sunscreen", "Cleansing Oil \n FaceWash \n Toner \n Moisturizer"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CalenderAdapter(getApplicationContext(),items));

        Bulan = findViewById(R.id.bulan);
        Intent intent = getIntent();
        Bulan.setText(intent.getStringExtra("Month"));

        Back = findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Month.this, Calendar.class);
                startActivity(intent);
            }
        });




    }


}