package com.example.threadexchange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.threadexchange.databinding.FragmentNegroBinding
class FragmentNegro : Fragment() {

    private var _binding: FragmentNegroBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNegroBinding.inflate(inflater,container,false)
        val root: View = binding.root

        binding.button4.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_menuFragment)
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding= null
    }
    private fun closeFragment(){
        requireActivity().supportFragmentManager.popBackStack()
    }
}