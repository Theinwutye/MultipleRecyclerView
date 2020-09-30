package com.example.multiplerecyclerview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.fragment.adapter.ClothesAdapter
import com.example.multiplerecyclerview.model.Clothes
import kotlinx.android.synthetic.main.fragment_clothes.*

class ClothesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clothes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var clotheslist = ArrayList<Clothes>()
        clotheslist.add(
            Clothes(
                R.drawable.lv,
                "Hyde Park",
                "N41015",
                "LOUIS VUITTON",
                "999,99999Ks"
            )
        )
        clotheslist.add(
            Clothes(
                R.drawable.tshirt,
                "HORNS PINK LONG",
                "SLEEVE T SHIRT",
                "Lady Gaga",
                "72000Ks"
            )
        )

        var clothesAdapter = ClothesAdapter(clotheslist)
        clothesRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, true)
        clothesRecyclerView.adapter = clothesAdapter
    }
}