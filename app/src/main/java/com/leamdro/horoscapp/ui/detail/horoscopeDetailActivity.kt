package com.leamdro.horoscapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavArgs
import androidx.navigation.navArgs
import com.leamdro.horoscapp.R
import com.leamdro.horoscapp.databinding.ActivityHoroscopeDetailBinding
import com.leamdro.horoscapp.databinding.ActivityMainBinding

class horoscopeDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel : HoroscopeDetailViewModel by viewModels()

    private val args:horoscopeDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        args.type
    }
}