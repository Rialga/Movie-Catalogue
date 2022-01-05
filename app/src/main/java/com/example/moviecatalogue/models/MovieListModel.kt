package com.example.moviecatalogue.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class MovieListModel (
        val id :String?,
        val movieName : String?,
        val movieDesc : String?,
        val moviePoster : String?,
        val movieRate : String?,
        val movieGenre : String?,
        val movieType : String?

) : Parcelable