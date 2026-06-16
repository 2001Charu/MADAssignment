package com.example.madassiment01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Lesson1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        EditText etInput = findViewById(R.id.etInput);
        Button btnToast = findViewById(R.id.btnToast);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etInput.getText().toString();
                if (!input.isEmpty()) {
                    Toast.makeText(Lesson1Activity.this, input, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Lesson1Activity.this, "Please enter some text", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}