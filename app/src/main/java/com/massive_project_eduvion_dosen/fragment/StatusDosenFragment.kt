package com.massive_project_eduvion_dosen.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.activity.CalenderActivity
import com.massive_project_eduvion_dosen.databinding.FragmentStatusDosenBinding

class StatusDosenFragment : Fragment() {
    private lateinit var binding: FragmentStatusDosenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentStatusDosenBinding.inflate(inflater, container, false)
        requireActivity().apply {
            title = "status"
        }
        binding.imageButton9.setOnClickListener {
            navigateToKalenderAkademik()
        }
        // Inflate the layout for this fragment
        return binding.root
    }
    private fun navigateToKalenderAkademik(){
        val intent = Intent(requireContext(), CalenderActivity::class.java)
        startActivity(intent)
    }
}