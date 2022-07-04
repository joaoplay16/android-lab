package com.playlab.androidlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.playlab.androidlab.databinding.FragmentABinding
import com.playlab.androidlab.model.User


class FragmentA : Fragment() {
    lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentABinding.inflate(inflater, container, false)

        binding.sendBtn.setOnClickListener {
            val firstName = binding.edtFirstName.text.toString()
            val lastName = binding.edtLastName.text.toString()

            val user = User(firstName, lastName)

            val action = FragmentADirections.actionFragmentAToFragmentB(user)
            findNavController().navigate(action)
        }

        return binding.root
    }

}