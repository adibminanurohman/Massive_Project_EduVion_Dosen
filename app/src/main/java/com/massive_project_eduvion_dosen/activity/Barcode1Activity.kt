package com.massive_project_eduvion_dosen.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.databinding.ActivityBarcode1Binding

class Barcode1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityBarcode1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarcode1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToBarcode2(view: View) {
        val intent = Intent(this, Barcode2Activity::class.java)
        startActivity(intent)
    }
}