package com.example.mihailstarikov.money;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DB {
    private ExpenditureHelper expenditureHelper;

    public DB(Context context) {
        expenditureHelper = new ExpenditureHelper(context);
    }

//Добавление записи в БД
    public void insertExpenditure(String article, Float sum, String date) {
        SQLiteDatabase db = expenditureHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(ExpenditureArticle.Statistics.COLUMN_ARTICLE, article);
        values.put(ExpenditureArticle.Statistics.COLUMN_SUM, sum);
        values.put(ExpenditureArticle.Statistics.COLUMN_DATE, date);

        long newRowId = db.insert(ExpenditureArticle.Statistics.TABLE_NAME, null, values);
    }

//Получение записи из БД
    public ArrayList<Expenditure> getExpenditures() {
        SQLiteDatabase db = expenditureHelper.getReadableDatabase();

        // Зададим условие для выборки - список столбцов
        String[] projection = {
                ExpenditureArticle.Statistics._ID,
                ExpenditureArticle.Statistics.COLUMN_ARTICLE,
                ExpenditureArticle.Statistics.COLUMN_SUM,
                ExpenditureArticle.Statistics.COLUMN_DATE};

        // Делаем запрос
        Cursor cursor = db.query(
                ExpenditureArticle.Statistics.TABLE_NAME,   // таблица
                projection,            // столбцы
                null,                  // столбцы для условия WHERE
                null,                  // значения для условия WHERE
                null,                  // Don't group the rows
                null,                  // Don't filter by row groups
                null);                   // порядок сортировки

        try {
            int idColumnIndex = cursor.getColumnIndex(ExpenditureArticle.Statistics._ID);
            int articleIndex = cursor.getColumnIndex(ExpenditureArticle.Statistics.COLUMN_ARTICLE);
            int sumIndex = cursor.getColumnIndex(ExpenditureArticle.Statistics.COLUMN_SUM);
            int dateIndex = cursor.getColumnIndex(ExpenditureArticle.Statistics.COLUMN_DATE);

            ArrayList<Expenditure> result = new ArrayList<Expenditure>();

            while(cursor.moveToNext()) {
                Expenditure expenditure = new Expenditure();
                expenditure.id = cursor.getInt(idColumnIndex);
                expenditure.article = cursor.getString(articleIndex);
                expenditure.sum = cursor.getInt(sumIndex);
                expenditure.date = cursor.getString(dateIndex);

                result.add(expenditure);
            }

            return result;
        }

        finally {
            cursor.close();
        }

    }

//Удаление записи из БД
    public void delete(int id) {
        SQLiteDatabase db = expenditureHelper.getWritableDatabase();
        db.delete(ExpenditureArticle.Statistics.TABLE_NAME, ExpenditureArticle.Statistics._ID + " = " + id, null);
    }

}
