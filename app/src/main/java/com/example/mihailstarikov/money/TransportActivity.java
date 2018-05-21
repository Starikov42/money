package com.example.mihailstarikov.money;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class TransportActivity extends Activity {
    static public Integer pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transport);

//        Заголовок новой статьи расходов
        ArrayList<String> meansOfTransport = new ArrayList<String>();
        meansOfTransport.add("Bus");
        meansOfTransport.add("Trolleybus");
        meansOfTransport.add("Tram");
        meansOfTransport.add("Subway");
        meansOfTransport.add("Taxi");
        meansOfTransport.add("Companion");

        final Spinner listOfTransport = (Spinner) findViewById(R.id.listOfTransport);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.transport_spinner, meansOfTransport);
        listOfTransport.setAdapter(adapter);

//        Стоимость новой статьи расходов
        final EditText costOfExpenditure = (EditText) findViewById(R.id.costOfExpenditure);

        final ListView bd = (ListView) findViewById(R.id.BD);
        final ArrayAdapter<Expenditure> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, main.db.getExpenditures());
        bd.setAdapter(adapter1);

        bd.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pos = position;
            }
        });

//        Запись в БД
        Button add = (Button) findViewById(R.id.addSum);
        add.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                String article = (String) listOfTransport.getSelectedItem();
                try
                {
                    float summ = Float.parseFloat(costOfExpenditure.getText().toString());
                    main.db.insertExpenditure(article, summ, LocalDate.now().toString());
                }
                catch (Exception e)
                {
                    System.out.println("empty input");
                }
                bd.setAdapter(adapter1);
                adapter1.clear();
                adapter1.addAll(main.db.getExpenditures());
                adapter1.notifyDataSetChanged();

            }
        });

////        Выгрузка БД
//        Button show = (Button) findViewById(R.id.showExpenses);
//        show.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                adapter1.clear();
//                adapter1.addAll(main.db.getExpenditures());
//                adapter1.notifyDataSetChanged();
//            }
//        });

//        Чистка БД
        Button clear = (Button) findViewById(R.id.clearStatistics);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println(pos);

                if (pos != null) {
                    if (main.db.getExpenditures().size() == pos || main.db.getExpenditures().isEmpty())
                    {
                        pos = null;
                        return;
                    }
                    main.db.delete(main.db.getExpenditures().get(pos).id);
                    adapter1.clear();
                    adapter1.addAll(main.db.getExpenditures());
                    adapter1.notifyDataSetChanged();
                }
            }
        });

    }

}
