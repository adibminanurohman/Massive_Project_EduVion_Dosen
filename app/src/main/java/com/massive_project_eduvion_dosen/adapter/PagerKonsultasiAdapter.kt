package com.massive_project_eduvion_dosen.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.massive_project_eduvion_dosen.fragment.PengajuanTabFragment
import com.massive_project_eduvion_dosen.fragment.SedangBerlangsungTabFragment
import com.massive_project_eduvion_dosen.fragment.SemuaTabFragment

class PagerKonsultasiAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        //jumlah tab
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> SemuaTabFragment()
            1 -> PengajuanTabFragment()
            2 -> SedangBerlangsungTabFragment()
            else -> SemuaTabFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // nama judul setiap tab
        return when(position){
            0 -> "Semua"
            1 -> "Pengajuan"
            2 -> "Sedang Berlangsung"
            else -> "Semua"
        }
    }

}