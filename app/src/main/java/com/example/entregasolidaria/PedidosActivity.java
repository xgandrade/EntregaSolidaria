package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.Adapters.RecyclerPedidoAdapter;
import com.example.entregasolidaria.Model.Pedido;

import java.util.ArrayList;

public class PedidosActivity extends AppCompatActivity {

    ArrayList<Pedido> pedidos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_pedidos);

        //Preenchendo os pedidos para serem mostrados na lista
        Pedido pedido1 = new Pedido( 1, 2, 3 , 0, "14/06/2020", "15/06/2020", "10 usuários" );
        Pedido pedido2 = new Pedido( 2, 2, 3 , 0, "14/06/2020", "15/06/2020", "10 usuários" );
        Pedido pedido3 = new Pedido( 3, 2, 3 , 0, "14/06/2020", "15/06/2020", "10 usuários" );

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        iniciaRecyclerView();

    }

    //Quando clicado vai para tela de cadastro de pedido
    public void ClickNovoPed(View v) {
        Intent intent = new Intent(this, CadastroPedidoActivity.class);
        startActivity(intent);
    }
    // Quando clicado volta para menu inicial
    public void voltarPedidoClick(View v){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
    //Inicia a recycler de pedidos
    private void iniciaRecyclerView() {
        RecyclerView rv = findViewById(R.id.RecyclerPedido);
        RecyclerPedidoAdapter adaptador = new RecyclerPedidoAdapter(this, pedidos);
        rv.setAdapter(adaptador);
        rv.addItemDecoration(new DividerItemDecoration(rv.getContext(), DividerItemDecoration.VERTICAL));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }


}

