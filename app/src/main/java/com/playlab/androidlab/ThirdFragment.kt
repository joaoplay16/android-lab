package com.playlab.androidlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.playlab.androidlab.databinding.FragmentFirstBinding
import com.playlab.androidlab.databinding.FragmentSecondBinding
import com.playlab.androidlab.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        binding.textView.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }

        binding.buttonPrevTf.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }
        binding.buttonNextTf.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_fragmentA)
        }
        return binding.root
    }

}