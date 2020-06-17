package com.example.entregasolidaria.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.Model.Comercio;
import com.example.entregasolidaria.Model.Pedido;
import com.example.entregasolidaria.R;

import java.util.ArrayList;

public class RecyclerComercioAdapter extends RecyclerView.Adapter<RecyclerComercioAdapter.ViewHolderComercios>{
    Context contexto;
    ArrayList<Comercio> comercios;
    
    public RecyclerPedidoAdapter(Context contexto, ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
        this.contexto = contexto;
    }
    @NonNull
    @Override
    public RecyclerComercioAdapter.ViewHolderComercios onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.activity_cadastro_comercio, parent, false);
        ViewHolderComercios holderComercios = new ViewHolderComercios(view);
        return holderComercios;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerComercioAdapter.ViewHolderComercios holder, int position) {

        if ( (dados != null ) && (dados.size() > 0 ) ) {
            Comercio comercio = dados.get(position);

            holder.TxRazao_C.setText(comercio.RazaoSocial);
            holder.TxCNPJ_C.setText(comercio.CNPJ);
        }
    }

    @Override
    public int getItemCount() {
        return dados.size();
    }

    public class ViewHolderComercios extends RecyclerView.ViewHolder{

        public TextView TxRazao_C;
        public TextView TxCNPJ_C;

        public ViewHolderComercios(@NonNull View itemView) {
            super(itemView);

            TxRazao_C  = (TextView) itemView.findViewById(R.id.TxRazao_C);
            TxCNPJ_C   = (TextView)itemView.findViewById(R.id.TxCNPJ_C);

        }
    }
}
