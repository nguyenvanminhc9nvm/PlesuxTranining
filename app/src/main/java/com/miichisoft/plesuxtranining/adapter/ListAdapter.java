package com.miichisoft.plesuxtranining.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.miichisoft.plesuxtranining.R;
import com.miichisoft.plesuxtranining.model.ItemAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ItemAdapter> mList;

    public ListAdapter(List<ItemAdapter> list) {
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemAdapter itemAdapter = mList.get(position);
        ((ViewHolder) holder).mTv_name.setText(itemAdapter.getText());
        ((ViewHolder) holder).mImg.setImageResource(itemAdapter.getImage());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTv_name;
        public ImageView mImg;

        public ViewHolder(View itemView) {

            super(itemView);
            mTv_name = (TextView) itemView.findViewById(R.id.tv_name);
            mImg = (ImageView) itemView.findViewById(R.id.img_item);

        }
    }
}
