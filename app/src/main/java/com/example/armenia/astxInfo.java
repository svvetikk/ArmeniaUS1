package com.example.armenia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class astxInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astx_info);
        setContentView(R.layout.activity_garni_info);
        try {
            InputStream inputStream = getResources().openRawResource(R.raw.astx);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i;
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
            String text = byteArrayOutputStream.toString();
            TextView textView = findViewById(R.id.textView2);
            textView.setText(text);
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}