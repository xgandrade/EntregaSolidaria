package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.Adapters.RecyclerComercioAdapter;
import com.example.entregasolidaria.Model.Comercio;

import java.util.ArrayList;

public class ComerciosActivity extends AppCompatActivity {

    ArrayList<Comercio> comercios = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_comercios);

        iniciaRecyclerView();
    }

    private void iniciaRecyclerView(){
        iniciaListaComercios();
        RecyclerView rv = findViewById(R.id.RecyclerComercio);
        RecyclerComercioAdapter adaptador = new RecyclerComercioAdapter(this, comercios);
        rv.setAdapter(adaptador);
        rv.addItemDecoration(new DividerItemDecoration(rv.getContext(), DividerItemDecoration.VERTICAL));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void iniciaListaComercios() {

        comercios.add(new Comercio(1,"Mercadinho da esquina",
                "rua teste 123","Kit Kat","500", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Mercadinho da esquina",
                "rua teste 123","Kit Kat","500", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Mercadinho da esquina",
                "rua teste 123","Kit Kat","500", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Mercadinho da esquina",
                "rua teste 123","Kit Kat","500", "26/06/2020",
                "26/06/2020",1));
    }

    public void BackComClick(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void CriaComClick(View view){
        Intent intent = new Intent(this, CadastroComercioActivity.class);
        startActivity(intent);
    }

}