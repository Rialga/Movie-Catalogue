package com.example.moviecatalogue.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.moviecatalogue.datadummies.DataDummy
import com.example.moviecatalogue.repositories.MovieRepository
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

import org.junit.Test
import org.mockito.Mock

class DetailViewModelTest {
    private lateinit var viewModel: DetailViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
//        viewModel.getMovieId(movieId.toString())
    }


    @Test
    fun getMovieDetail() {
//        viewModel.getMovieId(dummyCourse.id.toString())
//        val movieDetail = viewModel.getMovieDetail()
//        assertNotNull(movieDetail)
//        assertEquals(dummyCourse.id, movieDetail.id)
//        assertEquals(dummyCourse.moviePoster, movieDetail.moviePoster)
//        assertEquals(dummyCourse.movieGenre, movieDetail.movieGenre)
//        assertEquals(dummyCourse.movieRate, movieDetail.movieRate)
//        assertEquals(dummyCourse.movieType, movieDetail.movieType)
    }
}