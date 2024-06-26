package com.example.glowgenie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.glowgenie.appointment.Appointment;
import com.example.glowgenie.appointment.AppointmentHistory;
import com.example.glowgenie.booking.Booking;
import com.example.glowgenie.booking.FindDoctor;
import com.example.glowgenie.calendar.Calendar;
import com.example.glowgenie.community.Community1;
import com.example.glowgenie.reels.activityreels;
import com.example.glowgenie.shop.Shop;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout appointment, booking, community, history;
    ImageView shop, reels, profile;
    TextView halo, today, seeMore, seeMore2;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        halo = findViewById(R.id.halo);
        today = findViewById(R.id.today);
        appointment = findViewById(R.id.appointment);
        booking = findViewById(R.id.booking);
        community = findViewById(R.id.community);
        history = findViewById(R.id.history);
        seeMore = findViewById(R.id.seeMore);
        seeMore2 = findViewById(R.id.seeMore2);
        shop = findViewById(R.id.shop);
        reels = findViewById(R.id.reels);
        profile = findViewById(R.id.profile);

        appointment.setOnClickListener(this);
        booking.setOnClickListener(this);
        community.setOnClickListener(this);
        history.setOnClickListener(this);
        seeMore.setOnClickListener(this);
        seeMore2.setOnClickListener(this);
        shop.setOnClickListener(this);
        reels.setOnClickListener(this);
        profile.setOnClickListener(this);

        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            String name = user.getDisplayName();
            if (name != null) {
                halo.setText("Halo, " + name + "!");
            }
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == appointment.getId()){
            Intent intent = new Intent(MainActivity.this, Appointment.class);
            startActivity(intent);
        } else if (v.getId() == booking.getId()){
            Intent intent = new Intent(MainActivity.this, FindDoctor.class);
            startActivity(intent);
        } else if (v.getId() == community.getId()){
            Intent intent = new Intent(MainActivity.this, Community1.class);
            startActivity(intent);
        } else if (v.getId() == history.getId()){
            Intent intent = new Intent(MainActivity.this, AppointmentHistory.class);
            startActivity(intent);
        } else if (v.getId() == seeMore.getId()) {
            Intent intent = new Intent(MainActivity.this, Calendar.class);
            startActivity(intent);
        } else if (v.getId() == seeMore2.getId()) {
            Intent intent = new Intent(MainActivity.this, Shop.class);
            startActivity(intent);
        } else if (v.getId() == shop.getId()) {
            Intent intent = new Intent(MainActivity.this, Shop.class);
            startActivity(intent);
        } else if (v.getId() == reels.getId()) {
            Intent intent = new Intent(MainActivity.this, activityreels.class);
            startActivity(intent);
        } else if (v.getId() == profile.getId()) {
            Intent intent = new Intent(MainActivity.this, Profile.class);
            startActivity(intent);
        }
    }
}