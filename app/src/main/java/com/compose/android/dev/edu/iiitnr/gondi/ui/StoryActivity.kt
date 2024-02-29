package com.compose.android.dev.edu.iiitnr.gondi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.compose.android.dev.edu.iiitnr.gondi.R
import com.compose.android.dev.edu.iiitnr.gondi.databinding.ActivityStoryBinding
import com.compose.android.dev.edu.iiitnr.gondi.utils.StoryFile.getStory

class StoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStoryBinding

    private lateinit var recognizeText:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle=intent.extras
        recognizeText=bundle?.getString("recognizeText").toString()

        if(recognizeText.isNotBlank()){
            binding.detectedLetter.text=recognizeText
            val story=getStory(recognizeText)
            showStory(story)
        }else{
            Toast.makeText(this@StoryActivity,"NAN",Toast.LENGTH_LONG).show()
        }
    }

    private fun showStory(story: String) {
        binding.englishStory.text=story
    }
}