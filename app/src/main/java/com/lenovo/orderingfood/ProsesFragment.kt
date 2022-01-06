package com.lenovo.orderingfood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lenovo.orderingfood.databinding.FragmentProsesBinding

class ProsesFragment : Fragment() {
    private lateinit var _binding: FragmentProsesBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProsesBinding.inflate(layoutInflater)
        return binding.root
        //return inflater.inflate(R.layout.fragment_proses, container, false)
    }

}