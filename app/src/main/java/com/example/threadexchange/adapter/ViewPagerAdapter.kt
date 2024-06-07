package com.example.threadexchange.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.threadexchange.FragmentNegro
import com.example.threadexchange.FragmentBlanco


class ViewPagerAdapter(fa:FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int=2
    override fun createFragment(position: Int): Fragment{
        return when (position){
            0-> FragmentBlanco()
            1-> FragmentNegro()

            else -> throw IllegalArgumentException("Posicion invalida: $position")
        }
    }

    }


