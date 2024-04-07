package com.example.glowgenie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Community1 extends AppCompatActivity implements View.OnClickListener{

    TextView seeMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_community1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        seeMore = findViewById(R.id.seeMore);
        seeMore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == seeMore.getId()){
            Intent intent = new Intent(Community1.this, CommunityList.class);
            startActivity(intent);
        }
    }
}