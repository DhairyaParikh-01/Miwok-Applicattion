package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class Numbers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumberFragment())
                .commit();
    }
}