package com.example.multiplerecyclerview.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.model.Country
import kotlinx.android.synthetic.main.country_item.view.*

class CountryAdapter (var countrylist:ArrayList<Country>):RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){
    class CountryViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bind(country:Country){
            itemView.countryImage.setImageResource(country.countryimage)
            itemView.countryName.text=country.countryname
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
      holder.bind(countrylist[position])
    }

    override fun getItemCount(): Int =countrylist.size
}