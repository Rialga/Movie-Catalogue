package com.example.moviecatalogue.viewmodels

import android.util.Log
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
        assertEquals(20, movieData.value?.size)
    }

    @Test
    fun getTvShowData() {
        val tvShowData = viewModel.getTvShowData()
        assertNotNull(tvShowData)
        assertEquals(20, tvShowData.value?.size)
    }
}