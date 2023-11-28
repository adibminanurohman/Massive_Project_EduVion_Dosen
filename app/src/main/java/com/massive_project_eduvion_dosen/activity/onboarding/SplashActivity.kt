package com.massive_project_eduvion_dosen.activity.onboarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.massive_project_eduvion_dosen.MainActivity
import com.massive_project_eduvion_dosen.R

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH: Long = 3000 // Tampilkan splash screen selama 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler untuk mengatur delay dan berpindah ke MainActivity setelah waktu yang ditentukan
        Handler().postDelayed({
            val mainIntent = Intent(this@SplashActivity, OnBoarding1Activity::class.java)
            startActivity(mainIntent)
            finish() // Menutup SplashActivity agar tidak kembali saat tombol back ditekan
        }, SPLASH_DISPLAY_LENGTH)
    }
}
