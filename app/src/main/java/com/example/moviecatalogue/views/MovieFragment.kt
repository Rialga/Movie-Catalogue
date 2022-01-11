package com.example.moviecatalogue.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviecatalogue.adapters.MovieAdapter
import com.example.moviecatalogue.databinding.FragmentMovieBinding
import com.example.moviecatalogue.viewmodels.MainViewModel

class MovieFragment : Fragment() {
    private lateinit var fragmentMovieBinding: FragmentMovieBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {

        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val movieData = mainViewModel.getMovieData()


        movieData.observe(this) { list ->

            fragmentMovieBinding.rvMovie.layoutManager = LinearLayoutManager(context)
            val adapter = MovieAdapter(list)
            fragmentMovieBinding.rvMovie.adapter = adapter
        }

    }


}