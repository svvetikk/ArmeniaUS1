package com.example.armenia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;





public class museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        Button toHamo = findViewById(R.id.hamo);


        toHamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_layout, null);

                Button openActivityButton = dialogView.findViewById(R.id.btnOpenActivity);
                Button openMapButton = dialogView.findViewById(R.id.btnOpenMap);
                Button callButton = dialogView.findViewById(R.id.btnCall);
                Button websiteButton = dialogView.findViewById(R.id.btnOpenWebSite);

                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(museums.this,hamoInfo.class);
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

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:096145005"));
                        startActivity(intent);
                    }
                });

                websiteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url = "https://https://www.facebook.com/people/Hamo-Sahyans-Museum%D5%80%D5%A1%D5%B4%D5%B8-%D5%8D%D5%A1%D5%B0%D5%B5%D5%A1%D5%B6%D5%AB-%D5%BF%D5%B8%D6%82%D5%B6-%D5%A9%D5%A1%D5%B6%D5%A3%D5%A1%D6%80%D5%A1%D5%B6/100057698520105/";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });


                AlertDialog alertDialog = new AlertDialog.Builder(museums.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });





        Button toYexeg = findViewById(R.id.yexeg);
        toYexeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_layout, null);

                Button openActivityButton = dialogView.findViewById(R.id.btnOpenActivity);
                Button openMapButton = dialogView.findViewById(R.id.btnOpenMap);
                Button callButton = dialogView.findViewById(R.id.btnCall);
                Button websiteButton = dialogView.findViewById(R.id.btnOpenWebSite);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(museums.this,yexegInfo.class);
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

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:096145005"));
                        startActivity(intent);
                    }
                });

                websiteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url = "https://yeghegnadzor-regional-museum.business.site/";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });


                AlertDialog alertDialog = new AlertDialog.Builder(museums.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });

        Button toKoxb = findViewById(R.id.koxb);
        toKoxb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_layout, null);

                Button openActivityButton = dialogView.findViewById(R.id.btnOpenActivity);
                Button openMapButton = dialogView.findViewById(R.id.btnOpenMap);
                Button callButton = dialogView.findViewById(R.id.btnCall);
                Button websiteButton = dialogView.findViewById(R.id.btnOpenWebSite);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(museums.this,koxbInfo.class);
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

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:096145005"));
                        startActivity(intent);
                    }
                });

                websiteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url = "http://www.koghb.am/index.php/hy_AM/culture/museum";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });


                AlertDialog alertDialog = new AlertDialog.Builder(museums.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });

        Button toMher = findViewById(R.id.mher);
        toMher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_layout, null);

                Button openActivityButton = dialogView.findViewById(R.id.btnOpenActivity);
                Button openMapButton = dialogView.findViewById(R.id.btnOpenMap);
                Button callButton = dialogView.findViewById(R.id.btnCall);
                Button websiteButton = dialogView.findViewById(R.id.btnOpenWebSite);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(museums.this,mherInfo.class);
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

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:096145005"));
                        startActivity(intent);
                    }
                });

                websiteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url = "http://frunzikmuseum.com/hy/mher-mkrtchyan-museum/";
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                    }
                });


                AlertDialog alertDialog = new AlertDialog.Builder(museums.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });

    }
}









