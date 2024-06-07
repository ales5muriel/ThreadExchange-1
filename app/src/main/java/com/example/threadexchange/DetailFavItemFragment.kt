package com.example.threadexchange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.threadexchange.databinding.FragmentDetailItemBinding
import com.bumptech.glide.Glide



class DetailFavItemFragment : Fragment() {
    private var _binding: FragmentDetailItemBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding=FragmentDetailItemBinding.inflate(inflater,container,false)
        val itemId = arguments?.getInt("itemId")
        val Ropa = RopaProvider.listRopa.find { it.id==itemId }
        if (Ropa!=null){
            binding.buttonVolv.setOnClickListener {

                findNavController().navigate(R.id.action_detailFavItemFragment_to_favItemListFragment2)
            }
            binding.tvEquipoName.text=Ropa.Nombre
            binding.tvEquipoLiga.text=Ropa.Marca
            binding.tvEquipoEstadio.text=Ropa.Tamano
            Glide.with(binding.ivEquipo.context).load(Ropa.foto).into(binding.ivEquipo)

        }



        return binding.root
    }

}