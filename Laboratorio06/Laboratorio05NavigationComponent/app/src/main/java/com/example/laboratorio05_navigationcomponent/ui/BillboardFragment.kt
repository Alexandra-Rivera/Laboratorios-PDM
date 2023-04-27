package com.example.laboratorio05_navigationcomponent.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.laboratorio05_navigationcomponent.R

/**
 * A simple [Fragment] subclass.
 * Use the [BillboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BillboardFragment : Fragment() {

    private lateinit var buttonFirstFragment: Button
    private lateinit var cardViewElement: CardView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        buttonFirstFragment.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment2_to_secondFragment)
        }

        cardViewElement.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment2_to_thirdFragment2)
        }
    }

    private fun bind() {
        buttonFirstFragment = view?.findViewById(R.id.buttonFirstFragment) as Button
        cardViewElement = view?.findViewById(R.id.card1) as CardView
    }
}