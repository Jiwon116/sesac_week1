package com.example.sesac_week1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sesac_week1.databinding.ActivityFrameBinding

class FrameActivity : AppCompatActivity() {
    lateinit var binding: ActivityFrameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frameBackIv.setOnClickListener {
            finish()
        }
    }
}