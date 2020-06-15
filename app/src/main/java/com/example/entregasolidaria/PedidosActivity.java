package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PedidosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_pedidos);
    }

    //Quando clicado vai para tela de cadastro de pedido
    public void novoPedidoClick (View v){
        Intent intent = new Intent(this, CadastroPedidoActivity.class);
        startActivity(intent);
    }




}

