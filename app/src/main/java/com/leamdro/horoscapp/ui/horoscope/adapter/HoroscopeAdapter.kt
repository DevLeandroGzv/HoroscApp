package com.leamdro.horoscapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leamdro.horoscapp.R
import com.leamdro.horoscapp.domian.model.HoroscopeInfo

 class HoroscopeAdapter (private var horoscopelist : List<HoroscopeInfo> = emptyList()) : RecyclerView.Adapter<HoroscopeViewHolder>(){


     fun updateList(list:List<HoroscopeInfo>){
         horoscopelist = list
         notifyDataSetChanged()
     }
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope,parent , false)
        )
     }

     override fun getItemCount() = horoscopelist.size


     override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
         holder.render(horoscopelist[position])

     }
 }