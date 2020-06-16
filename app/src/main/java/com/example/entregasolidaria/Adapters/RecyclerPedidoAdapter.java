package com.example.entregasolidaria.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.Model.Pedido;
import com.example.entregasolidaria.R;

import java.util.ArrayList;

public class RecyclerPedidoAdapter extends RecyclerView.Adapter<RecyclerPedidoAdapter.ViewHolder> {

    Context contexto;
    ArrayList<Pedido> pedidos;

    public RecyclerPedidoAdapter(Context contexto, ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
        this.contexto = contexto;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_listar_pedidos, parent, false);
        ViewHolder holderPedidos = new ViewHolder(v);
        return holderPedidos;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idPedido.            setText(pedidos.get(position).getIdPedido());
        holder.idUsuarioSolic.      setText(pedidos.get(position).getIdUsuarioSolic());
        holder.idUsuarioEntreg.     setText(pedidos.get(position).getIdUsuarioEntreg());
        holder.statusPedido.        setText(pedidos.get(position).getStatusPedido());
        holder.dataSolicitada.      setText(pedidos.get(position).getDataSolicitada());
        holder.dataFinalizada.      setText(pedidos.get(position).getDataFinalizada());
        holder.usuariosNotificados. setText(pedidos.get(position).getUsuariosNotificados());

    }

    @Override
    public int getItemCount() {
        return pedidos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView idPedido, idUsuarioSolic, idUsuarioEntreg, statusPedido, dataSolicitada, dataFinalizada, usuariosNotificados;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idPedido              = itemView.findViewById(R.id.idPedido);
            idUsuarioSolic        = itemView.findViewById(R.id.idUsuarioSolic);
            idUsuarioEntreg       = itemView.findViewById(R.id.idUsuarioEntreg);
            statusPedido          = itemView.findViewById(R.id.statusPedido);
            dataSolicitada        = itemView.findViewById(R.id.dataSolicitada);
            dataFinalizada        = itemView.findViewById(R.id.dataFinalizada);
            usuariosNotificados   = itemView.findViewById(R.id.usuariosNotificados);
        }
    }
}
