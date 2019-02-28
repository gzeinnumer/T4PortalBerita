package com.gzeinnumer.t4portalberita.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gzeinnumer.t4portalberita.R;
import com.gzeinnumer.t4portalberita.model.BeritaItem;

import java.util.ArrayList;
import java.util.List;

public class AdapterRV extends RecyclerView.Adapter<AdapterRV.MyHolder> {

    private Context context;
    private List<BeritaItem> list = new ArrayList<>();


    public AdapterRV(Context context, List<BeritaItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);
        MyHolder myHolder= new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int index) {
        myHolder.namaItem.setText(list.get(index).getJudulBerita());
        myHolder.tanggalItem.setText(list.get(index).getTanggalPosting());
        myHolder.penulisItem.setText(list.get(index).getPenulis());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        ImageView imgItem;
        TextView namaItem;
        TextView penulisItem;
        TextView tanggalItem;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.gambarBeritaList);
            namaItem = itemView.findViewById(R.id.namaBeritaList);
            penulisItem = itemView.findViewById(R.id.penulisBeritaList);
            tanggalItem = itemView.findViewById(R.id.tanggalBeritaList);


        }
    }
}
