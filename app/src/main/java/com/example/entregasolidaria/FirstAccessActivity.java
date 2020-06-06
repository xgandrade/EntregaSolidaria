package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.entregasolidaria.Model.FirstAccess;
import com.example.entregasolidaria.Model.TipoUsuario;

public class FirstAccessActivity extends AppCompatActivity {
    EditText Tpuser, NameUser, paCpf, paMail, paEnd, paSenha, paConfSenha;
    Button btCadastrar;
    FirstAccess primeiroacesso = new FirstAccess();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_access);

        Tpuser      = findViewById(R.id.edTpUser);
        NameUser    = findViewById(R.id.txNome);
        paCpf       = findViewById(R.id.txCPF);
        paMail      = findViewById(R.id.txMail);
        paEnd       = findViewById(R.id.txEnd);
        paSenha     = findViewById(R.id.txSenha);
        paConfSenha = findViewById(R.id.txConfSenha);

        ArrayAdapter<TipoUsuario> adaptadorTpUsuario = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, TipoUsuario.values());
        AutoCompleteTextView editCampoTpUser = findViewById(R.id.edTpUser);
        editCampoTpUser.setAdapter(adaptadorTpUsuario);
        editCampoTpUser.setKeyListener(null);
    }

    public void CancelClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
