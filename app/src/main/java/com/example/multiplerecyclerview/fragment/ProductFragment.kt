package com.example.multiplerecyclerview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.fragment.adapter.ProductAdapter
import com.example.multiplerecyclerview.model.Product
import kotlinx.android.synthetic.main.fragment_product.*

class ProductFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var productlist=ArrayList<Product>()
        productlist.add(Product("Iphone 8 Plus","Apple","980000 Ks",R.drawable.apple))
        productlist.add(Product("GhostBed 11 Inch Colling Gel Memory Foam...","GhostBed","325000 Ks",R.drawable.bed))
        productlist.add(Product("Nintendo Switch-Neon Blue and Red Joy-Con","Nintendo","359000 Ks",R.drawable.neon))
        productlist.add(Product("BELAROI Womens Comfy Swing Tunic Short..","Belaroi","18990 Ks",R.drawable.dress))

        var productadapter=ProductAdapter(productlist)
        productRecyclerView.layoutManager=LinearLayoutManager(context)
        productRecyclerView.adapter=productadapter
    }
}