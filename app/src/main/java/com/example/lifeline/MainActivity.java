package com.example.lifeline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ToChange(View view) {
        Intent intent = new Intent(this, DriverForm.class);
        startActivity(intent);
    }

    public void ToChange1(View view) {
        Intent intent = new Intent(this, userform.class);
        startActivity(intent);
    }
}
