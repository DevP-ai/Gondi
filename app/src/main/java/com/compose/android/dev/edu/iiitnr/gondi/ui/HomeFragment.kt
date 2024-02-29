package com.compose.android.dev.edu.iiitnr.gondi.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
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

//        binding.btnRecognize.setOnClickListener {
//            recognize(textView)
//            binding.output.text=textView.text
//        }

        binding.btnRecognize.setOnClickListener {
            recognize(
                onSuccessListener = {recognizedText->
                    textView.text=recognizedText
                    binding.output.text=recognizedText

                    val englishAlphabet=recognizedText.matches(Regex("[a-zA-Z]+"))

                    if(englishAlphabet){
                        Handler(Looper.myLooper()!!).postDelayed({
                            val intent=Intent(requireActivity(),StoryActivity::class.java)
                            val bundle=Bundle()
                            bundle.putString("recognizeText",recognizedText)
                            intent.putExtras(bundle)
                            binding.drawView.clear()
                            clear()
                            textView.text=""
                            binding.output.text="output"
                            startActivity(intent)
                        },2000)
                    }

                },
                onFailureListener = {e->
                    Log.e("OUTPUT", "Error during recognition: $e")
                }
            )
        }

        binding.btnClear.setOnClickListener {
            binding.drawView.clear()
            clear()
            textView.text=""
            binding.output.text="output"
        }

    }

}