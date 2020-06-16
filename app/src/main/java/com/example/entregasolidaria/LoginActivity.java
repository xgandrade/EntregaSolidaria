package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.entregasolidaria.Utils.HttpService;

import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void LoginClick(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);

        Toast.makeText(this, R.string.LoginOK, Toast.LENGTH_SHORT).show();
        finish();
    }

    public void BackClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
