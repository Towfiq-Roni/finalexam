package com.example.afinal;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentFahrenheitToCelsius extends Fragment {
    EditText fahrenheit;
    Button btn;
    TextView value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fahrenheit, container, false);
        celsius = view.findViewById(R.id.TempF);
        btn = view.findViewById(R.id.calculateTempF);
        value = view.findViewById(R.id.resultTempF);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = fahrenheit.getText().toString();
                Double ans = Double.parseDouble(inputText);
                double FValue = ans - 32/9;
                String anss = String.valueOf(FValue);
                value.setText(anss);
            }
        });
    }
}
