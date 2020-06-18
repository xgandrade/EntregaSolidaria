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

        comercios.add(new Comercio(1,"Sonda Supermercados - Tatuapé",
                "Rua Apucarana, 1000","01.937.635/0001.","(11) 2588-0500", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Extra Hipermercado",
                "Av.Brigadeiro Faria Lima, 1193","01.937.635/0001","0800 11 5060", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Carrefour Hipermercado",
                "Av. Benjamin Harris Hunicutt, s/n","45.543.915/0001-81","(11) 2453-8200", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Nova Farma Centro",
                "Av. Salgado Filho, 2544 - Centro,","60.975.075/0001-10","(11) 4803-9300", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Sonda Supermercados - São Paulo",
                "Rua Apucarana, 1000","01.937.635/0001.","(11) 2588-0500", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Drogasil Carrefour Guarulhos",
                "Av.Brigadeiro Faria Lima, 1193","01.937.635/0001","0800 11 5060", "26/06/2020",
                "26/06/2020",1));
        comercios.add(new Comercio(1,"Drogaria Calazans",
                "Av.Rua Apucarana, Faria Lima, 1193","01.937.635/0001","0800 11 5060", "26/06/2020",
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