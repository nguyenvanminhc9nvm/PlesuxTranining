package com.miichisoft.plesuxtranining;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
    private final String TAG = "Main";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        view = findViewById(R.id.listView);
        addList();
        adapter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");

    }

    //set adapter
    private void adapter() {
        ListAdapter listAdapter = new ListAdapter(adapters);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(listAdapter);
        Intent intent = new Intent(Main.this,FruitDetailsActivity.class);
        startActivity(intent);
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
