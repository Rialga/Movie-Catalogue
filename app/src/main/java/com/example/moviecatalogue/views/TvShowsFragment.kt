package com.example.moviecatalogue.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.moviecatalogue.databinding.FragmentTvShowsBinding
import com.example.moviecatalogue.viewmodels.MainViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviecatalogue.adapters.MovieAdapter


class TvShowsFragment : Fragment() {


    private lateinit var fragmentTvShowBinding: FragmentTvShowsBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {

        fragmentTvShowBinding = FragmentTvShowsBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        val movieData = mainViewModel.getTvShowData()

        fragmentTvShowBinding.rvTvShow.layoutManager = LinearLayoutManager(context)
        val adapter = MovieAdapter(movieData)
        fragmentTvShowBinding.rvTvShow.adapter = adapter
    }
}