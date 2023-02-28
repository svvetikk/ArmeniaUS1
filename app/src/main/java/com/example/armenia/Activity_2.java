package com.example.armenia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_2 extends AppCompatActivity {

    private Button gotoChurch;
    private Button gotoMuseums;
    private Button gotoExtreme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        gotoChurch = findViewById(R.id.ekexeci);
        gotoMuseums = findViewById(R.id.tangaran);
        gotoExtreme = findViewById(R.id.fun);

        gotoChurch.setOnClickListener(view -> startNewActivity(churches.class));
        gotoMuseums.setOnClickListener(view -> startNewActivity(museums.class));
        gotoExtreme.setOnClickListener(view -> startNewActivity(extreme.class));
    }

    private void startNewActivity(Class<?> cls) {
        Intent intent = new Intent(Activity_2.this, cls);
        startActivity(intent);
    }
}