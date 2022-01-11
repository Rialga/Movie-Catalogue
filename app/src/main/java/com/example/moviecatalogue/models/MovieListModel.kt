package com.example.moviecatalogue.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


data class MovieListModel(
    var results: ArrayList<Results>,
    var page: Int?,
) {
    @Parcelize
    data class Results(
        @SerializedName("id") var movieId: Int? = null,
        @SerializedName("name") var movieName: String? = null,
        @SerializedName("original_title") var movieTitle: String? = null,
        @SerializedName("overview") var movieDesc: String? = null,
        @SerializedName("vote_average") var movieRate: Double? = null,
        @SerializedName("poster_path") var moviePoster: String? = null,
    ) : Parcelable
}

