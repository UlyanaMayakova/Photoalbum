package com.example.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button backwardsButton = findViewById(R.id.backwards);
        Button forwardsButton = findViewById(R.id.forwards);
        final TextView link = findViewById(R.id.linkSpace);
        final String thisLink = "http://myfile.org/" + getRandomNumber();
        link.setText(thisLink);

        forwardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        backwardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100 + 1);
    }
}