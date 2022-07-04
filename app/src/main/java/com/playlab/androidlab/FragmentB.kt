package com.playlab.androidlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.playlab.androidlab.databinding.FragmentABinding
import com.playlab.androidlab.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private val args by navArgs<FragmentBArgs>()

    lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        binding =  FragmentBBinding.inflate(inflater, container, false)

        binding.textView.text = "FirstName ${args.currentUser.firstName} LastName ${args.currentUser.lastName}"

        return binding.root
    }

}