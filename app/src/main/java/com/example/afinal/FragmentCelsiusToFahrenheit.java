package com.example.afinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentCelsiusToFahrenheit extends Fragment {
    EditText fahrenheit;
    Button btn;
    TextView value;

    @Override
    public View onCreate View(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_celsius, container, false);
        fahrenheit = view.findViewById(R.id.TempC);
        btn = view.findViewById(R.id.cal);
        value = view.findViewById(R.id.resultTempC);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = fahrenheit.getText().toString();
                Double ans = Double.parseDouble(inputText);
                double celsiusValue = ((C/5)*9)-32;
                String answer = String.valueof(celsiusValue);
                value.setText(answer);
            }
        });
        return view;
    }
}
