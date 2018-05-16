package com.example.mihailstarikov.money;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ProductsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);

//        Заголовок новой статьи расходов
        String[] products = { "Food", "Drugs", "Chemistry", "Clothes" };
        final Spinner listOfProducts = (Spinner) findViewById(R.id.listOfProducts);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.products_spinner, products);
        listOfProducts.setAdapter(adapter);

//        Стоимость новой статьи расходов
        final EditText costOfExpenditure = (EditText) findViewById(R.id.costOfExpenditure);

//        Запись в БД
        Button add = (Button) findViewById(R.id.addSum);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        Выгрузка БД
        Button show = (Button) findViewById(R.id.showExpenses);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        Чистка БД
        Button clear = (Button) findViewById(R.id.clearStatistics);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
