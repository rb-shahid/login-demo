package com.byteshaft.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.byteshaft.logindemo.utils.Helpers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!Helpers.isUserLoggedIn()) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        }
    }
}
