package com.example.android.musicalstructure2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Play = (Button) findViewById(R.id.play);
        Button Stop = (Button) findViewById(R.id.stop);
        Button Pause = (Button) findViewById(R.id.pause);
        mp = MediaPlayer.create(this, R.raw.audiotrack01);

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              mp = MediaPlayer.create(MainActivity.this, R.raw.audiotrack01);
                mp.start();
            }
        });

        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    mp.stop();
                    mp.release();
                    mp = null;
            }
        });


    }
}
