package com.example.threadexchange

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.threadexchange.databinding.FragmentBlancoBinding


class FragmentBlanco : Fragment() {


   private var _binding : FragmentBlancoBinding? = null
    private val binding get() = _binding!!
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     _binding = FragmentBlancoBinding.inflate(inflater,container,false)

        return binding.root
    }
}
