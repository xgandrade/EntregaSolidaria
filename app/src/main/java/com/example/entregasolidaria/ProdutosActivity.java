package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.Adapters.RecyclerProdutoAdapter;
import com.example.entregasolidaria.Model.Produto;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    ArrayList<Produto> produtos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos_comercio);

        iniciaRecyclerView();
    }


    private void iniciaRecyclerView(){
        iniciaListaProdutos();
        RecyclerView rv = findViewById(R.id.RecyclerProduto);
        RecyclerProdutoAdapter adaptador = new RecyclerProdutoAdapter(this, produtos);
        rv.setAdapter(adaptador);
        rv.addItemDecoration(new DividerItemDecoration(rv.getContext(), DividerItemDecoration.VERTICAL));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void iniciaListaProdutos() {
        produtos.add(new Produto(1,1,12.50,"Kit Kat",500));
        produtos.add(new Produto(2,1,55.50,"Kit Kat Branco",500));
        produtos.add(new Produto(3,1,33.50,"Kit Kat Preto",500));
        produtos.add(new Produto(4,1,80.50,"Kit Kat Verde",500));
        produtos.add(new Produto(1,1,12.50,"Kit Kat",500));
        produtos.add(new Produto(2,1,55.50,"Kit Kat Branco",500));
        produtos.add(new Produto(3,1,33.50,"Kit Kat Preto",500));
        produtos.add(new Produto(4,1,80.50,"Kit Kat Verde",500));
        produtos.add(new Produto(1,1,12.50,"Kit Kat",500));
        produtos.add(new Produto(2,1,55.50,"Kit Kat Branco",500));
        produtos.add(new Produto(3,1,33.50,"Kit Kat Preto",500));
        produtos.add(new Produto(4,1,80.50,"Kit Kat Verde",500));
    }

    public void VoltarClick(View view){
        Intent intent = new Intent(this, ComerciosActivity.class);
        startActivity(intent);
    }

    public void ClickNovoProd(View v) {
        Intent intent = new Intent(this, CadastroProdutoActivity.class);
        startActivity(intent);
    }
}