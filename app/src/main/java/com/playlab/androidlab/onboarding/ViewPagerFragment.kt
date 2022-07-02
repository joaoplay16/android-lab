package com.playlab.androidlab.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.playlab.androidlab.R
import com.playlab.androidlab.databinding.FragmentViewpagerBinding
import com.playlab.androidlab.onboarding.screens.FirstScreen
import com.playlab.androidlab.onboarding.screens.SecondScreen
import com.playlab.androidlab.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    lateinit var binding: FragmentViewpagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewpagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return binding.root
    }


}