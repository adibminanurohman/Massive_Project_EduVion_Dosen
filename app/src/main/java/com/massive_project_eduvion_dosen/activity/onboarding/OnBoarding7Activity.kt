package com.massive_project_eduvion_dosen.activity.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.activity.LoginActivity
import com.massive_project_eduvion_dosen.databinding.ActivityOnBoarding7Binding

class OnBoarding7Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding7Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun navigateToLogin(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding5(view: View) {
        val intent = Intent(this, OnBoarding5Activity::class.java)
        startActivity(intent)
    }
}