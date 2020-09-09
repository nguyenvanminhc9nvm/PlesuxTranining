package com.miichisoft.plesuxtranining.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miichisoft.plesuxtranining.R
import com.miichisoft.plesuxtranining.model.FruitDetails

class FruitDetailsAdapter(private val mList: List<FruitDetails>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_fruit_details, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = mList[position]
        (holder as ViewHolder).imgSrc.setImageResource(item.imgSrc)
        holder.dLabel.text = item.name
        holder.dType.text = item.type
        holder.dDescription.text = item.description
    }

    override fun getItemCount(): Int {
        return mList.size
    }
    internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgSrc: ImageView = itemView.findViewById<View>(R.id.detail_img) as ImageView
        var dLabel: TextView = itemView.findViewById<View>(R.id.detail_label) as TextView
        var dType : TextView = itemView.findViewById<View>(R.id.detail_type) as TextView
        var dDescription : TextView = itemView.findViewById<View>(R.id.details) as TextView
    }
}