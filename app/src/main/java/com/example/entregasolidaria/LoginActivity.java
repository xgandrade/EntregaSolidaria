package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.entregasolidaria.Model.Login;

public class LoginActivity extends AppCompatActivity {
    EditText cpfuser, userSenha;

    Login entrar = new Login();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cpfuser      = findViewById(R.id.CPFUserID);
        userSenha    = findViewById(R.id.SenhaUserID);
    }

    public void LoginClick(View view){
        if(validaDados()){
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);

            Toast.makeText(this, R.string.LoginOK, Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    public void BackClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private boolean validaDados(){
        if(isEmpty(cpfuser)){
            mostraToastCampoVazio();
            cpfuser.requestFocus();
            return false;
        }else if (isEmpty(userSenha)){
            mostraToastCampoVazio();
            userSenha.requestFocus();
            return false;
        }else if (userSenha.getText().toString().equals("123456")){
            entrar.setTipousuario(1);
            return true;
        }

        return true;
    }

    private boolean isEmpty(EditText edText){
        return edText.getText().toString().trim().length() == 0;
    }

    private void mostraToastCampoVazio(){
        Toast.makeText(this, R.string.LoginFail, Toast.LENGTH_SHORT).show();
    }

}
