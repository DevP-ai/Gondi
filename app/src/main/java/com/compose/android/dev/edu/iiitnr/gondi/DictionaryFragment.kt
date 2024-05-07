package com.compose.android.dev.edu.iiitnr.gondi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.compose.android.dev.edu.iiitnr.gondi.adapter.DictAdapter
import com.compose.android.dev.edu.iiitnr.gondi.databinding.FragmentDictionaryBinding
import com.compose.android.dev.edu.iiitnr.gondi.viewmodel.DictViewModelFactory
import com.compose.android.dev.edu.iiitnr.gondi.viewmodel.DictViewmodel

class DictionaryFragment : Fragment() {
    private lateinit var binding: FragmentDictionaryBinding
    private lateinit var dictAdapter:DictAdapter

    private val viewModel: DictViewmodel by viewModels {
        DictViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDictionaryBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment

        binding.dictRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        dictAdapter = DictAdapter()
        binding.dictRecyclerView.adapter = dictAdapter

        viewModel.getDict().observe(viewLifecycleOwner, Observer { list ->
            dictAdapter.submitList(list)
        })

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}