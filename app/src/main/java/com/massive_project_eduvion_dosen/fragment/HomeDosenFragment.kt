package com.massive_project_eduvion_dosen.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_dosen.activity.CalenderActivity
import com.massive_project_eduvion_dosen.activity.EJurnalActivity
import com.massive_project_eduvion_dosen.databinding.FragmentHomeDosenBinding

class HomeDosenFragment : Fragment() {
    private lateinit var binding: FragmentHomeDosenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentHomeDosenBinding.inflate(inflater, container, false)
        requireActivity().apply {
            title = "Home"
        }

        binding.imageButton5.setOnClickListener {
            navigateToEjurnalActivity()
        }
        binding.imageButton4.setOnClickListener {
            navigateToKalenderActivity()
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun navigateToEjurnalActivity() {
        val intent = Intent(requireContext(), EJurnalActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToKalenderActivity() {
        val intent = Intent(requireContext(), CalenderActivity::class.java)
        startActivity(intent)
    }
}