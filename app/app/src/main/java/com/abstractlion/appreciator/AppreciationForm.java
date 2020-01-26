package com.abstractlion.appreciator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class AppreciationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appreciation_form);

        Intent intent = getIntent();
        int image_id = intent.getIntExtra("image_id", 1);
        ImageView iv = (ImageView) findViewById(R.id.appreciatee);


        int res = getResources().getIdentifier("th_" + image_id,
                "drawable", getPackageName());

        System.out.println("th_" + image_id);
        iv.setImageResource(res);
    }
}
