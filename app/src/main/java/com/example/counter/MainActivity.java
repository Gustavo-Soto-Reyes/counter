package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView greeting, counter;
    Button buttonPlus, buttonMinus;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        greeting = findViewById(R.id.greeting);
        counter = findViewById(R.id.counterText);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.setText(""+increaseCounter());
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count == 0){
                    Toast.makeText(MainActivity.this, "We don't go below zero here, sorry", Toast.LENGTH_SHORT).show();
                    return;
                }
                counter.setText(""+decreaseCounter());
            }
        });
    }

    public int increaseCounter(){
        return ++count;
    }

    public int decreaseCounter(){
        return --count;
    }


}