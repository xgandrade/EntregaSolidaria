package com.example.entregasolidaria.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.ComerciosActivity;
import com.example.entregasolidaria.Model.Comercio;
import com.example.entregasolidaria.R;

import java.util.List;

public class RecyclerComercioAdapter extends RecyclerView.Adapter<RecyclerComercioAdapter.ViewHolderComercios> {
    private List<Comercio> dados;

    public RecyclerComercioAdapter(ComerciosActivity comerciosActivity, List<Comercio> dados) {
        this.dados = dados;
    }


    @NonNull
    @Override
    public RecyclerComercioAdapter.ViewHolderComercios onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.activity_recycler_comercios, parent, false);
        ViewHolderComercios holderComercios = new ViewHolderComercios(view);
        return holderComercios;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerComercioAdapter.ViewHolderComercios holder, int position) {

        if ((dados != null) && (dados.size() > 0)) {

            holder.txRazao.setText(dados.get(position).getRazaoSocial());
            holder.txCNPJ.setText(dados.get(position).getCNPJ());
            holder.txEnd.setText(dados.get(position).getMercadoEndereco());
            holder.txPhone.setText(dados.get(position).getMercadoTelefone());

        }
    }

    @Override
    public int getItemCount() {
        return dados.size();
    }

    public class ViewHolderComercios extends RecyclerView.ViewHolder {

        public TextView txRazao;
        public TextView txCNPJ;
        public TextView txEnd;
        public TextView txPhone;

        public ViewHolderComercios(@NonNull View itemView) {
            super(itemView);

            txRazao = itemView.findViewById(R.id.txRazao);
            txCNPJ = itemView.findViewById(R.id.TxCNPJ_C);
            txEnd = itemView.findViewById(R.id.txEnd);
            txPhone = itemView.findViewById(R.id.txPhone);

        }
    }
}
