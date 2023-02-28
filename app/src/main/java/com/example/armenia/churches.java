package com.example.armenia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class churches extends AppCompatActivity {
    private ImageView openDialogButton;
    private AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_churches);

        ImageView toGarni = findViewById(R.id.garni);
        toGarni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,garniInfo.class);
                        startActivity(intent);
                    }
                });

                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        startActivity(mapIntent);
                    }
                });



                AlertDialog alertDialog = new AlertDialog.Builder(churches.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });

        ImageView toMashtoc = findViewById(R.id.mashtoc);
        toMashtoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,mashtocInfo.class);
                        startActivity(intent);
                    }
                });

                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        startActivity(mapIntent);
                    }
                });



                AlertDialog alertDialog = new AlertDialog.Builder(churches.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });


    }
}













