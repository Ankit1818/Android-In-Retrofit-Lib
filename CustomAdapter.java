package com.example.myapplication;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by hp on 10/1/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Myview> {
    Context context;
    List<Data> dataList;

    public CustomAdapter(List<Data> dataList)
    {
        this.dataList = dataList;
    }

    @Override
    public Myview onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);

        return new Myview(view);
    }

    @Override
    public void onBindViewHolder(Myview holder, int position) {
        holder.id.setText(dataList.get(position).getStatename());
        holder.username.setText(dataList.get(position).getCountryname());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class Myview extends RecyclerView.ViewHolder {
        TextView id, username;

        public Myview(View itemView) {
            super(itemView);
            id = (TextView) itemView.findViewById(R.id.textView);
            username = (TextView) itemView.findViewById(R.id.textView2);

        }
    }
}