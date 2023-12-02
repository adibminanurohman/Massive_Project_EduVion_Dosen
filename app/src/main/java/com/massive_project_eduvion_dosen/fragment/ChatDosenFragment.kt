package com.massive_project_eduvion_dosen.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_dosen.R
import com.massive_project_eduvion_dosen.activity.PengaturanActivity
import com.massive_project_eduvion_dosen.activity.RoomChatActivity
import com.massive_project_eduvion_dosen.databinding.FragmentChatDosenBinding

class ChatDosenFragment : Fragment() {
    private lateinit var binding: FragmentChatDosenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatDosenBinding.inflate(inflater, container, false)
        requireActivity().apply {
            title = "chat"
        }
        binding.imageButton11.setOnClickListener {
            navigateToPengaturanActivity()
        }
        binding.imageView10.setOnClickListener {
            navigateToChatRoomActivity()
        }
        // Inflate the layout for this fragment
        return binding.root
    }
    private fun navigateToPengaturanActivity(){
        val intent = Intent(requireContext(), PengaturanActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToChatRoomActivity(){
        val intent = Intent(requireContext(), RoomChatActivity::class.java)
        startActivity(intent)
    }
}