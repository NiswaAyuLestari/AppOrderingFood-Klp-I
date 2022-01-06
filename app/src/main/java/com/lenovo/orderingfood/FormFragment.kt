package com.lenovo.orderingfood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lenovo.orderingfood.databinding.FragmentFormBinding
import com.lenovo.orderingfood.databinding.FragmentProsesBinding


class FormFragment : Fragment() {
    private lateinit var _binding: FragmentFormBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFormBinding.inflate(inflater)
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nav = findNavController()

        binding.apply {
            submit.setOnClickListener {
                nav.navigate(R.id.action_formFragment_to_prosesFragment)
            }

        }
    }


}