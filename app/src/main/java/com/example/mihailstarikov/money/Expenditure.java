package com.example.mihailstarikov.money;

public class Expenditure {
    public int id, sum;
    public String article, date;

    public String toString() {
        return article + " " + String.valueOf(sum) + " rub " + date;
    }
}
