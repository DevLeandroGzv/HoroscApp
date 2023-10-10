package com.leamdro.horoscapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.NavArgs
import androidx.navigation.navArgs
import com.leamdro.horoscapp.R
import com.leamdro.horoscapp.databinding.ActivityHoroscopeDetailBinding
import com.leamdro.horoscapp.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class horoscopeDetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel : HoroscopeDetailViewModel by viewModels()

    private val args:horoscopeDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi() {
        initUiState()
    }

    private fun initUiState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopeDetailViewModel.state.collect{
                when(it){
                    is HoroscopeDetailState.Error -> errorState()

                    HoroscopeDetailState.Loading -> loadingState()
                    is HoroscopeDetailState.Success -> successState()
                }
                }
            }
        }
    }
    private fun loadingState(){
        binding.PGbar.isVisible = true
    }

    private fun errorState(){

    }
    private fun successState(){

    }
}