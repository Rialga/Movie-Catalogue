package com.example.moviecatalogue.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviecatalogue.views.MainActivity
import com.example.moviecatalogue.views.MovieFragment
import com.example.moviecatalogue.views.TvShowsFragment

class SectionsPagerAdapter(activity: MainActivity) :  FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return  2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MovieFragment()
            1 -> fragment = TvShowsFragment()
        }
        return fragment as Fragment
    }
}