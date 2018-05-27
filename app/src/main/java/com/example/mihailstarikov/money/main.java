package com.example.mihailstarikov.money;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class main extends Activity {
    public static DB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DB(this);
        String title = "";

        final ImageButton meal = (ImageButton) findViewById(R.id.meal);
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getResources().getString(R.string.Meals);
                openDetailScreen(title);
            }
        });

        final ImageButton transport = (ImageButton) findViewById(R.id.transport);
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getResources().getString(R.string.Transport);
                openDetailScreen(title);
            }
        });

        final ImageButton products = (ImageButton) findViewById(R.id.products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getResources().getString(R.string.Products);
                openDetailScreen(title);
            }
        });

        final ImageButton education = (ImageButton) findViewById(R.id.education);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getResources().getString(R.string.Education);
                openDetailScreen(title);
            }
        });

    }

    private void openDetailScreen(String title) {
        Intent intent = new Intent(main.this, DetailActivity.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }

}
