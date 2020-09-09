package com.miichisoft.plesuxtranining.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miichisoft.plesuxtranining.FruitDetailsActivity
import com.miichisoft.plesuxtranining.R
import com.miichisoft.plesuxtranining.RecyclerViewActivity
import com.miichisoft.plesuxtranining.model.ItemAdapter

class ListAdapter(private val mList: List<ItemAdapter>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemAdapter = mList[position]
        (holder as ViewHolder).mTv_name.text = itemAdapter.text
        holder.mImg.setImageResource(itemAdapter.image)
        holder.itemView.setOnClickListener { v ->
            Log.d("Clicked", "Clicked")
            val intent: Intent = Intent(v.context, FruitDetailsActivity::class.java)
            intent.putExtra("fName", holder.mTv_name.text)
            v.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mTv_name: TextView = itemView.findViewById<View>(R.id.tv_name) as TextView
        var mImg: ImageView = itemView.findViewById<View>(R.id.img_item) as ImageView
    }
}