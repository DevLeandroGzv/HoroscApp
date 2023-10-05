package com.leamdro.horoscapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.leamdro.horoscapp.databinding.ItemHoroscopeBinding
import com.leamdro.horoscapp.domian.model.HoroscopeInfo

class HoroscopeViewHolder (view: View) : RecyclerView.ViewHolder(view){
    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscopeInfo: HoroscopeInfo){
        val context = binding.tvtitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvtitle.text = context.getString(horoscopeInfo.name)

    }
}