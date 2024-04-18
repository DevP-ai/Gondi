package com.compose.android.dev.edu.iiitnr.gondi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.compose.android.dev.edu.iiitnr.gondi.Alphabet
import com.compose.android.dev.edu.iiitnr.gondi.AlphabetAdapter
import com.compose.android.dev.edu.iiitnr.gondi.R
import com.compose.android.dev.edu.iiitnr.gondi.databinding.FragmentAlphabetBinding

class AlphabetFragment : Fragment() {

    private lateinit var binding: FragmentAlphabetBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AlphabetAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlphabetBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.alpha_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val dataList = listOf(
            Alphabet(R.drawable.o, "अ", "A", "অ"),
            Alphabet(R.drawable.aa, "आ", "Aa", "আ"),
            Alphabet(R.drawable.e, "इ", "e", "ই"),
            Alphabet(R.drawable.re, "ई", "E", "ঈ"),
            Alphabet(R.drawable.u, "उ", "u", "উ"),
            Alphabet(R.drawable.oo, "ऊ", "oo", "ঊ"),
            Alphabet(R.drawable.ee, "ए", "e", "এ"),
            Alphabet(R.drawable.ai, "ऐ", "Ai", "ঐ"),
            Alphabet(R.drawable.ao, "ओ", "O", "ও"),
            Alphabet(R.drawable.um, "अं", "um", "ঔ"),
            Alphabet(R.drawable.aha, "अः", "aha", ""),
            Alphabet(R.drawable.aha, "अः", "aha", ""),
            Alphabet(R.drawable.aha, "अः", "aha", "")
        )
        adapter = AlphabetAdapter(requireContext(), dataList)
        recyclerView.adapter = adapter
    }

}