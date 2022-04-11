package com.vighnuorg.mxplayer_h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button about = (Button) findViewById(R.id.about);
        Button Music = (Button) findViewById(R.id.music);
        Button gallery = (Button) findViewById(R.id.gallery);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(), About.class);
                startActivity(i);
            }

        });

        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Music.class);
                startActivity(i);
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(), Gallery.class);
                startActivity(i);



            }
        });
    }
}