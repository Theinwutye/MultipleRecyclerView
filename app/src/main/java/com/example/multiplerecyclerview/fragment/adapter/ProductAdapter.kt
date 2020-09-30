package com.example.multiplerecyclerview.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.model.Product
import kotlinx.android.synthetic.main.product_item.view.*

class ProductAdapter (var productlist:ArrayList<Product>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
   class ProductViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    fun bind(product:Product){
        itemView.productName.text=product.productname
        itemView.productBrand.text=product.productbrand
        itemView.productPrice.text=product.productprice
        itemView.productImg.setImageResource(product.productimg)
    }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
holder.bind(productlist[position])
    }

    override fun getItemCount(): Int =productlist.size
}