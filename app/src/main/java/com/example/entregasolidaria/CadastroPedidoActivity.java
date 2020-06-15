package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroPedidoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);

    }

    //Botão para voltar para activity Listar Pedidos
    public void btnVoltar (View v){
        Intent intent = new Intent(this, PedidosActivity.class) ;
        startActivity(intent);
    }

    //Botão para confirmar novo cadastro de pedido
    public void btnConfirmar(){

    }

}
