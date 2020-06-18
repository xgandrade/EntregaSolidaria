package com.example.entregasolidaria.Model;

public class Login {
    private int tipousuario;
    private String CpfUser;
    private String SenhaUser;

    public Login() {
        this.tipousuario = tipousuario;
        this.CpfUser = CpfUser;
        this.SenhaUser = SenhaUser;
    }

    public int getTipousuario() { return tipousuario; }

    public void setTipousuario(int tipousuario) { this.tipousuario = tipousuario; }

    public String getCpfUser() { return CpfUser; }

    public void setCpfUser(String cpfUser) { CpfUser = cpfUser; }

    public String getSenhaUser() { return SenhaUser; }

    public void setSenhaUser(String senhaUser) { SenhaUser = senhaUser; }

}
