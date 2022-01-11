package com.example.moviecatalogue.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.datadummies.DataDummy
import com.example.moviecatalogue.models.MovieListModel
import com.example.moviecatalogue.repositories.MovieRepository

class MainViewModel :ViewModel() {
    private val movieRepository: MovieRepository = MovieRepository()

    fun getMovieData() : LiveData<ArrayList<MovieListModel.Results>> = movieRepository.getMovieList()

    fun getTvShowData() : LiveData<ArrayList<MovieListModel.Results>> = movieRepository.getTvShowList()


}