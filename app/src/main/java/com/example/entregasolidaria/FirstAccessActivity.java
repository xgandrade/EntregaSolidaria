package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.entregasolidaria.Model.FirstAccess;
import com.example.entregasolidaria.Model.TipoUsuario;
import com.example.entregasolidaria.Utils.PostUserAPI;

public class FirstAccessActivity extends AppCompatActivity {
    EditText Tpuser, NameUser, paCpf,  paEnd, paNumEnd, paMail, paPhone,paSenha, paConfSenha;
    Button btCadastrar;
    FirstAccess primeiroacesso = new FirstAccess();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_access);

        Tpuser      = findViewById(R.id.edTpUser);
        NameUser    = findViewById(R.id.txtNome);
        paCpf       = findViewById(R.id.txtCpf);
        paEnd       = findViewById(R.id.txtEnd);
        paNumEnd    = findViewById(R.id.txtNEnd);
        paMail      = findViewById(R.id.txtEmail);
        paPhone     = findViewById(R.id.txtTel);
        paSenha     = findViewById(R.id.txtSenha);
        paConfSenha = findViewById(R.id.txtConfSenha);

        ArrayAdapter<TipoUsuario> adaptadorTpUsuario = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, TipoUsuario.values());
        AutoCompleteTextView editCampoTpUser = findViewById(R.id.edTpUser);
        editCampoTpUser.setAdapter(adaptadorTpUsuario);
        editCampoTpUser.setKeyListener(null);
    }

    public void btCadastrar(View v){
        if(validaDados()){
            //validou os campos e pode salvar...
            primeiroacesso.setIdUsuario(-1);
            primeiroacesso.setTipousuario(Tpuser.getText().toString());
            primeiroacesso.setNome(NameUser.getText().toString());
            primeiroacesso.setEndereco(paEnd.toString());
            primeiroacesso.setNumeroEndereco(Integer.parseInt(paNumEnd.getText().toString()));
            primeiroacesso.setEmail(paMail.getText().toString());
            primeiroacesso.setTelefone(Integer.parseInt(paPhone.getText().toString()));
            primeiroacesso.setSenha(paSenha.toString());
            primeiroacesso.setConfsenha(paConfSenha.toString());
            primeiroacesso.setCpf(Integer.parseInt(paCpf.getText().toString()));

            try {
                boolean executou = new PostUserAPI(primeiroacesso).execute().get();
            }catch (Exception e){
                e.printStackTrace();
            }

            Toast.makeText(this, R.string.usercadastrado, Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private boolean validaDados(){
        if(isEmpty(Tpuser)){
            mostraToastCampoVazio();
            Tpuser.requestFocus();
            return false;
        }else if (isEmpty(NameUser)){
            mostraToastCampoVazio();
            NameUser.requestFocus();
            return false;
        }else if(isEmpty(paCpf)){
            mostraToastCampoVazio();
            paCpf.requestFocus();
            return false;
        } else if(isEmpty(paEnd)){
            mostraToastCampoVazio();
            paEnd.requestFocus();
            return false;
        } else if(isEmpty(paNumEnd)){
            mostraToastCampoVazio();
            paNumEnd.requestFocus();
            return false;
        } else if(isEmpty(paMail)){
            mostraToastCampoVazio();
            paMail.requestFocus();
            return false;
        } else if(isEmpty(paPhone)){
            mostraToastCampoVazio();
            paPhone.requestFocus();
            return false;
        } else if(isEmpty(paSenha)){
            mostraToastCampoVazio();
            paSenha.requestFocus();
            return false;
        } else if(isEmpty(paConfSenha)){
            mostraToastCampoVazio();
            paConfSenha.requestFocus();
            return false;
        } else if(!paSenha.getText().toString().equals(paConfSenha.getText().toString())){
            mostraToastSenhaDif();
            paConfSenha.requestFocus();
            return false;
        }

        return true;
    }

    private void mostraToastCampoVazio(){
        Toast.makeText(this, R.string.campoVazio, Toast.LENGTH_SHORT).show();
    }

    private void mostraToastSenhaDif(){
        Toast.makeText(this, R.string.SenhaDif, Toast.LENGTH_SHORT).show();
    }

    private boolean isEmpty(EditText edText){
        return edText.getText().toString().trim().length() == 0;
    }

    public void CancelClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
