package com.example.moviecatalogue.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class MovieDetailModel(
    @SerializedName("id") var movieId: Int? = null,
    @SerializedName("title") var movieName: String? = null,
    @SerializedName("name") var movieTitle: String? = null,
    @SerializedName("overview") var movieDesc: String? = null,
    @SerializedName("vote_average") var movieRate: Double? = null,
    @SerializedName("poster_path") var moviePoster: String? = null,
    var genres: ArrayList<Genres> = arrayListOf(),
)
{
    data class Genres (
        var name : String?,
    )
}
