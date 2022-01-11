package com.example.moviecatalogue.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.moviecatalogue.adapters.MovieAdapter
import com.example.moviecatalogue.databinding.ActivityDetailFilmBinding
import com.example.moviecatalogue.models.MovieDetailModel
import com.example.moviecatalogue.models.MovieListModel
import com.example.moviecatalogue.viewmodels.DetailViewModel
import kotlin.Array as Array1


class DetailFilmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailFilmBinding
    private lateinit var detailViewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentData = intent.getParcelableExtra<MovieListModel.Results>(EXTRA_USER) as MovieListModel.Results

        detailViewModel = ViewModelProvider(this)[DetailViewModel::class.java]
        detailViewModel.getMovieId(intentData.movieId!!)

        val typeMovie = if(intentData.movieTitle != null) "Movie" else "TvShow"

        val data  = detailViewModel.getMovieDetail(typeMovie)

        data.observe(this){ detailData->
            val movieDetail = detailData[0]
            val movieTitleName = if(movieDetail.movieTitle != null) movieDetail.movieTitle!! else movieDetail.movieName!!
            with(binding){
                Glide.with(this@DetailFilmActivity)
                    .load("https://image.tmdb.org/t/p/w300"+movieDetail.moviePoster)
                    .into(ivPoster)
                ivPoster.contentDescription = movieDetail.moviePoster
                tvTitle.text = movieTitleName
                tvRating.text = movieDetail.movieRate.toString()
                tvDesc.text = movieDetail.movieDesc

                val genre = ArrayList<String>()
                movieDetail.genres.forEach { genres ->
                    genre.add(genres.name.toString())
                }

                tvGenre.text = genre.joinToString(separator = ", ")

            }
        }


    }


    companion object {
        const val EXTRA_USER = "extra_user"
    }
}

