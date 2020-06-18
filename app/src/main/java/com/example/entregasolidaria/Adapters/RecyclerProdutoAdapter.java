package com.example.entregasolidaria.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.entregasolidaria.Model.Produto;
import com.example.entregasolidaria.R;
import java.util.ArrayList;

public class RecyclerProdutoAdapter extends RecyclerView.Adapter<RecyclerProdutoAdapter.ViewHolder> {

    Context contexto;
    ArrayList<Produto> produtos;

    public RecyclerProdutoAdapter(Context contexto, ArrayList<Produto> produtos) {
        this.produtos = produtos;
        this.contexto = contexto;
    }

    @NonNull
    @Override
    public RecyclerProdutoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_produtos, parent, false);
        RecyclerProdutoAdapter.ViewHolder holderProdutos = new RecyclerProdutoAdapter.ViewHolder(v);
        return holderProdutos;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.descricao.setText(produtos.get(position).getDescricao());
        holder.preco.setText(String.valueOf(produtos.get(position).getPreco()));
        holder.estoque.setText(String.valueOf(produtos.get(position).getEstoque()));
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView preco, descricao, estoque;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            preco = itemView.findViewById(R.id.txtPreco);
            estoque = itemView.findViewById(R.id.txtEstoque);
            descricao = itemView.findViewById(R.id.txtDescricao);

        }
    }
}
