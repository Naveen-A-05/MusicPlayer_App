package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bookdetails extends AppCompatActivity {
    TextView playnow;
    public void onBackPressed()
    {
        Intent i = new Intent(bookdetails.this,MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookdetails);



        playnow = findViewById(R.id.playingnow);
        playnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(bookdetails.this, playaudio.class);

                startActivity(i);
            }
        });
    }
}