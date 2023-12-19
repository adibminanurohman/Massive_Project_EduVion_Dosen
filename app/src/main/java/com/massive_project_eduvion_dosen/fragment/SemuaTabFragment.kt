package com.massive_project_eduvion_dosen.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.activity.EJurnalActivity
import com.massive_project_eduvion_dosen.activity.KonsultasiDosen2Activity
import com.massive_project_eduvion_dosen.activity.KonsultasiDosen3Activity
import com.massive_project_eduvion_dosen.databinding.FragmentSemuaTabBinding

class SemuaTabFragment : Fragment() {
    private lateinit var binding: FragmentSemuaTabBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSemuaTabBinding.inflate(inflater, container, false)
        requireActivity().apply {
            title = "tab"
        }
        binding.imageButton18.setOnClickListener {
            navigateKonsultasiDosen2Fragment()
        }
        binding.imageButton21.setOnClickListener {
            navigateKonsultasiDosen3Fragment()
        }
        return binding.root
    }

    private fun navigateKonsultasiDosen2Fragment() {
        val intent = Intent(requireContext(), KonsultasiDosen2Activity::class.java)
        startActivity(intent)
    }
    private fun navigateKonsultasiDosen3Fragment() {
        val intent = Intent(requireContext(), KonsultasiDosen3Activity::class.java)
        startActivity(intent)
    }
}
