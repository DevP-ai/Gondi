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
import com.compose.android.dev.edu.iiitnr.gondi.ui.activity.AssameseActivity
import com.compose.android.dev.edu.iiitnr.gondi.ui.activity.GondiActivity
import com.compose.android.dev.edu.iiitnr.gondi.ui.activity.SanskritActivity
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
        gondiView()
        sanskritView()
        assameseView()
    }




    private fun gondiView() {
        binding.gondiView.setOnClickListener {
            startActivity(Intent(requireActivity(),GondiActivity::class.java))
        }
        binding.gondiTitle.text="Gondi language"
        binding.gondiDesc.text="Gondi, natively known as Koitur, is a South-Central Dravidian language, spoken by about three million Gondi people,"
    }

    private fun sanskritView() {
        binding.sanskritView.setOnClickListener {
            startActivity(Intent(requireActivity(),SanskritActivity::class.java))
        }
        binding.sanskritTitle.text="Sanskrit"
        binding.sanskritDesc.text="Sanskrit is a classical language belonging to the Indo-Aryan branch of the Indo-European languages. It arose in South Asia after its predecessor languages had diffused there from the northwest in the late Bronze Age."
    }

    private fun assameseView() {
        binding.assameseView.setOnClickListener {
            startActivity(Intent(requireActivity(),AssameseActivity::class.java))
        }
        binding.assameseTitle.text="Assamese"
        binding.assameseDesc.text="Assamese or Asamiya is an Indo-Aryan language spoken mainly in the north-eastern Indian state of Assam, where it is an official language. "
    }
}