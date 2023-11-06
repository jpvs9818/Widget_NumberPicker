package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    NumberPicker numberPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textId);
        numberPicker = findViewById(R.id.numPickerId);

        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(10);
        textView.setText(String.format("User's number is: " + numberPicker.getValue()));
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldV, int newV) {
                textView.setText(String.format("User's number is: " + newV));
            }
        });
    }
}