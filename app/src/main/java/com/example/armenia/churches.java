


package com.example.armenia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.DirectionsStep;
import com.google.android.gms.maps.model.LatLng;
import android.Manifest;


public class churches extends AppCompatActivity {

    AppCompatActivity thisActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_churches);

        ImageView toGarni = findViewById(R.id.garni);
        thisActivity = this;
        toGarni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);
                Button openActivityToursButton = dialogView.findViewById(R.id.open_tours_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this, garniInfo.class);
                        startActivity(intent);
                    }
                });

                openActivityToursButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("Intent started", "Button clicked");
                        Intent toursIntent = new Intent(churches.this, Tours.class);
                        startActivity(toursIntent);
                    }
                });
                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q=40.119823, 44.749131&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
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
                Button openActivityToursButton = dialogView.findViewById(R.id.open_tours_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,mashtocInfo.class);
                        startActivity(intent);
                    }
                });
                openActivityToursButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("Intent started", "Button clicked");
                        Intent toursIntent = new Intent(churches.this,Tours.class);
                        startActivity(toursIntent);
                    }
                });
                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q= 40.199697, 44.516757&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });



                AlertDialog alertDialog = new AlertDialog.Builder(churches.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });


        ImageView toTatev = findViewById(R.id.tatev);
        toTatev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);
                Button openActivityToursButton = dialogView.findViewById(R.id.open_tours_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,tatevInfo.class);
                        startActivity(intent);
                    }
                });
                openActivityToursButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("Intent started", "Button clicked");
                        Intent toursIntent = new Intent(churches.this,Tours.class);
                        startActivity(toursIntent);
                    }
                });
                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q= 39.506563, 46.241589&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });



                AlertDialog alertDialog = new AlertDialog.Builder(churches.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });

        ImageView toSanahin = findViewById(R.id.sanahin);
        toSanahin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);
                Button openActivityToursButton = dialogView.findViewById(R.id.open_tours_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,sanahinInfo.class);
                        startActivity(intent);
                    }
                });
                openActivityToursButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("Intent started", "Button clicked");
                        Intent toursIntent = new Intent(churches.this,Tours.class);
                        startActivity(toursIntent);
                    }
                });
                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q= 41.108697, 44.666090&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });



                AlertDialog alertDialog = new AlertDialog.Builder(churches.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });

        ImageView toSevanavanq = findViewById(R.id.sevanavanq);
        toSevanavanq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);
                Button openActivityToursButton = dialogView.findViewById(R.id.open_tours_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,sevanInfo.class);
                        startActivity(intent);
                    }
                });
                openActivityToursButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("Intent started", "Button clicked");
                        Intent toursIntent = new Intent(churches.this,Tours.class);
                        startActivity(toursIntent);
                    }
                });
                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q= 40.555152, 45.067076&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });



                AlertDialog alertDialog = new AlertDialog.Builder(churches.this)
                        .setView(dialogView)
                        .create();
                alertDialog.show();
            }
        });

        ImageView toXorvirap = findViewById(R.id.xorvirap);
        toXorvirap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);
                Button openActivityToursButton = dialogView.findViewById(R.id.open_tours_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,xorvirapInfo.class);
                        startActivity(intent);
                    }
                });
                openActivityToursButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.e("Intent started", "Button clicked");
                        Intent toursIntent = new Intent(churches.this,Tours.class);
                        startActivity(toursIntent);
                    }
                });
                openMapButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("google.navigation:q= 39.879531, 44.570248&mode=d"));
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
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














