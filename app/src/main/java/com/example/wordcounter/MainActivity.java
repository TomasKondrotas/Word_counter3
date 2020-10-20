package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Spinner spCounterOption;
    private EditText etEnteredText;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     spCounterOption = findViewById(R.id.spCounterOption);
     etEnteredText = findViewById(R.id.etEnteredText);
     tvResult = findViewById(R.id.tvResult);


        spCounterOption =  findViewById(R.id.spCounterOption);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCounterOption.setAdapter(adapter);



    }

    public void onBtnClick(View view) {
        Toast.makeText(this, spCounterOption.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

        String spSelectedOption = spCounterOption.getSelectedItem().toString();
        String charString = getString(R.string.selection_chars);

        if (spSelectedOption.equalsIgnoreCase(charString)) {
            String enteredUserText = etEnteredText.getText().toString();
            int charsCount = TextCounter.getCharsCount(enteredUserText);

            tvResult.setText(String.valueOf(charsCount));

        }
        else {
            Toast.makeText(this, "Not implemented", Toast.LENGTH_SHORT);

        }

        }
    }
