package com.example.isma.unaputamelda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) this.findViewById(R.id.buttonQueEtSembla);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.unaputamelda);
        one.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });


    }

}

