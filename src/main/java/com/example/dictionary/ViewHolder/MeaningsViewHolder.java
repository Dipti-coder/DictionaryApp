package com.example.dictionary.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

public class MeaningsViewHolder extends RecyclerView.ViewHolder {

    public TextView textView_partSpeech;
    public RecyclerView recycler_definitions;

    public MeaningsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_partSpeech = itemView.findViewById(R.id.textView_partSpeech);
        recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
    }
}
