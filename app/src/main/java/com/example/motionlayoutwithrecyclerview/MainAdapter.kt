package com.example.motionlayoutwithrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val context: Context, val arrayList: ArrayList<MainModel>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.countryName.setText(arrayList[position].CountryName)
        holder.capitalName.setText(arrayList[position].Capital)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val countryName = itemView.findViewById<TextView>(R.id.countryName);
        val capitalName = itemView.findViewById<TextView>(R.id.capital);
    }
}