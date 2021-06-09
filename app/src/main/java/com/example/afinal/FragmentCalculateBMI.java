package com.example.afinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentCalculateBMI extends Fragment {
    String height, weight;
    private EditText heightText, weightText;
    private Button;
    @Override
    public View OnCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
    View view = inflater.inflate(R.layout.fragment_calculate_bmi,container,false);
    heightText = view.findViewById(R.id.height);
    weightText = view.findViewById(R.id.weight);
    calculateBtn = view.findViewById(R.id.calculate);
    height = heightText.getText().toString();
    weight = weightText.getText().toString();
    calculateBtn.setOnClickListener(new View, onClickListener){
        double heightValue = Double.parseDouble(height)*0.0254;
        double weightValue = Double.parseDouble(weight);
        double bmi = weightValue/(heightValue*heightValue);
        String bmiValue;
        if(bmi>25){
            bmiValue = "OverWeight";
        }
        else{
            bmiValue = "Not OverWeight";
        }
        }
        Toast.makeText(getContext(),bmiValue,Toast.LENGTH_SHORT).show();
    }
    return View;
}
