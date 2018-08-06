package com.example.david.retrofit.models;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.david.retrofit.R;

import java.util.List;

public class DavidAdapter extends RecyclerView.Adapter<DavidAdapter.ViewHolder> {
    List<Results> results;
    Context context;

    public DavidAdapter(Context context, List<Results> list){
        this.context = context;
        this.results = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return new ViewHolder(inflater.inflate(R.layout.item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Results r1 = results.get(i);
        viewHolder.bind(r1.getTitle(),r1.getYear(),r1.toString());

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView ano;
        TextView ids;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            ano = itemView.findViewById(R.id.ano);
            ids = itemView.findViewById(R.id.ano);
        }
        public void bind(String titulo, String ano, String ids){
            this.titulo.setText(titulo);
            this.ano.setText(ano);
            this.ids.setText(ids);
        }
    }

}
