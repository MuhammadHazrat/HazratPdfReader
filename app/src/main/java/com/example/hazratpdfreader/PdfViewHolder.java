package com.example.hazratpdfreader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PdfViewHolder extends RecyclerView.ViewHolder {

    TextView tvName;
    CardView container;


    public PdfViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.txtPdfName);
        container = itemView.findViewById(R.id.container);

        
    }
}
