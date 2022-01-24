package com.digeometri.digeometri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_geometry_types.view.*

class TwoDimentionalAdapter (private val list: ArrayList<TwoDimentionalResponse>):
    RecyclerView.Adapter<TwoDimentionalAdapter.TwoDimentionalHolder>(){
    inner class TwoDimentionalHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(TwoDimentionalResponse: TwoDimentionalResponse){
            with(itemView){
                val text: String = "id: ${TwoDimentionalResponse.id}\n" +
                        "name: ${TwoDimentionalResponse.name}\n"
                tvText.text = text


            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwoDimentionalHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_geometry_types, parent, false)
        return TwoDimentionalHolder(view)
    }

    override fun onBindViewHolder(holder: TwoDimentionalHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}