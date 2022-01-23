

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView play, book, book2, book3, book4, book5, book6, book7, book8, book9, forest, aplay, bplay;
    TextView textforest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.onplay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, playaudio.class);

                startActivity(i);
            }
        });
        aplay = findViewById(R.id.aplay);
        aplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, playaudio.class);

                startActivity(i);
            }
        });
        bplay = findViewById(R.id.bplay);
        bplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, playaudio.class);

                startActivity(i);
            }
        });
        forest= findViewById(R.id.forest);
        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, playaudio.class);

                startActivity(i);
            }
        });
        textforest = findViewById(R.id.textforest);
        textforest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, playaudio.class);

                startActivity(i);
            }
        });



        book = findViewById(R.id.book1);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book2 = findViewById(R.id.book2);
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book3 = findViewById(R.id.book3);
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book4 = findViewById(R.id.book4);
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book5 = findViewById(R.id.book5);
        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book6 = findViewById(R.id.book6);
        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book7 = findViewById(R.id.book7);
        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book8 = findViewById(R.id.book8);
        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });
        book9 = findViewById(R.id.book9);
        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, bookdetails.class);

                startActivity(i);
            }
        });


    }

}