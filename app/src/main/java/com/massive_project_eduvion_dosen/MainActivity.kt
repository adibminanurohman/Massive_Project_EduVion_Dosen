package com.massive_project_eduvion_dosen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.massive_project_eduvion_dosen.fragment.ChatDosenFragment
import com.massive_project_eduvion_dosen.fragment.HomeDosenFragment
import com.massive_project_eduvion_dosen.fragment.KonsultasiDosenFragment
import com.massive_project_eduvion_dosen.fragment.StatusDosenFragment

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val fragment = HomeDosenFragment() // Ganti dengan nama fragment HomeMahasiswa
                    openFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_konsultasi -> {
                    val fragment = KonsultasiDosenFragment() // Ganti dengan nama fragment KonsultasiMahasiswa
                    openFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_status -> {
                    val fragment = StatusDosenFragment() // Ganti dengan nama fragment StatusMahasiswa
                    openFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_chat -> {
                    val fragment = ChatDosenFragment() // Ganti dengan nama fragment ChatMahasiswa
                    openFragment(fragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        // Menampilkan fragment default saat pertama kali aplikasi dibuka (misalnya, fragment HomeMahasiswa)
        val defaultFragment = HomeDosenFragment() // Ganti dengan nama fragment default yang diinginkan
        openFragment(defaultFragment)
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment) // Ganti dengan ID container untuk fragment Anda
            .commit()
    }
}
