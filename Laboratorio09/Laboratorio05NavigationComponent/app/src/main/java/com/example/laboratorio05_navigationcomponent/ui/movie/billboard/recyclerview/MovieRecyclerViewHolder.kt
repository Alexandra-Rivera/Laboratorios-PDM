package com.example.laboratorio05_navigationcomponent.ui.movie.billboard.recyclerview
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.databinding.MovieItemBinding


//EL viewholder construye las vistas
class MovieRecyclerViewHolder(private var binding: MovieItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieItemCardView.setOnClickListener{
            clickListener(movie)
        }
    }
}