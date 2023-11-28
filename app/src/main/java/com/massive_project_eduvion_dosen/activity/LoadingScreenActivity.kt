package com.massive_project_eduvion_dosen.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_dosen.MainActivity
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.databinding.ActivityLoadingScreenBinding

class LoadingScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoadingScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun navigateToMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}