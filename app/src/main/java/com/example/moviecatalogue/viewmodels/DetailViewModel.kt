package com.example.moviecatalogue.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.models.MovieDetailModel
import com.example.moviecatalogue.repositories.MovieRepository

class DetailViewModel : ViewModel() {
    private var movieId: Int = 0
    private val movieRepository: MovieRepository = MovieRepository()


    fun getMovieId(movieId: Int) {
        this.movieId = movieId
    }

    fun getMovieDetail(typeMovie : String): LiveData<ArrayList<MovieDetailModel>>
    {
        return if(typeMovie == "Movie"){
            movieRepository.getMovieDetail(movieId)
        } else{
            movieRepository.getTvShowDetail(movieId)

        }
    }
}