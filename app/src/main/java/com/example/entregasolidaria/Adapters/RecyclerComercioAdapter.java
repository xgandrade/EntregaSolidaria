package com.example.entregasolidaria.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerComercioAdapter extends RecyclerView.Adapter<RecyclerComercioAdapter.ViewHolderComercios>{
    private List<Comercios> dados;

    public RecyclerComercioAdapter(List<Comercios> dados){
        this.dados= dados;
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

            holder.TxRazao_C.setText(comercio.razao);
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
