package com.massive_project_eduvion_dosen.fragment

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.adapter.PagerKonsultasiAdapter

class KonsultasiDosenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_konsultasi_dosen, container, false)

        val tabLayout: TabLayout = view.findViewById(R.id.tabLayout)
        val viewPager: ViewPager = view.findViewById(R.id.viewPager)

        val pagerAdapter = PagerKonsultasiAdapter(childFragmentManager) // Ganti dengan nama adapter Anda
        viewPager.adapter = pagerAdapter

        tabLayout.setupWithViewPager(viewPager)

        return view
    }
}
