package com.massive_project_eduvion_dosen.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton
import com.massive_project_eduvion_dosen.R

class EJurnalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejurnal)

        val buttonUnggah: ImageButton = findViewById(R.id.bt_unggah)

        buttonUnggah.setOnClickListener {
            val intent = Intent(this, UnggahEJurnalActivity::class.java)
            startActivity(intent)
        }
    }
}
