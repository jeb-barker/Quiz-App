package com.barkerjeb.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText textBox;
    TextView shownText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton=findViewById(R.id.clickButton);
        textBox=findViewById(R.id.editText);
        shownText=findViewById(R.id.textBox);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hello Mom!");
                Log.i("testButton", "Hi Dad!" + textBox.getText().toString());

                shownText.setText(shownText.getText().toString() + " " + textBox.getText().toString());
            }
        });
        textBox.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus)
                {
                    if(textBox.getText().toString().equals("TJ"))
                    {
                        shownText.setText("TJ Rocks");
                        textBox.setText("");
                        textBox.setHint("That's a good Name");
                    }

                }
            }
        });
    }
}