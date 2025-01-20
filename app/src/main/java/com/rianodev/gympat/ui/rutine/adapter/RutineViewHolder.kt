package com.rianodev.gympat.ui.rutine.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.rianodev.gympat.databinding.ItemRutineBinding
import com.rianodev.gympat.domain.model.RutineInfo

class RutineViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemRutineBinding.bind(view)
    fun render(rutineInfo: RutineInfo){
        val context = binding.tvTitle.context
        binding.ivRutine.setImageResource(rutineInfo.img)
        binding.tvTitle.text = context.getString(rutineInfo.name)

    }
}