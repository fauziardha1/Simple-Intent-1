package com.example.simpleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithData extends AppCompatActivity {
    public static final String extraAge = "extra_age";
    public static final String extraName = "extra_name";

    private TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvData = findViewById(R.id.tvData);

        String name = getIntent().getStringExtra(extraName);
        int age = getIntent().getIntExtra(extraAge,0);

        String text = "Name " + name + " " + age + " years old!";
        tvData.setText(text);
    }
}
