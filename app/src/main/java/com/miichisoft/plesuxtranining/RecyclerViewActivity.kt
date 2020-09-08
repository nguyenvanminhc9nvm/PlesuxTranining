package com.miichisoft.plesuxtranining

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miichisoft.plesuxtranining.adapter.ListAdapter
import com.miichisoft.plesuxtranining.model.ItemAdapter
import java.util.*

class RecyclerViewActivity : AppCompatActivity() {
    private var view: RecyclerView? = null
    private val adapters: MutableList<ItemAdapter> = ArrayList()
    private val TAG = "Main"
    public override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        view = findViewById(R.id.listView)
        addList()
        adapter()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    //set adapter
    private fun adapter() {
        val listAdapter = ListAdapter(adapters)
        view!!.setHasFixedSize(true)
        view!!.layoutManager = LinearLayoutManager(this)
        view!!.adapter = listAdapter
    }

    //add to View
    private fun addList() {
        adapters.add(newAdapter(R.drawable.cachua, "Tomato"))
        adapters.add(newAdapter(R.drawable.bo, "Avocado"))
        adapters.add(newAdapter(R.drawable.cam, "Orange"))
        adapters.add(newAdapter(R.drawable.oi, "Guava"))
        adapters.add(newAdapter(R.drawable.tao, "Apple"))
        adapters.add(newAdapter(R.drawable.dau, "Strawberry"))
        adapters.add(newAdapter(R.drawable.quaxoai, "Mango"))
    }

    //create item
    private fun newAdapter(img: Int, text: String): ItemAdapter {
        val itemAdapter = ItemAdapter()
        itemAdapter.image = img
        itemAdapter.text = text
        return itemAdapter
    }
}