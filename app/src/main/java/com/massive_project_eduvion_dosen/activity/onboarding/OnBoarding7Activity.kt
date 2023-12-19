package com.massive_project_eduvion_dosen.activity.onboarding

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.activity.LoginActivity
import com.massive_project_eduvion_dosen.databinding.ActivityOnBoarding7Binding

class OnBoarding7Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinner: Spinner = findViewById(R.id.spinner)
        val items = resources.getStringArray(R.array.item_array)
        val adapter = object : ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            items
        ) {
            override fun isEnabled(position: Int): Boolean {
                return position != 0
            }

            override fun getDropDownView(
                position: Int,
                convertView: View?,
                parent: ViewGroup
            ): View {
                val view = super.getDropDownView(position, convertView, parent)
                if (position == 0) {
                    (view as TextView).setTextColor(Color.GRAY)
                } else {
                    (view as TextView).setTextColor(Color.BLACK)
                }
                return view
            }
        }

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
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