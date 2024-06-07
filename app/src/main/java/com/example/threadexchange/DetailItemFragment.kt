package com.example.threadexchange

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.threadexchange.databinding.FragmentDetailItemBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class DetailItemFragment : Fragment() {
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

                findNavController().navigate(R.id.action_detailItemFragment_to_recyclerFragment2)
            }
            binding.tvEquipoName.text=Ropa.Nombre
            binding.tvEquipoLiga.text=Ropa.Marca
            binding.tvEquipoEstadio.text=Ropa.Talla
            Glide.with(binding.ivEquipo.context).load(Ropa.foto).into(binding.ivEquipo)
        }
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializar el botón flotante "Agregar comentario"
        val fabAgregarComentario = view.findViewById<FloatingActionButton>(R.id.fabAgregarComentario)

        // Configurar el clic del botón flotante
        fabAgregarComentario.setOnClickListener {
            // Crear un diálogo personalizado
            val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.dialog_comment)

            // Manejar el clic del botón dentro del diálogo
            dialog.findViewById<Button>(R.id.buttonEnviar)?.setOnClickListener {
                // Obtener el comentario del EditText
                val comment = dialog.findViewById<EditText>(R.id.editTextComment)?.text?.toString()

                // Realizar la acción deseada con el comentario, por ejemplo, mostrarlo en un Toast
                Toast.makeText(requireContext(), "Comentario: $comment", Toast.LENGTH_SHORT).show()

                // Cerrar el diálogo
                dialog.dismiss()
            }

            // Mostrar el diálogo
            dialog.show()
        }

    }


}