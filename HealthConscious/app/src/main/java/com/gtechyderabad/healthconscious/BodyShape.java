package com.gtechyderabad.healthconscious;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BodyShape extends AppCompatActivity {

    private EditText etShoulders, etBust, etWaist, etHips;
    private Button btnCalculate;
    private TextView tvResult;
    private ImageView Bodyshape; // Correctly named variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_shape);

        // Initialize UI components
        etShoulders = findViewById(R.id.etShoulders);
        etBust = findViewById(R.id.etBust);
        etWaist = findViewById(R.id.etWaist);
        etHips = findViewById(R.id.etHips);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);
        Bodyshape = findViewById(R.id.imgBodyShape); // Reference ImageView


        // Set button click listener
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBodyShape();
            }
        });
    }

    private void calculateBodyShape() {
        // Get user input
        String shouldersInput = etShoulders.getText().toString();
        String bustInput = etBust.getText().toString();
        String waistInput = etWaist.getText().toString();
        String hipsInput = etHips.getText().toString();

        // Validate input
        if (shouldersInput.isEmpty() || bustInput.isEmpty() || waistInput.isEmpty() || hipsInput.isEmpty()) {
            tvResult.setText("Please enter all measurements.");
            return;
        }

        // Parse input to numbers
        float shoulders = Float.parseFloat(shouldersInput);
        float bust = Float.parseFloat(bustInput);
        float waist = Float.parseFloat(waistInput);
        float hips = Float.parseFloat(hipsInput);

        // Determine body shape
        String bodyShape;
        if (Math.abs(shoulders - hips) <= 5 && Math.abs(bust - hips) <= 5 && waist < shoulders && waist < hips) {
            bodyShape = "Hourglass";
            Bodyshape.setImageResource(R.drawable.hourglass_body); // Corrected reference
        } else if (shoulders > hips && shoulders > waist) {
            bodyShape = "Inverted Triangle";
            Bodyshape.setImageResource(R.drawable.inverted_triangle_info); // Corrected reference
        } else if (hips > shoulders && hips > waist) {
            bodyShape = "Pear";
            Bodyshape.setImageResource(R.drawable.pearshape);// Corrected reference
        } else if (waist > shoulders && waist > hips) {
            bodyShape = "Round";
            Bodyshape.setImageResource(R.drawable.round); // Corrected reference
        } else {
            bodyShape = "Rectangle";
            Bodyshape.setImageResource(R.drawable.rectangle_info); // Corrected reference
        }

        tvResult.setText("Your body shape is:  " + bodyShape);
    }
}
