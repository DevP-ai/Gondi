package com.compose.android.dev.edu.iiitnr.gondi.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.compose.android.dev.edu.iiitnr.gondi.R
import com.compose.android.dev.edu.iiitnr.gondi.databinding.FragmentHomeBinding
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

        //Download model
        download()
        val textView=binding.textResult

        binding.btnRecognize.setOnClickListener {
          recognize(textView)
        }

        binding.btnClear.setOnClickListener {
            binding.drawView.clear()
            clear()
            textView.text=""
        }

    }

}