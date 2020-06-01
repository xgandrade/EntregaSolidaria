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

    public void ProdClick(View view){
        Intent intent = new Intent(this, ProdutosActivity.class);
        startActivity(intent);
    }

    public void PedClick(View view){
        Intent intent = new Intent(this, PedidosActivity.class);
        startActivity(intent);
    }

    public void ExitClick(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                System.exit(0);

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}
