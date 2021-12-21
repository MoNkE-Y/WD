package com.example.mylaba3;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    List<String> list;

    public Adapter(List<String> passedlist){
        this.list = passedlist;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("mylog", "onCreateViewHolder");
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);

        myViewHolder holder = new myViewHolder(itemView);
        return holder;

    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        Log.i("mylog", "onBindViewHolder");
        holder.tv.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public myViewHolder(View view){
            super(view);
            tv = view.findViewById(R.id.tv);
        }
    }
}