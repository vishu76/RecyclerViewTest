package com.learningbot.recyclerviewtest.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learningbot.recyclerviewtest.Model.ItemModel;
import com.learningbot.recyclerviewtest.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder>{

    public ItemModel[] datalist;

    public MyAdapter(ItemModel[] datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @NotNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_row,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyAdapter.myViewHolder holder, int position) {
        holder.textView.setText(datalist[position].getName());
        holder.imageView.setImageResource(datalist[position].getImgId());

    }

    @Override
    public int getItemCount() {
        return datalist.length;
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public myViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
