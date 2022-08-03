package com.example.sesac_week1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sesac_week1.databinding.ActivityRelativeBinding

class RelativeActivity : AppCompatActivity() {
    lateinit var binding: ActivityRelativeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelativeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.relativeBackIv.setOnClickListener {
            finish()
        }
    }
}