package com.example.java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter_theory extends RecyclerView.Adapter<CustomAdapter_theory.CustomHolder>
{
    Context context;
    int []image;
    String []title;
    String []htmlFile;

    public CustomAdapter_theory(Context context, int[] image, String[] title, String[] htmlFile) {
        this.context = context;
        this.image = image;
        this.title = title;
        this.htmlFile = htmlFile;
    }


    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.java_theory_list_item,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        //String htmlFile = htmlFile[position];
        holder.textView.setText(title[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView)itemView.findViewById(R.id.image_chapter);
            textView = (TextView)itemView.findViewById(R.id.title_theory);
        }
    }
}
