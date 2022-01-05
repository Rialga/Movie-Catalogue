package com.example.moviecatalogue.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.moviecatalogue.databinding.ActivityDetailFilmBinding
import com.example.moviecatalogue.models.MovieListModel
import com.example.moviecatalogue.viewmodels.DetailViewModel



class DetailFilmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailFilmBinding
    private lateinit var detailViewModel: DetailViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentData = intent.getParcelableExtra<MovieListModel>(EXTRA_USER) as MovieListModel

        detailViewModel = ViewModelProvider(this)[DetailViewModel::class.java]

        detailViewModel.getMovieId(intentData.id.toString())

        val data = detailViewModel.getMovieDetail()

        with(binding){
            Glide.with(this@DetailFilmActivity)
                .load(data.moviePoster)
                .into(ivPoster)
            ivPoster.contentDescription = data.moviePoster
            tvTitle.text = data.movieName
            tvRating.text = data.movieRate
            tvGenre.text = data.movieGenre
            tvDesc.text = data.movieDesc

            Log.d("HOHOHO" , ivPoster.contentDescription.toString() )
        }
    }


    companion object {
        const val EXTRA_USER = "extra_user"
    }
}