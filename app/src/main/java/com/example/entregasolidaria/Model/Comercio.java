package com.example.entregasolidaria.Model;

import java.util.Date;

public class Comercio {
    public int IdMercado;
    public String RazaoSocial;
    public String MercadoEndereco;
    public String CNPJ;
    public String MercadoTelefone;
    public int IdUsuario;
    public Date HoraInicio;
    public Date HoraFim;


    public Comercio(int IdMercado, String RazaoSocial, String MercadoEndereco, String CNPJ, String MercadoTelefone,
                    Date HoraInicio, Date HoraFim, int IdUsuario) {
        this.IdMercado = IdMercado;
        this.RazaoSocial = RazaoSocial;
        this.MercadoEndereco = MercadoEndereco;
        this.CNPJ = CNPJ;
        this.MercadoTelefone = MercadoTelefone;
        this.HoraInicio = HoraInicio;
        this.HoraFim = HoraFim;
        this.IdUsuario = IdUsuario;
    }

    public int getIdMercado() {
        return IdMercado;
    }

    public void setIdMercado(int idMercado) {
        IdMercado = idMercado;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
    }

    public String getMercadoEndereco() {
        return MercadoEndereco;
    }

    public void setMercadoEndereco(String mercadoEndereco) {
        MercadoEndereco = mercadoEndereco;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getMercadoTelefone() {
        return MercadoTelefone;
    }

    public void setMercadoTelefone(String mercadoTelefone) {
        MercadoTelefone = mercadoTelefone;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public Date getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        HoraInicio = horaInicio;
    }

    public Date getHoraFim() {
        return HoraFim;
    }

    public void setHoraFim(Date horaFim) {
        HoraFim = horaFim;
    }
}
