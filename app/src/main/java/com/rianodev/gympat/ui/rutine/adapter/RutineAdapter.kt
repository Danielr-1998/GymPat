package com.rianodev.gympat.ui.rutine.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rianodev.gympat.R
import com.rianodev.gympat.domain.model.RutineInfo
import com.rianodev.gympat.ui.rutine.adapter.RutineViewHolder

class RutineAdapter (private var rutineList: List<RutineInfo> = emptyList()): RecyclerView.Adapter<RutineViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RutineViewHolder {
        return RutineViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_rutine,parent, false)
        )
    }

    fun updateList(list: List<RutineInfo>){
        rutineList = list
        notifyDataSetChanged()
    }

    override fun getItemCount() = rutineList.size

    override fun onBindViewHolder(holder: RutineViewHolder, position: Int) {
        holder.render(rutineList[position])
    }


}