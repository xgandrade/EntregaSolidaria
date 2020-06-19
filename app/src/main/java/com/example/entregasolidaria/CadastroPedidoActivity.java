package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.entregasolidaria.Model.EscolherComercio;

public class CadastroPedidoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);

        ArrayAdapter<EscolherComercio> adaptadorComercios = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, EscolherComercio.values());
        AutoCompleteTextView editCampoQComercio = findViewById(R.id.edTpComercio);
        editCampoQComercio.setAdapter(adaptadorComercios);
        editCampoQComercio.setKeyListener(null);

    }

    //Botão para escolher os produtos do comercio setado
    public void EscolherProdClick (View v){
        Intent intent = new Intent(this, ProdutosActivity.class) ;
        startActivity(intent);
    }

    //Botão para voltar para activity Listar Pedidos
    public void CancelClick (View v){
        Intent intent = new Intent(this, PedidosActivity.class) ;
        startActivity(intent);
    }

    //Botão para confirmar novo cadastro de pedido
    public void btCadastrar (View v){
        Intent intent = new Intent(this, PedidosActivity.class) ;
        startActivity(intent);

        Toast.makeText(this, R.string.cadPedOk, Toast.LENGTH_SHORT).show();
        finish();
    }

}
