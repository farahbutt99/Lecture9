package com.example.practicelecture9_mm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Animation(View view) {
        imageView= findViewById(R.id.imageView2);
       //imageView.animate().alpha(0).setDuration(10000);     //disappear
        //imageView.animate().translationY(1000).setDuration(2000);   //move downward
        //imageView.animate().rotation(180);
        //imageView.animate().rotation(360).setDuration(1000);
        //imageView.animate().rotation(720).alpha(0).setDuration(2000);
        //imageView.animate().scaleX(0.5f);
        //imageView.animate().scaleY(0.5f);
        //imageView.animate().scaleX(0.5f).scaleY(0.5f);
       imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);




    }
}