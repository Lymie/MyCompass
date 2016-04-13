package com.ashleylu.mycompass;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    /** Called when the user clicks the Send button */
    public void startCompass(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CompassActivity.class);
        startActivity(intent);

    }

    public void startAccelerometer(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, AccelerometerActivity.class);
        startActivity(intent);

    }

}
