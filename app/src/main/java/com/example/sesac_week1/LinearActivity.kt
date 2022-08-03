package com.example.sesac_week1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sesac_week1.databinding.ActivityLinearBinding

class LinearActivity : AppCompatActivity() {
    lateinit var binding: ActivityLinearBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.linearBackIv.setOnClickListener {
            finish()
        }
    }
}