package com.example.allywang.signo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Button button = (Button) findViewById(R.id.buttonNext);
        button.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        EditText textBoxMessage = (EditText) findViewById(R.id.editText);
        String messageInput = textBoxMessage.getText().toString();
        Intent goToSecond = new Intent();
        goToSecond.setClass(Activity1.this, MainActivity.class);
        goToSecond.putExtra("message", messageInput);
        startActivity(goToSecond);
    }
}
