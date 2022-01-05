package com.example.moviecatalogue.viewmodels

import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.datadummies.DataDummy
import com.example.moviecatalogue.models.MovieListModel

class DetailViewModel : ViewModel() {
    private lateinit var movieId: String

    fun getMovieId(movieId: String) {
        this.movieId = movieId
    }

    fun getMovieDetail() : MovieListModel{
        lateinit var movie: MovieListModel
        val movieModel = DataDummy.generateDummyMovies()
        for(movieDetail in movieModel){
            if(movieDetail.id == movieId) {
                movie = movieDetail
            }
        }

        return movie
    }
}