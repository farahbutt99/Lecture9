package com.example.practicelecture9_mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AudioActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
        mp = MediaPlayer.create(this,R.raw.audio);
    }

    public void Pause(View view) {
        mp.pause();
    }

    public void Play(View view) {
        mp.start();

    }
    public void Next(View view) {
        Intent intent= new Intent(AudioActivity.this,VideoActivity.class);
        startActivity(intent);
    }
}