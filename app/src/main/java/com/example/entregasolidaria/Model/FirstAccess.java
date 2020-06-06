package com.example.entregasolidaria.Model;

import com.example.entregasolidaria.R;

public class FirstAccess {
    private int idUsuario;
    private String tipousuario;
    private String nome;
    private String email;
    private String endereco;
    private String senha;
    private String confsenha;
    private int cpf;
    private boolean cadastrado;

    public FirstAccess(int idUsuario, String tipousuario, String nome, String email, String endereco, String senha, String confsenha, int cpf, boolean cadastrado) {
        this.idUsuario = idUsuario;
        this.tipousuario = tipousuario;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
        this.confsenha = confsenha;
        this.cpf = cpf;
        this.cadastrado = cadastrado;
    }

    public FirstAccess(){}

    public int getIdUsuario() {return idUsuario;}

    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public String getConfsenha() {return confsenha;}

    public void setConfsenha(String confsenha) {this.confsenha = confsenha;}

    public int getCpf() {return cpf;}

    public void setCpf(int cpf) {this.cpf = cpf;}

    public boolean isCadastrado() {return cadastrado;}

    public void setCadastrado(boolean cadastrado) {this.cadastrado = cadastrado;}

    public String getTipousuario() {return tipousuario;}

    public void setTipousuario(String tipousuario) {this.tipousuario = tipousuario;}

}
