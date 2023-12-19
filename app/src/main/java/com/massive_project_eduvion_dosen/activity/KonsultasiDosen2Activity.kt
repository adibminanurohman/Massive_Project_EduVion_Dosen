package com.massive_project_eduvion_dosen.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.massive_project_eduvion_dosen.R

class KonsultasiDosen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsultasi_dosen2)

        val buttonTerima: ImageButton = findViewById(R.id.imageButton15)

        buttonTerima.setOnClickListener {
            val intent = Intent(this, KonsultasiDosen3Activity::class.java)
            startActivity(intent)
        }
    }
}