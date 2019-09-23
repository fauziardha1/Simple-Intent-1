package com.example.simpleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.widget.TextView;

public class MoveActivityWithObject extends AppCompatActivity {
    private TextView tvObjectReceiver;
    public static final String extraObject = "person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        tvObjectReceiver = findViewById(R.id.tvObjectReceiver);


        Person person = getIntent().getParcelableExtra(extraObject);
        String text = person.getName() + "\n"
                + person.getAge() + "\n"
                + person.getEmail() + "\n"
                + person.getCity();
        tvObjectReceiver.setText(text);

    }
}
