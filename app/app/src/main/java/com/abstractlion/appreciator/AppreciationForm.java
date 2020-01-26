package com.abstractlion.appreciator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class AppreciationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appreciation_form);

        Intent intent = getIntent();
        String src = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }
}
