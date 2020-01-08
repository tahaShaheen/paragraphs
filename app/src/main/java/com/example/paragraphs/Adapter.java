package com.example.paragraphs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<String> {

    public Adapter(@NonNull Context context, ArrayList<String> arrayList, int resource) {
        super(context, resource, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;

        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.layout, parent, false);
        }

        String currentString = getItem(position);

        TextView textView = itemView.findViewById(R.id.textView);

        textView.setText(currentString);

        return itemView;

    }
}
