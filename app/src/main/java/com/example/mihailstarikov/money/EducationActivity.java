package com.example.mihailstarikov.money;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class EducationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.education);

//        Заголовок новой статьи расходов
        String[] educationPrograms = { "Conferences", "Books" };
        final Spinner listOfEducationPrograms = (Spinner) findViewById(R.id.listOfEducationProgramms);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.education_spinner, educationPrograms);
        listOfEducationPrograms.setAdapter(adapter);

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
