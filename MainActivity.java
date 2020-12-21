package com.example.numberplaterecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    private  static int splash_timeout=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image_splash);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
               startActivity(intent);
               finish(); }
       },splash_timeout);
    }
}
