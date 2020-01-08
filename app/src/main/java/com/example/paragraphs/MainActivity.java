package com.example.paragraphs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextClock;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextClock textClock;
    MaterialButton button1, button2, button3;
    ListView listView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textClock = findViewById(R.id.textClock);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        listView = findViewById(R.id.listView);
        textView = findViewById(R.id.textView);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Alpha");
        stringArrayList.add("Beta");
        stringArrayList.add("Gamma");
        stringArrayList.add("Theta");

        Adapter adapter = new Adapter(this, stringArrayList, 0);
        listView.setAdapter(adapter);
    }
}
