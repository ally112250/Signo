package com.example.allywang.signo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent caller = getIntent();
        String message = caller.getStringExtra("message");
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

    }
}
