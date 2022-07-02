package com.playlab.androidlab.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.playlab.androidlab.MainActivity
import com.playlab.androidlab.R
import com.playlab.androidlab.databinding.FragmentSplashBinding
import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext


class SplashFragment : Fragment() {

    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater, container, false)

//        Handler().postDelayed({
//            if(onBoardingFinished()){
//                startActivity(Intent(activity, MainActivity::class.java))
//            }else{
//                findNavController().navigate(R.id.action_splashFragment2_to_viewPagerFragment)
//            }
//        }, 3000)

        val scope = CoroutineScope(Dispatchers.Main)
        scope.launch {
            delay(3000)
            if(onBoardingFinished()){
                startActivity(Intent(activity, MainActivity::class.java))
                activity?.finish()
            }else{
                findNavController().navigate(R.id.action_splashFragment2_to_viewPagerFragment)
            }
        }

        return binding.root
    }

    private fun onBoardingFinished() : Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)

        return sharedPref.getBoolean("Finished", false)
    }
}