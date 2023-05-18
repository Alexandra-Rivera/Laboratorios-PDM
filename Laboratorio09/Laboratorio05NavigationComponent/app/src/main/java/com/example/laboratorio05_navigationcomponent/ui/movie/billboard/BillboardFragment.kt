package com.example.laboratorio05_navigationcomponent.ui.movie.billboard

import android.content.AbstractThreadedSyncAdapter
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laboratorio05_navigationcomponent.R
import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.databinding.FragmentFirstBinding
import com.example.laboratorio05_navigationcomponent.ui.movie.billboard.recyclerview.MovieRecyclerViewAdapter
import com.example.laboratorio05_navigationcomponent.ui.movie.viewmodel.MovieViewModel

class BillboardFragment : Fragment() {
    private val movieViewModel: MovieViewModel by activityViewModels{
        MovieViewModel.Factory
    }
    private lateinit var adapter: MovieRecyclerViewAdapter
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView(view)

        binding.buttonFirstFragment.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment2_to_secondFragment)
        }
    }

    private fun showSelectedItem(movie: MovieModel){
        movieViewModel.setSelectedMovie(movie)
        findNavController().navigate(R.id.action_firstFragment2_to_thirdFragment2)
    }

    private fun displayMovies() {
        adapter.setData(movieViewModel.getMovies())
        adapter.notifyDataSetChanged()
    }

    private fun setRecyclerView(view: View) {
      binding.recyclerView.layoutManager = LinearLayoutManager(view.context)
        adapter = MovieRecyclerViewAdapter { selectedMovie ->
            showSelectedItem(selectedMovie)
        }

        binding.recyclerView.adapter = adapter
        displayMovies()
    }
}