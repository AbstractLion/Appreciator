package com.abstractlion.appreciator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AppreciateActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView promptTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appreciate);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        nameTextView = findViewById(R.id.appreciateName);
        promptTextView = findViewById(R.id.appreciatePrompt);
        nameTextView.setText(name);
        promptTextView.setHint("I appreciate " + name + " because ...");

       // BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        /*AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);*/
    }


    public void submit(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Thanks for sharing the happiness!", Toast.LENGTH_LONG);
        toast.show();
        finish();
    }
}
