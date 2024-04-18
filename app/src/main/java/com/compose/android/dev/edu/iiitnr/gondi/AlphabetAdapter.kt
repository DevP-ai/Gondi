package com.compose.android.dev.edu.iiitnr.gondi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlphabetAdapter(private val context: Context, private val dataList: List<Alphabet>) :
    RecyclerView.Adapter<AlphabetAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gondi: ImageView = itemView.findViewById(R.id.gondi_image)
        val hindi: TextView = itemView.findViewById(R.id.hindi_letter)
        val english: TextView = itemView.findViewById(R.id.english_letter)
        val assamese: TextView = itemView.findViewById(R.id.assamese_letter)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.alphabet_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.gondi.setImageResource(item.gondi)
        holder.hindi.text = item.hindi
        holder.english.text = item.english
        holder.assamese.text = item.assamese
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
