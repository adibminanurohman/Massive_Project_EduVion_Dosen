package com.massive_project_eduvion_dosen.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToBarcode1(view: View) {
        val intent = Intent(this, Barcode1Activity::class.java)
        startActivity(intent)
    }
    fun navigateLoginToLoadingScreen(view: View) {
        val intent = Intent(this, LoadingScreenActivity::class.java)
        startActivity(intent)
    }
}