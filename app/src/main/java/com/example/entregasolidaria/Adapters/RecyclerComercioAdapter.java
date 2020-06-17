package com.example.entregasolidaria.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.entregasolidaria.Model.Comercio;
import com.example.entregasolidaria.R;

import java.util.List;

public class RecyclerComercioAdapter extends RecyclerView.Adapter<RecyclerComercioAdapter.ViewHolderComercios>{
    private List<Comercio> dados;

    public RecyclerComercioAdapter(List<Comercio> dados){
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

            holder.txRazao.setText(comercio.RazaoSocial);
            holder.txCNPJ.setText(comercio.CNPJ);
            holder.txMail.setText(comercio.txMail);
            holder.txEnd.setText(comercio.txEnd);
            holder.txPhone.setText(comercio.txPhone);

        }
    }

    @Override
    public int getItemCount() {
        return dados.size();
    }

    public class ViewHolderComercios extends RecyclerView.ViewHolder{

        public TextView txRazao;
        public TextView txCNPJ;
        public TextView txMail;
        public TextView txEnd;
        public TextView txPhone;

        public ViewHolderComercios(@NonNull View itemView) {
            super(itemView);

            txRazao   = (TextView) itemView.findViewById(R.id.txRazao);
            txCNPJ    = (TextView)itemView.findViewById(R.id.txCNPJ);
            txMail    = (TextView) itemView.findViewById(R.id.txMail);
            txEnd     = (TextView)itemView.findViewById(R.id.txEnd);
            txPhone   = (TextView)itemView.findViewById(R.id.txPhone);

        }
    }
}
