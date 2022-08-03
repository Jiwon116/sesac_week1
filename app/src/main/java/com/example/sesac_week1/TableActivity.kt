package com.example.sesac_week1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sesac_week1.databinding.ActivityTableBinding

class TableActivity : AppCompatActivity() {
    lateinit var binding: ActivityTableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tableBackIv.setOnClickListener {
            finish()
        }
    }
}