package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produto);
    }
    //Quando cancelar, voltar para tela de listagem de comércios
    public void CancelClick (View v){
        Intent intent = new Intent(this, ComerciosActivity.class) ;
        startActivity(intent);
    }
    //Quando cadastrar, voltar para tela de listagem de comércios
    public void btCadastrar (View v){
        Intent intent = new Intent(this, ComerciosActivity.class) ;
        startActivity(intent);

        Toast.makeText(this, R.string.cadProdOk, Toast.LENGTH_SHORT).show();
        finish();
    }

}
