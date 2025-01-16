package com.rianodev.gympat.ui.rutine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rianodev.gympat.databinding.FragmentRutineBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RutineFragment : Fragment() {


    private var _binding: FragmentRutineBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRutineBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}