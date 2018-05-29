package com.example.mihailstarikov.money;

import android.provider.BaseColumns;

public final class ExpenditureArticle {

    private ExpenditureArticle() {}

    public static final class Statistics implements BaseColumns {
        public final static String TABLE_NAME = "Statistics";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_ARTICLE = "article";
        public final static String COLUMN_SUM = "sum";
        public final static String COLUMN_DATE = "date";
    }

}
