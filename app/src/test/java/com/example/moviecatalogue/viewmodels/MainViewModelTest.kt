package com.example.moviecatalogue.viewmodels

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class MainViewModelTest {
    private lateinit var viewModel: MainViewModel
    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun getMovieData() {
        val movieData = viewModel.getMovieData()
        assertNotNull(movieData)
        assertEquals(10, movieData.size)
    }

    @Test
    fun getTvShowData() {
        val tvShowData = viewModel.getTvShowData()
        assertNotNull(tvShowData)
        assertEquals(10, tvShowData.size)
    }
}