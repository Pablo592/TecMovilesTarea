package com.tecno.tecnomoviles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapterSecond: RecyclerView.Adapter<CustomAdapterSecond.ViewHolder>() {

    val images = intArrayOf(R.drawable.auricular,
        R.drawable.gabinete,
        R.drawable.placa_madre,
        R.drawable.mouse)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_image_layout,viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: CustomAdapterSecond.ViewHolder, i: Int) {
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return images.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView

        init {
            itemImage = itemView.findViewById(R.id.item_image_second)
        }
    }
}