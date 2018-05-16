package com.example.mihailstarikov.money;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ExpenditureHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = ExpenditureHelper.class.getSimpleName();

//    Имя файла базы данных
    private static final String DATABASE_NAME = "expenditure.db";

//    Версия базы данных. При изменении схемы увеличить на 1
    private static final int DATABASE_VERSION = 1;

    public ExpenditureHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_EXPENDITURE_TABLE = "CREATE TABLE " + ExpenditureArticle.Statistics.TABLE_NAME + " ("
                + ExpenditureArticle.Statistics._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ExpenditureArticle.Statistics.COLUMN_ARTICLE + " TEXT NOT NULL, "
                + ExpenditureArticle.Statistics.COLUMN_SUM + " REAL NOT NULL, "
                + ExpenditureArticle.Statistics.COLUMN_DATE + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_EXPENDITURE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
