package com.example.entregasolidaria;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void PerfilClick(View view){
        Intent intent = new Intent(this, FirstAccessActivity.class);
        startActivity(intent);
    }

    public void ComClick(View view){
        Intent intent = new Intent(this, ComerciosActivity.class);
        startActivity(intent);
    }

    public void PedClick(View view){
        Intent intent = new Intent(this, PedidosActivity.class);
        startActivity(intent);
    }

    public void MainClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
