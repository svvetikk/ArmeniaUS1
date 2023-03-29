


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
    private static final int PERMISSION_REQUEST_CODE = 123;

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
                                Uri.parse("google.navigation:q=22.6592239.88.445534&mode =1"));
                       intent.setPackage("com.google.android.maps");
                       if(intent.resolveActivity(getPackageManager() )!= null){
                           startActivity(intent);
                       }
//                        Log.d("MyApp", "Button clicked");
//                        Uri gmmIntentUri = Uri.parse("google.navigation:q=Big+Ben,+London");
//                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                        mapIntent.setPackage("com.google.android.apps.maps");
//                        if(mapIntent.resolveActivity(getPackageManager()) != null) {
//                            Log.d("MyApp", "Starting activity");
//                            startActivity(mapIntent);
//                        }


//                        Log.d("MyApp", "Button clicked");
//                        Location location;
//                        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//
//                        // Check for runtime permission
//                        if (ContextCompat.checkSelfPermission(thisActivity, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//                            // Permission is not granted, request it
//                            ActivityCompat.requestPermissions(thisActivity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSION_REQUEST_CODE);
//                        } else {Log.e("Error", String.valueOf(locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER +"")));
//                            // Permission is already granted, get location
//                            location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//                            double currentLat = location.getLatitude();
//                            double currentLng = location.getLongitude();
//
//
//                            Uri gmmIntentUri = Uri.parse("google.navigation:q=Big+Ben,+London");
//                            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                            mapIntent.setPackage("com.google.android.apps.maps");
//                            if (mapIntent.resolveActivity(getPackageManager()) != null) {
//                                Log.d("MyApp", "Starting activity");
//
//                                // Use the Directions API to get the route information
//                                GeoApiContext context = new GeoApiContext.Builder()
//                                        .apiKey("AIzaSyD2_rxEA-LlkdnZc4KEXDhi_PI4rdRd3C0")
//                                        .build();
//
//                                DirectionsApiRequest request = DirectionsApi.newRequest(context)
//                                        .origin(new com.google.maps.model.LatLng(currentLat, currentLng))
//                                        .destination("Big Ben, London");  // You can change the mode to walking or transit if needed
//
//                                try {
//                                    DirectionsResult result = request.await();
//
//                                    // Build the intent to show the route on the map with the route information
//                                    Uri mapsIntentUri = Uri.parse("google.navigation:q=Big+Ben,+London&mode=d&rtp=");
//                                    for (DirectionsStep step : result.routes[0].legs[0].steps) {
//                                        LatLng latLng = new LatLng(step.endLocation.lat, step.endLocation.lng);
//                                        String latLngStr = Double.toString(latLng.latitude) + "," + Double.toString(latLng.longitude);
//                                        mapsIntentUri = mapsIntentUri.buildUpon()
//                                                .appendQueryParameter("ll", latLngStr)
//                                                .build();
//                                    }
//                                    Intent mapsIntent = new Intent(Intent.ACTION_VIEW, mapsIntentUri);
//                                    mapsIntent.setPackage("com.google.android.apps.maps");
//
//                                    // Start the activity to show the route on the map
//                                    startActivity(mapsIntent);
//
//                                } catch (Exception ex) {
//                                    ex.printStackTrace();
//                                }
//                            }
//                        }



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

        ImageView toGexard = findViewById(R.id.gexard);
        toGexard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View dialogView = getLayoutInflater().inflate(R.layout.dialog_lauout_churches, null);

                Button openActivityButton = dialogView.findViewById(R.id.open_activity_button);
                Button openMapButton = dialogView.findViewById(R.id.open_map_button);
                Button openActivityToursButton = dialogView.findViewById(R.id.open_tours_button);


                openActivityButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(churches.this,gexardInfo.class);
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














