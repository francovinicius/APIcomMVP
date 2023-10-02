package com.simpletask.apicommvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simpletask.apicommvp.R
import com.simpletask.apicommvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}