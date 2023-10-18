package com.example.myproject2679

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterHome(private val listbuku:List<BukuModel>):
    RecyclerView.Adapter<AdapterHome.ViewHolder>(){

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageView2)
        val title:TextView = itemView.findViewById(R.id.textTitle)
        val desc:TextView = ItemView.findViewById(R.id.textView9)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_home,parent,false
        )
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modelBuku = listbuku[position]

        holder.image.setImageResource(modelBuku.image)
        holder.title.text = modelBuku.title
        holder.desc.text = modelBuku.desc

    }

    override fun getItemCount(): Int {
        return listbuku.size

    }


}