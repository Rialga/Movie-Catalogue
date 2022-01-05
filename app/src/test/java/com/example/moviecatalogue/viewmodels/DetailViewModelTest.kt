package com.example.moviecatalogue.viewmodels

import com.example.moviecatalogue.datadummies.DataDummy
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel
    private val dummyCourse = DataDummy.generateDummyMovies()[0]
    private val movieId = dummyCourse.id
    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.getMovieId(movieId.toString())
    }


    @Test
    fun getMovieDetail() {
        viewModel.getMovieId(dummyCourse.id.toString())
        val movieDetail = viewModel.getMovieDetail()
        assertNotNull(movieDetail)
        assertEquals(dummyCourse.id, movieDetail.id)
        assertEquals(dummyCourse.moviePoster, movieDetail.moviePoster)
        assertEquals(dummyCourse.movieGenre, movieDetail.movieGenre)
        assertEquals(dummyCourse.movieRate, movieDetail.movieRate)
        assertEquals(dummyCourse.movieType, movieDetail.movieType)
    }
}