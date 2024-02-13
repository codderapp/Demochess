package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ejava1;

    Button btnSubmit;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ejava1 = findViewById(R.id.exml1);
        btnSubmit = findViewById(R.id.btnSubmit);
        textView = findViewById(R.id.textView);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String myvalue =  ejava1.getText().toString();

               if(myvalue.isEmpty())
               {
                   ejava1.setError("Please Enter value");
               }
               else {
                   textView.setText(myvalue);
               }

            }
        });
    }
}