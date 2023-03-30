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
import android.widget.ImageView;


public class museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        ImageView toAstx = findViewById(R.id.astx);


        toAstx.setOnClickListener(new View.OnClickListener() {
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
                        Intent intent = new Intent(museums.this,astxInfo.class);
                        startActivity(intent);
                    }
                });

                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q=39.492626,45.250405&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:091195903"));
                        startActivity(intent);
                    }
                });

                websiteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url = "https://www.bao.am/about/about/about.php?lang=1";
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





        ImageView toYexeg = findViewById(R.id.yexeg);
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

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q=39.760164,45.334886&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: 08123392"));
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

        ImageView toKoxb = findViewById(R.id.koxb);
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

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q=41.168878,44.990276&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
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
        ImageView toYerevan = findViewById(R.id.yerevan);
        toYerevan.setOnClickListener(new View.OnClickListener() {
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
                        Intent intent = new Intent(museums.this,yerevanInfo.class);
                        startActivity(intent);
                    }
                });

                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q=40.184008,44.516069&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:010568108"));
                        startActivity(intent);
                    }
                });

                websiteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url = "https://yhm.am/?lang=ru";
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


        ImageView toMher = findViewById(R.id.mher);
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

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q=40.789640, 43.837997&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                callButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:31255174"));
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









