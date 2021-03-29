package com.chendy.helloworld1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_example;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_example = (TextView)findViewById(R.id.text_example);
        Button clicky = (Button) findViewById(R.id.clicky);

        clicky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                text_example.setText("Clicked!");
            }
        });
    }
}