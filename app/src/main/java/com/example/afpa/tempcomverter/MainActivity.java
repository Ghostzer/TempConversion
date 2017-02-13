package com.example.afpa.tempcomverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText temp;
    RadioButton toC;
    RadioButton toF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText)findViewById(R.id.txtNombre);
        toC = (RadioButton)findViewById(R.id.radioButtonFah2Cel);
        toF = (RadioButton)findViewById(R.id.radioButtonCel2Fah);
    }

    public void convert(View v) {
        double value = new Double(temp.getText().toString());
        if (toC.isChecked())
            value = Convert.fahrenheitToCelsius(value);
        else
            value = Convert.celsiusToFahrenheit(value);
        temp.setText(new Double(value).toString());
    }

    public void clearText(View v) {
        temp.setText("");
    }
}
