package com.wesley.keyboardsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


//implement an interface for handling calender click event

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//declare a variable to hold the EditText input
    private EditText birthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connect the EditText variable with the one in the Layout
        birthday=findViewById(R.id.birthday);
        //add an onClick listener to handle click events
    }

    @Override
    public void onClick(View v){

    }
}
