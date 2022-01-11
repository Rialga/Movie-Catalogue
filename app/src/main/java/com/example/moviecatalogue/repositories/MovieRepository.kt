package com.example.moviecatalogue.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moviecatalogue.models.MovieDetailModel
import com.example.moviecatalogue.models.MovieListModel
import com.example.moviecatalogue.services.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MovieRepository {
    private val retrofitService = RetrofitService
    private val apiKey : String = "945a0ba2b64c0863b619dabfa865fd42"

    fun getMovieList() : LiveData<ArrayList<MovieListModel.Results>>{

        val movieList = MutableLiveData<ArrayList<MovieListModel.Results>>()
        val responseMovie =retrofitService.getInstance().getMovie(apiKey)

        responseMovie.enqueue(object : Callback<MovieListModel>{
            override fun onResponse( call: Call<MovieListModel>, response: Response<MovieListModel>) {
                if (response.isSuccessful) {
                    movieList.postValue(response.body()?.results)
                } else {
                    Log.d("Error Response", response.errorBody().toString() + "error ini")
                }
            }

            override fun onFailure(call: Call<MovieListModel>, t: Throwable) {
                Log.d("err vm ", t.message.toString())
            }

        })

        return movieList
    }

    fun getTvShowList() : LiveData<ArrayList<MovieListModel.Results>>{

        val tvShowList = MutableLiveData<ArrayList<MovieListModel.Results>>()
        val responseMovie =retrofitService.getInstance().getTvShow(apiKey)

        responseMovie.enqueue(object : Callback<MovieListModel>{
            override fun onResponse( call: Call<MovieListModel>, response: Response<MovieListModel>) {
                if (response.isSuccessful) {
                    tvShowList.postValue(response.body()?.results)
                } else {
                    Log.d("Error Response", response.errorBody().toString() + "error ini")
                }
            }

            override fun onFailure(call: Call<MovieListModel>, t: Throwable) {
                Log.d("err vm ", t.message.toString())
            }

        })

        return tvShowList
    }

    fun getMovieDetail(movieId : Int): LiveData<ArrayList<MovieDetailModel>> {
        val movieDetail = MutableLiveData<ArrayList<MovieDetailModel>>()
        val detail = ArrayList<MovieDetailModel>()

        val response = retrofitService.getInstance().getMovieDetail(movieId,apiKey)

        response.enqueue(object : Callback<MovieDetailModel>{
            override fun onResponse(
                call: Call<MovieDetailModel>,
                response: Response<MovieDetailModel>
            ) {
                response.body()?.let { detail.add(it) }
                movieDetail.postValue(detail)
            }

            override fun onFailure(call: Call<MovieDetailModel>, t: Throwable) {
                Log.d("Error Response", t.message + "error ini")
            }
        })

        return movieDetail
    }


    fun getTvShowDetail(movieId : Int): LiveData<ArrayList<MovieDetailModel>> {
        val tvShowDetail = MutableLiveData<ArrayList<MovieDetailModel>>()
        val detail = ArrayList<MovieDetailModel>()

        val response = retrofitService.getInstance().getTvShowDetail(movieId,apiKey)

        response.enqueue(object : Callback<MovieDetailModel>{
            override fun onResponse(
                call: Call<MovieDetailModel>,
                response: Response<MovieDetailModel>
            ) {
                response.body()?.let { detail.add(it) }
                tvShowDetail.postValue(detail)
            }

            override fun onFailure(call: Call<MovieDetailModel>, t: Throwable) {
                Log.d("Error Response", t.message + "error ini")
            }
        })

        return tvShowDetail
    }

}




