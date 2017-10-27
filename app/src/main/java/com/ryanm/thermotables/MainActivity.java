package com.ryanm.thermotables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner fluid;
    Spinner varOne;
    Spinner varTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get three spinners holding user options
        fluid =  findViewById(R.id.fluid);
        varOne = findViewById(R.id.selectOne);
        varTwo = findViewById(R.id.selectTwo);

        //set adapter for fluid selection
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fluid_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fluid.setAdapter(adapter);

        //change adapter for variables array
        adapter = ArrayAdapter.createFromResource(this, R.array.variable, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //set this class as on selected listener
        fluid.setOnItemSelectedListener(this);
        varOne.setAdapter(adapter);
        varOne.setOnItemSelectedListener(this);
        varTwo.setAdapter(adapter);
        varTwo.setOnItemSelectedListener(this);

        //set selection to different things so user doesn't enter same thing twice
        varOne.setSelection(0);
        varTwo.setSelection(1);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        switch(pos) {
            case 0:
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
