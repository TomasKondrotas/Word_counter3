package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private Spinner spCounterOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     spCounterOption = findViewById(R.id.spCounterOption);


        spCounterOption =  findViewById(R.id.spCounterOption);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCounterOption.setAdapter(adapter);



    }
}