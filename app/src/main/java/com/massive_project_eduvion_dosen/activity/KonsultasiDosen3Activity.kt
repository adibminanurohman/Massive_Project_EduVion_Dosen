package com.massive_project_eduvion_dosen.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.fragment.ChatDosenFragment

class KonsultasiDosen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsultasi_dosen3)

        val buttonReview: ImageButton = findViewById(R.id.imageButton15)
        val buttonJadwal: ImageButton = findViewById(R.id.imageButton14)

        buttonReview.setOnClickListener {
            val intent = Intent(this, KonsultasiDosen4Activity::class.java)
            startActivity(intent)
        }
        buttonJadwal.setOnClickListener {
            val intent = Intent(this, CalenderActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.imageButton13).setOnClickListener {
            navigateToChatDosenFragment()
        }
    }
    private fun navigateToChatDosenFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, ChatDosenFragment())
        transaction.addToBackStack(null) // Optional: Add transaction to back stack
        transaction.commit()
    }
}