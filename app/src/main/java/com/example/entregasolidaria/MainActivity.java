package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LoginClick(View view){

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void FirstAccessClick(View view){

        Intent intent = new Intent(this, FirstAccessActivity.class);
        startActivity(intent);
    }

}
