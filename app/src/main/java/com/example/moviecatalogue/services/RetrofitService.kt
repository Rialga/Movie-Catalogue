package com.example.moviecatalogue.services

import com.example.moviecatalogue.models.MovieDetailModel
import com.example.moviecatalogue.models.MovieListModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {


    @GET("movie/popular")
    fun getMovie( @Query("api_key") api_key: String) : Call<MovieListModel>

    @GET("movie/{movieId}")
    fun getMovieDetail(@Path("movieId") movieId: Int? , @Query("api_key") api_key: String): Call<MovieDetailModel>

    @GET("tv/popular")
    fun getTvShow( @Query("api_key") api_key: String) : Call<MovieListModel>

    @GET("tv/{movieId}")
    fun getTvShowDetail(@Path("movieId") movieId: Int , @Query("api_key") api_key: String): Call<MovieDetailModel>


    companion object {
        var retrofitService: RetrofitService? = null

        fun getInstance() : RetrofitService {

            if (retrofitService == null) {

                val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.themoviedb.org/3/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(RetrofitService::class.java)
            }
            return retrofitService!!
        }
    }

}