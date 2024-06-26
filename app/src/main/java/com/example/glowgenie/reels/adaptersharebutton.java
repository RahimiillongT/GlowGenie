package com.example.glowgenie.reels;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.glowgenie.R;

import java.util.List;

public class adaptersharebutton extends RecyclerView.Adapter<adaptersharebutton.ViewHolder> {

    List<String> abcd;
    List<Integer> abcdImage;
    LayoutInflater inflater;
    public adaptersharebutton (Context ctx, List<String> abcd, List<Integer> abcdImage){
        this.abcd = abcd;
        this.abcdImage = abcdImage;
        this.inflater =LayoutInflater.from(ctx);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.sharebutton2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.abcd.setText(abcd.get(position));
        holder.abcdImage.setImageResource(abcdImage.get(position));
    }

    @Override
    public int getItemCount() {
        return abcd.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView abcd;
        ImageView abcdImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            abcd = itemView.findViewById(R.id.textView);
            abcdImage = itemView.findViewById(R.id.imageView);
        }
    }
}
