package com.diegocupido.thedunch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starters_card;
    CardView mains_card;

    CardView desserts_card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starters_card = findViewById(R.id.card_view_starters);
        mains_card = findViewById(R.id.card_view_main);

        starters_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starters_activity_intent = new Intent(MainActivity.this, StarterActivity.class);

                startActivity(starters_activity_intent);
            }
        });
        mains_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main_activity_intent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(main_activity_intent);
            }
        });

        desserts_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessert_activity_intent = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(dessert_activity_intent);
            }
        });
        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:diegocupido@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}