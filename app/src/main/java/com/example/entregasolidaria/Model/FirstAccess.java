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
    private int numeroEndereco;
    private int telefone;
    private boolean resultado;

    public FirstAccess(int idUsuario, String tipousuario, String nome, String email, String endereco,
                       String senha, String confsenha, int cpf, int numeroEndereco, int telefone, boolean resultado) {
        this.idUsuario = idUsuario;
        this.tipousuario = tipousuario;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numeroEndereco = numeroEndereco;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.confsenha = confsenha;
        this.resultado = resultado;
    }

    public FirstAccess(){}

    public int getIdUsuario() { return idUsuario; }

    public void setIdUsuario(int idUsuario) { idUsuario = idUsuario; }

    public String getTipousuario() {return tipousuario;}

    public void setTipousuario(String tipousuario) {this.tipousuario = tipousuario;}

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getCpf() {return cpf;}

    public void setCpf(int cpf) {this.cpf = cpf;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public int getNumeroEndereco() { return numeroEndereco; }

    public void setNumeroEndereco(int numeroEndereco) { this.numeroEndereco = numeroEndereco; }

    public String getEmail() { return email; }

    public void setEmail(String email) {this.email = email;}

    public int getTelefone() { return telefone; }

    public void setTelefone(int telefone) { this.telefone = telefone; }

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public String getConfsenha() {return confsenha;}

    public void setConfsenha(String confsenha) {this.confsenha = confsenha;}

    public boolean isResultado() {return resultado;}

    public void setResultado(boolean cadastrado) {this.resultado = cadastrado;}

}
