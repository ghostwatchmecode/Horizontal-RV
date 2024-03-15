package com.example.recyclerviewapp.view.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.R;


public class LogoViewHolder extends RecyclerView.ViewHolder {

    public TextView tvIcon;
    public TextView txtViewRating;
    public ImageView image;

    public LogoViewHolder(@NonNull View itemView) {
        super(itemView);
        tvIcon = itemView.findViewById(R.id.tvIcon);
        txtViewRating = itemView.findViewById(R.id.tvRating);
        image = itemView.findViewById(R.id.logoIcon);
    }
}