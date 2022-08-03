package com.example.sesac_week1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sesac_week1.databinding.ActivityConstraintBinding
class ConstraintActivity : AppCompatActivity() {
    lateinit var binding: ActivityConstraintBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstraintBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.constraintBackIv.setOnClickListener {
            finish()
        }
    }
}