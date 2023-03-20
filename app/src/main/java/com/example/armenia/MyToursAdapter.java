package com.example.armenia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.armenia.R;

import java.util.ArrayList;

public class MyToursAdapter extends RecyclerView.Adapter<MyToursAdapter.ViewHolder> {
private Context context;
private ArrayList<ToursC> tours;

    public MyToursAdapter(Context context, ArrayList<ToursC> tours) {
        this.context = context;
        this.tours = tours;
    }


    @NonNull
    @Override
    public MyToursAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyToursAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyToursAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(tours.get(position).getName());
        holder.link.setText(tours.get(position).getWebsite());
        Glide.with(context).load(tours.get(position).getImage()).into(holder.image);

        holder.link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriUrl = Uri.parse(tours.get(position).getWebsite());
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                launchBrowser.addCategory(Intent.CATEGORY_BROWSABLE);context.startActivity(launchBrowser);
            }
        });

    }

    @Override
    public int getItemCount() {

        return tours.size();
    }

    public   class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
         private TextView title, link;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            link = itemView.findViewById(R.id.link);
            image = itemView.findViewById(R.id.toImage);

        }
    }
}



