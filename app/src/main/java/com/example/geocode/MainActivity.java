package com.example.geocode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.location.Location;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class  MainActivity extends AppCompatActivity {

    Button btnGetLoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGetLoc = (Button) findViewById(R.id.btnGetLoc);
        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},123);
        btnGetLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GPStracker g = new GPStracker(getApplicationContext());
                Location l = g.getLocation();
                if (l != null);
                    double lat  = l.getLatitude();
                    double lon  = l.getLongitude();
                Toast.makeText(getApplicationContext(), "LAT = "+lat+" \n LON = "+ lon,Toast.LENGTH_LONG).show();

            }
        });
    }
}
