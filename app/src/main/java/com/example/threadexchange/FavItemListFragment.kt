package com.example.threadexchange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.threadexchange.databinding.FragmentFavItemListBinding


class FavItemListFragment : Fragment() {
    private var _binding: FragmentFavItemListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavItemListBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.btnMenu.setOnClickListener {
            findNavController().navigate(R.id.action_favItemListFragment2_to_recyclerFragment)
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}