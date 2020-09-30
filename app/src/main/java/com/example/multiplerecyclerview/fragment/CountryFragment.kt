package com.example.multiplerecyclerview.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.fragment.adapter.CountryAdapter
import com.example.multiplerecyclerview.model.Country
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_country.*


class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var countrylist=ArrayList<Country>()

        countrylist.add(Country(R.drawable.japan,"Japan"))
        countrylist.add(Country(R.drawable.korea,"Korea"))
        countrylist.add(Country(R.drawable.china,"China"))
        countrylist.add(Country(R.drawable.international,"International"))

        var countryadapter=CountryAdapter(countrylist)
        countryRecyclerView.layoutManager=GridLayoutManager(context,2)
        countryRecyclerView.adapter=countryadapter
    }

    
}