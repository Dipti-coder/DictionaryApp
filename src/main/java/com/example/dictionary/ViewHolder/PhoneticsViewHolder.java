package com.example.dictionary.ViewHolder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

public class PhoneticsViewHolder extends RecyclerView.ViewHolder {

    public TextView textView_phonetic;
    public ImageButton imageButton_audio;

    public PhoneticsViewHolder(@NonNull View itemView) {
        super(itemView);

        textView_phonetic = itemView.findViewById(R.id.recycler_phonetics);  //Note- Copy any line in android studio using short cut Crtl+D.
        imageButton_audio = itemView.findViewById(R.id.imageButton_audio);


    }
}
