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

            Alphabet(R.drawable.k, "क", "K", "ক"),

            Alphabet(R.drawable.kha, "ख", "Kh", "খ"),

            Alphabet(R.drawable.g, "ग", "G", "গ"),

            Alphabet(R.drawable.gh, "घ", "gh", "ঘ"),

            Alphabet(R.drawable.ng, "ङ", "ng", "ঙ"),

            Alphabet(R.drawable.ch, "च", "ch", "চ"),

            Alphabet(R.drawable.chh, "छ", "chh", "ছ"),

            Alphabet(R.drawable.j, "ज", "j", "জ"),

            Alphabet(R.drawable.jh, "झ", "Jh", "ঝ"),

            Alphabet(R.drawable.t, "ट", "T", "ট"),

            Alphabet(R.drawable.th, "ठ", "Th", "ঠ"),

            Alphabet(R.drawable.d, "ड", "D", "ড"),

            Alphabet(R.drawable.dh, "ढ", "Dh", "ঢ"),

            Alphabet(R.drawable.n, "ण", "N", "ণ"),

            Alphabet(R.drawable.tt, "त", "N", "ত"),

            Alphabet(R.drawable.tth, "थ", "N", "থ"),

            Alphabet(R.drawable.dd, "द", "D", "দ"),

            Alphabet(R.drawable.ddh, "ध", "Dh", "ধ"),

            Alphabet(R.drawable.nn, "न", "N", "ন"),

            Alphabet(R.drawable.p, "प", "P", "প"),

            Alphabet(R.drawable.ph, "फ", "Ph", "ফ"),

            Alphabet(R.drawable.b, "ब", "B", "ব"),

            Alphabet(R.drawable.bh, "भ", "Bh", "ভ"),

            Alphabet(R.drawable.m, "म", "M", "ম"),

            Alphabet(R.drawable.y, "य", "Y", "য"),

            Alphabet(R.drawable.r, "र", "R", "ৰ"),

            Alphabet(R.drawable.l, "ल", "L", "ল"),

            Alphabet(R.drawable.w, "व", "W", "ৱ"),

            Alphabet(R.drawable.sh, "श", "Sh", "শ"),

            Alphabet(R.drawable.shh, "ष", "Sh", "ষ"),

            Alphabet(R.drawable.s, "स", "S", "স"),

            Alphabet(R.drawable.h, "ह", "H", "হ"),

            Alphabet(R.drawable.ksh, "क्ष", "Ksh", "ঞ"),

            Alphabet(R.drawable.tr, "त्र", "Tr", "ড়"),

            Alphabet(R.drawable.dn, "ज्ञ", "Dn", "ঢ়"),

        )
        adapter = AlphabetAdapter(requireContext(), dataList)
        recyclerView.adapter = adapter
    }

}