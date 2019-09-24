package com.example.simpleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMoveActivity,btnMoveActivityData,btnMoveActivityObject,btnDialPhone;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btnMoveActivity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityData = findViewById(R.id.btnMoveActivityData);
        btnMoveActivityData.setOnClickListener(this);

        btnMoveActivityObject = findViewById(R.id.btnMoveActivityObject);
        btnMoveActivityObject.setOnClickListener(this);

        btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMoveActivity:
                Intent moveIntent = new Intent(MainActivity.this,MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btnMoveActivityData:
                Intent moveIntentData = new Intent(MainActivity.this
                        ,MoveWithData.class);
                moveIntentData.putExtra(MoveWithData.extraName,"Muhammad Fauzi Arda Saputra");
                moveIntentData.putExtra(MoveWithData.extraAge,20);
                startActivity(moveIntentData);
                break;
            case R.id.btnMoveActivityObject:
                Intent moveIntentObject = new Intent(MainActivity.this,MoveActivityWithObject.class);

                Person person = new Person();
                person.setName("Muhammad Fauzi Arda Saputra");
                person.setAge(20);
                person.setEmail("fauziardasaputra@gmail.com");
                person.setCity("Payakumbuh");

                moveIntentObject.putExtra(MoveActivityWithObject.extraObject,person);
                startActivity(moveIntentObject);
                break;

        }
    }
}
