package com.abstractlion.appreciator;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

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

        ImageButton submitButton = findViewById(R.id.submitAppreciationButton);

    }
    public void onSubmitClick(View v) {
        Toast toast = Toast.makeText(v.getContext(), "Appreciation Received!", Toast.LENGTH_LONG);
        toast.show();
        finish();
    }

}
