package com.example.mihailstarikov.money;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TransportActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transport);

//        Заголовок новой статьи расходов
        String[] meansOfTransport = { "Bus", "Trolleybus", "Tram", "Subway", "Taxi", "Companion" };
        final Spinner listOfTransport = (Spinner) findViewById(R.id.listOfTransport);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.transport_spinner, meansOfTransport);
        listOfTransport.setAdapter(adapter);

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
