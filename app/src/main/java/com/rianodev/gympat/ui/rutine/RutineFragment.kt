package com.rianodev.gympat.ui.rutine

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.rianodev.gympat.databinding.FragmentRutineBinding
import com.rianodev.gympat.ui.rutine.adapter.RutineAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RutineFragment : Fragment() {

    private val rutineViewModel by viewModels<RutineViewModel>()
    private lateinit var rutineAdapter: RutineAdapter

    private var _binding: FragmentRutineBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRutineBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI(){
        initList()
        initUIState()

    }

    private fun initList() {
        rutineAdapter = RutineAdapter()
        binding.rvRutine.apply {
            layoutManager = GridLayoutManager(context,1)
            adapter = rutineAdapter
        }

    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                rutineViewModel.rutine.collect{
                    rutineAdapter.updateList(it)
                }
            }
        }
    }

}