package com.example.mihailstarikov.money;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class main extends Activity {
    public static DB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DB(this);

        final ImageButton meal = (ImageButton) findViewById(R.id.meal);
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, MealsActivity.class);
                startActivity(intent);
            }
        });

        final ImageButton transport = (ImageButton) findViewById(R.id.transport);
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, TransportActivity.class);
                startActivity(intent);
            }
        });

        final ImageButton products = (ImageButton) findViewById(R.id.products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, ProductsActivity.class);
                startActivity(intent);
            }
        });

        final ImageButton education = (ImageButton) findViewById(R.id.education);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, EducationActivity.class);
                startActivity(intent);
            }
        });

    }

//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//
//        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
//
//        }
//
//        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//
//        }
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//    }
}
