package com.gtechyderabad.healthconscious;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WaterIntake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_water_intake);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText wt;
        Button capacity;
        TextView res;

        wt = findViewById(R.id.edtWt);
        capacity = findViewById(R.id.btnWI);
        res = findViewById(R.id.txtR);

        capacity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int weight = Integer.parseInt(wt.getText().toString());
                double totalIntake = weight * 0.03;
                int totalGlasses = (int) Math.ceil(totalIntake / 0.25);
                res.setText(String.valueOf(totalIntake) + " Litres/" + String.valueOf(totalGlasses) + " Glasses");
            }
        });
    }
}