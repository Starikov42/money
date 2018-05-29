package com.example.mihailstarikov.money;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Item> {
    Context context;
    int res;
    ArrayList<Item> items;

    public ListViewAdapter(Context context, int resource, ArrayList<Item> items) {
        super(context, resource, (List<Item>) items);
        this.context = context;
        this.res = resource;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = View.inflate(context, R.layout.listview, null);
        TextView textView = view.findViewById(R.id.text2);
        textView.setText(items.get(position).getKey() + " " + items.get(position).getValue());

        return view;
    }

    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = View.inflate(context, R.layout.listview, null);
        TextView textView = view.findViewById(R.id.text2);
        textView.setText(items.get(position).getKey() + " " + items.get(position).getValue());

        return view;
    }
}
