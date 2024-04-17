package com.example.threadexchange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.threadexchange.databinding.FragmentViewPagerBinding

class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding?= null

    private val binding get() = _binding!!


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }


}
