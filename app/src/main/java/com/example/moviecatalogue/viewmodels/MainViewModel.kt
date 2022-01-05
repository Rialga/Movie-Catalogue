package com.example.moviecatalogue.viewmodels

import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.datadummies.DataDummy
import com.example.moviecatalogue.models.MovieListModel

class MainViewModel :ViewModel() {

    private fun getData(): List<MovieListModel> = DataDummy.generateDummyMovies()

    fun getMovieData() : ArrayList<MovieListModel> {
        val movie = ArrayList<MovieListModel>()
        val allMovie = getData()
        for(movieDetail in allMovie){
            if(movieDetail.movieType == "movie") {
                movie.add(movieDetail)
            }
        }
        return movie
    }


    fun getTvShowData() : ArrayList<MovieListModel> {
        val tvshow = ArrayList<MovieListModel>()
        val allMovie = getData()
        for(movieDetail in allMovie){
            if(movieDetail.movieType == "tvshow") {
                tvshow.add(movieDetail)
            }
        }
        return tvshow
    }
}