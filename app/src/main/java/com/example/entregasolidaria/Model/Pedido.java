package com.example.entregasolidaria.Model;

public class Pedido {
    private int idPedido;
    private int idUsuarioSolic;
    private int idUsuarioEntreg;
    private int statusPedido;
    private String dataSolicitada;
    private String dataFinalizada;
    private String usuariosNotificados;

    // private int merc_idMercado;
    // private String prodPed_Produtos;

    // Método Construtor
    public Pedido(int idPedido, int idUsuarioSolic, int idUsuarioEntreg, int statusPedido, String dataSolicitada, String dataFinalizada, String usuariosNotificados) {
        this.idPedido = idPedido;
        this.idUsuarioSolic = idUsuarioSolic;
        this.idUsuarioEntreg = idUsuarioEntreg;
        this.statusPedido = statusPedido;
        this.dataSolicitada = dataSolicitada;
        this.dataFinalizada = dataFinalizada;
        this.usuariosNotificados = usuariosNotificados;
    }

    public Pedido() {}

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuarioSolic() {
        return idUsuarioSolic;
    }

    public void setIdUsuarioSolic(int idUsuarioSolic) {
        this.idUsuarioSolic = idUsuarioSolic;
    }

    public int getIdUsuarioEntreg() {
        return idUsuarioEntreg;
    }

    public void setIdUsuarioEntreg(int idUsuarioEntreg) {
        this.idUsuarioEntreg = idUsuarioEntreg;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getDataSolicitada() {
        return dataSolicitada;
    }

    public void setDataSolicitada(String dataSolicitada) {
        this.dataSolicitada = dataSolicitada;
    }

    public String getDataFinalizada() {
        return dataFinalizada;
    }

    public void setDataFinalizada(String dataFinalizada) {
        this.dataFinalizada = dataFinalizada;
    }

    public String getUsuariosNotificados() {
        return usuariosNotificados;
    }

    public void setUsuariosNotificados(String usuariosNotificados) {
        this.usuariosNotificados = usuariosNotificados;
    }
}
