package com.example.madassiment01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView tvName = findViewById(R.id.tvDisplayName);
        TextView tvEmail = findViewById(R.id.tvDisplayEmail);
        TextView tvMobile = findViewById(R.id.tvDisplayMobile);
        Button btnBack = findViewById(R.id.btnBack);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvName.setText("Name: " + extras.getString("NAME"));
            tvEmail.setText("Email: " + extras.getString("EMAIL"));
            tvMobile.setText("Mobile: " + extras.getString("MOBILE"));
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}