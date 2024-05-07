package com.compose.android.dev.edu.iiitnr.gondi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.compose.android.dev.edu.iiitnr.gondi.databinding.DictLayoutBinding
import com.compose.android.dev.edu.iiitnr.gondi.model.Dict

class DictAdapter():RecyclerView.Adapter<DictAdapter.DictViewHolder>(){

    private var dictList= listOf<Dict>()

    inner class DictViewHolder(val binding: DictLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DictViewHolder {
        return DictViewHolder(DictLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return dictList.size
    }

    fun submitList(list: List<Dict>) {
        dictList = list
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: DictViewHolder, position: Int) {
        val data = dictList[position]
        holder.binding.txtHindi.text = data.Hindi
        holder.binding.txtEnglish.text= data.English
        holder.binding.txtGondi.text = data.Gondi
    }


}