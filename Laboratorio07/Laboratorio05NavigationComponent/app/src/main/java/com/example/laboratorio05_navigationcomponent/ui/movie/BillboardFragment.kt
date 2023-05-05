package com.example.laboratorio05_navigationcomponent.ui.movie

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.laboratorio05_navigationcomponent.R
import com.example.laboratorio05_navigationcomponent.databinding.FragmentFirstBinding

class BillboardFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
//    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFirstFragment.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment2_to_secondFragment)
        }
    }

}