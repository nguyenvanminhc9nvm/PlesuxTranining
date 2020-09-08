package com.miichisoft.plesuxtranining;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.miichisoft.plesuxtranining.model.ItemAdapter;
import com.miichisoft.plesuxtranining.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {
    private RecyclerView view;
    private List<ItemAdapter> adapters = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        view = findViewById(R.id.listView);
        addList();
        adapter();
    }

    //set adapter
    private void adapter() {
        ListAdapter listAdapter = new ListAdapter(adapters);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(listAdapter);
    }

    //add to View
    private void addList() {
        adapters.add(newAdapter(R.drawable.cachua, "Tomato"));
        adapters.add(newAdapter(R.drawable.bo, "Avocado"));
        adapters.add(newAdapter(R.drawable.cam, "Orange"));
        adapters.add(newAdapter(R.drawable.oi, "Guava"));
        adapters.add(newAdapter(R.drawable.tao, "Apple"));
        adapters.add(newAdapter(R.drawable.dau, "Strawberry"));
        adapters.add(newAdapter(R.drawable.quaxoai, "Mango"));
    }

    //create item
    private ItemAdapter newAdapter(int img, String text) {
        ItemAdapter itemAdapter = new ItemAdapter();
        itemAdapter.setImage(img);
        itemAdapter.setText(text);
        return itemAdapter;
    }

}
