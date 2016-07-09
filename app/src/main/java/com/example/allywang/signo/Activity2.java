package com.example.allywang.signo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent caller = getIntent();
        String message = caller.getStringExtra("message");
        EditText editText = (EditText) findViewById(R.id.editText2);
        editText.setText(message);
        Button button = (Button) findViewById(R.id.buttonOk);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
