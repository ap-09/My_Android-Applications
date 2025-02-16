package com.gtechyderabad.healthconscious;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView cardWaterIntake, cardBmiCalculator, cardBodyShape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        TextView tvTitle = findViewById(R.id.tvTitle);
        cardWaterIntake = findViewById(R.id.cardWaterIntake);
        cardBmiCalculator = findViewById(R.id.cardBmiCalculator);
        cardBodyShape = findViewById(R.id.cardBodyShape);

        // Set click listeners for cards
        cardWaterIntake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Water Intake Activity (to be implemented)
                Intent intent = new Intent(MainActivity.this, WaterIntake.class);
                startActivity(intent);
            }
        });

        cardBmiCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to BMI Calculator Activity (to be implemented)
                Intent intent = new Intent(MainActivity.this, BMICalculator.class);
                startActivity(intent);
            }
        });

        cardBodyShape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BodyShape.class);
                startActivity(intent);
            }
        });
    }
}
