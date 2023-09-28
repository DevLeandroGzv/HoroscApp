package com.leamdro.horoscapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leamdro.horoscapp.R
import com.leamdro.horoscapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}