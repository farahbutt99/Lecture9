package com.example.practicelecture9_mm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= findViewById(R.id.imageView2);
    }

        //imageView= findViewById(R.id.imageView2);
       //imageView.animate().alpha(0).setDuration(10000);     //disappear
        //imageView.animate().translationY(1000).setDuration(2000);   //move downward
        //imageView.animate().rotation(180);
        //imageView.animate().rotation(360).setDuration(1000);
        //imageView.animate().rotation(720).alpha(0).setDuration(2000);
        //imageView.animate().scaleX(0.5f);
        //imageView.animate().scaleY(0.5f);
        //imageView.animate().scaleX(0.5f).scaleY(0.5f);
       //imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);

    public void animation1(View view)
    {
        imageView.animate().rotation(720).setDuration(2000);
    }
    public void animation2(View view)
    {
//        imageView.animate().scaleY(0.5f);
        imageView.animate().rotation(720).alpha(0).setDuration(2000);

        //imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }
    public void animation3(View view)
    {
        imageView.animate().rotation(720).scaleX(0.5f).scaleY(0.5f).setDuration(2000);
      //  imageView.animate().alpha(0).setDuration(1000);     //disappear
    }

    public void Next(View view) {
        Intent intent= new Intent(MainActivity.this,AudioActivity.class);
        startActivity(intent);
    }
}