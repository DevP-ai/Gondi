package com.compose.android.dev.edu.iiitnr.gondi.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.compose.android.dev.edu.iiitnr.gondi.databinding.FragmentHomeBinding
import com.compose.android.dev.edu.iiitnr.gondi.ui.activity.StoryActivity
import com.compose.android.dev.edu.iiitnr.gondi.utils.StrokeManager.clear
import com.compose.android.dev.edu.iiitnr.gondi.utils.StrokeManager.download
import com.compose.android.dev.edu.iiitnr.gondi.utils.StrokeManager.recognize

class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

}