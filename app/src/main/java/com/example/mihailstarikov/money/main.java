package com.example.mihailstarikov.money;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class main extends Activity {
    ImageButton meal, transport, products, education;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyCustomApplication.db = new DB(this);
        String title = "";

        meal = (ImageButton) findViewById(R.id.meal);
        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getResources().getString(R.string.Meals);
                openDetailScreen(title);
            }
        });

        transport = (ImageButton) findViewById(R.id.transport);
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getResources().getString(R.string.Transport);
                openDetailScreen(title);
            }
        });

        products = (ImageButton) findViewById(R.id.products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = getResources().getString(R.string.Products);
                openDetailScreen(title);
            }
        });

        education = (ImageButton) findViewById(R.id.education);
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
