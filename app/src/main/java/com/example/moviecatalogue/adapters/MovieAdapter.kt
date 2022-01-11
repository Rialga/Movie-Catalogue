package com.example.moviecatalogue.adapters

import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviecatalogue.databinding.ItemMovieBinding
import com.example.moviecatalogue.models.MovieListModel
import com.example.moviecatalogue.views.DetailFilmActivity

class MovieAdapter(private val ListMovie: ArrayList<MovieListModel.Results>) : RecyclerView.Adapter<MovieAdapter.MovieListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        val binding = ItemMovieBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieListViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        val movie = ListMovie[position]

        val name = if(movie.movieTitle != null) movie.movieTitle!! else movie.movieName!!

        holder.binding.tvTitle.text = name
        holder.binding.tvRating.text = movie.movieRate.toString()
        holder.binding.tvDesc.text = movie.movieDesc

        Glide.with(holder.itemView.context)
            .load("https://image.tmdb.org/t/p/w200"+movie.moviePoster)
            .into(holder.binding.ivMovieImage)

        holder.itemView.setOnClickListener { v ->
            val intentDetail = Intent(v.context, DetailFilmActivity::class.java)
            intentDetail.putExtra(DetailFilmActivity.EXTRA_USER,movie)
            v.context.startActivity(intentDetail)
        }



    }

    override fun getItemCount(): Int {
        return ListMovie.size
    }

    inner class MovieListViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root)


}