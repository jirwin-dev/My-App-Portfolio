package com.jirwindev.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        //Get elements
        Button btnSpotifyStreamer = (Button) findViewById(R.id.spotifyStreamerButton);
        Button btnScores = (Button) findViewById(R.id.scoresButton);
        Button btnLibrary = (Button) findViewById(R.id.libraryButton);
        Button btnBuiltItBigger = (Button) findViewById(R.id.buildItBiggerButton);
        Button btnXYZReader = (Button) findViewById(R.id.xyzReaderButton);
        Button btnCapstone = (Button) findViewById(R.id.capstoneButton);

        //Assign listeners
        btnSpotifyStreamer.setOnClickListener(this);
        btnScores.setOnClickListener(this);
        btnLibrary.setOnClickListener(this);
        btnBuiltItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotifyStreamerButton:
                Toast.makeText(this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.scoresButton:
                Toast.makeText(this, "This button will launch my Scores app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.libraryButton:
                Toast.makeText(this, "This button will launch my Library app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.buildItBiggerButton:
                Toast.makeText(this, "This button will launch my Build it Bigger app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.xyzReaderButton:
                Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.capstoneButton:
                Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
