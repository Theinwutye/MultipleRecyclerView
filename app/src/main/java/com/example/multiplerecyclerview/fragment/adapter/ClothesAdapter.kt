package com.example.multiplerecyclerview.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.model.Clothes
import kotlinx.android.synthetic.main.clothes_item.view.*

class ClothesAdapter (var clotheslist:ArrayList<Clothes>):RecyclerView.Adapter<ClothesAdapter.ClothesViewHolder>(){
class ClothesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
fun bind(clothes:Clothes){
itemView.imgClothes.setImageResource(clothes.image)
    itemView.txtName.text=clothes.name
    itemView.txtType.text=clothes.type
    itemView.txtBrand.text=clothes.brand
    itemView.txtPrice.text=clothes.price

}

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClothesViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.clothes_item,parent,false)
        return ClothesViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClothesViewHolder, position: Int) {
        holder.bind(clotheslist[position])
    }

    override fun getItemCount(): Int=clotheslist.size
}