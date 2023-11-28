package com.massive_project_eduvion_dosen.activity.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.databinding.ActivityOnBoarding1Binding

class OnBoarding1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoarding1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun navigateToOnBoarding2(view: View){
        val intent = Intent(this, OnBoarding2Activity::class.java)
        startActivity(intent)
    }
}