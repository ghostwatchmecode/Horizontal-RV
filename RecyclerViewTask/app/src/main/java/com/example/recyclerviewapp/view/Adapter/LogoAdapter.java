package com.example.recyclerviewapp.view.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.Model.IconPojo;
import com.example.recyclerviewapp.R;
import com.example.recyclerviewapp.view.ViewHolder.LogoViewHolder;

import java.util.ArrayList;

public class LogoAdapter extends RecyclerView.Adapter<LogoViewHolder> {

    ArrayList<IconPojo> icons;

    public LogoAdapter(ArrayList icons) {
        this.icons = icons;
    }


    @NonNull
    @Override
    public LogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);
        return new LogoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LogoViewHolder holder, int position) {
        IconPojo icon = icons.get(position);

        holder.tvIcon.setText(icon.name);
        holder.txtViewRating.setText(icon.rating + "*");
        holder.image.setImageResource(icon.image);
    }


    @Override
    public int getItemCount() {
        return icons.size();
    }
}