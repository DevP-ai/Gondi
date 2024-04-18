package com.compose.android.dev.edu.iiitnr.gondi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
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

        val toolbar = findViewById<Toolbar>(R.id.tool)
        toolbar.setNavigationOnClickListener {
            this@StoryActivity.finish()
        }

        if(recognizeText.isNotBlank()){
            showTagLine(recognizeText)
            val story=getStory(recognizeText)
            showStory(story)
            showImageForText(recognizeText)
        }else{
            Toast.makeText(this@StoryActivity,"NAN",Toast.LENGTH_LONG).show()
        }

    }

    private fun showTagLine(recognizeText: String) {
        val text=recognizeText.uppercase()
       when(text){
           "A" -> binding.detectedLetter.text="${text} for Apple"
           "B" ->binding.detectedLetter.text="${text} for Ball"
           "C" -> binding.detectedLetter.text="${text} for Cat"
           "D" -> binding.detectedLetter.text="${text} for Dog"
           "E" -> binding.detectedLetter.text="${text} for Eagle"
           "F" -> binding.detectedLetter.text="${text} for Fox"
           "G" -> binding.detectedLetter.text="${text} for Goat"
           "H" -> binding.detectedLetter.text="${text} for Hen"
           "I" -> binding.detectedLetter.text="${text} for Icecream"
           "J" -> binding.detectedLetter.text="${text} for Jug"
           "K" -> binding.detectedLetter.text="${text} for Kite"
           "L" -> binding.detectedLetter.text="${text} for Lion"
           "M" -> binding.detectedLetter.text="${text} for Mango"
           "N" -> binding.detectedLetter.text="${text} for Nest"
           "O" -> binding.detectedLetter.text="${text} for Orange"
           "P" -> binding.detectedLetter.text="${text} for Panda"
           "Q" -> binding.detectedLetter.text="${text} for Queen"
           "R" -> binding.detectedLetter.text="${text} for Rabbit"
           "S" -> binding.detectedLetter.text="${text} for Sun"
           "T" -> binding.detectedLetter.text="${text} for Tiger"
           "U" -> binding.detectedLetter.text="${text} for Umbrella"
           "V" -> binding.detectedLetter.text="${text} for Vulture"
           "W" -> binding.detectedLetter.text="${text} for Watermelon"
           "X" -> binding.detectedLetter.text="${text} for X ray"
           "Y" -> binding.detectedLetter.text="${text} for Yoga"
           "Z" -> binding.detectedLetter.text="${text} for Zebra"
       }
    }

    private fun showImageForText(text: String) {
        val imageId=getImageId(text)
        if(imageId!=0){
            binding.imageView.setImageResource(imageId)
        }
    }

    private fun getImageId(text: String): Int {
        return  when(text.uppercase()){
            "A" -> R.drawable.apple
            "B" -> R.drawable.ball
            "C" -> R.drawable.cat
            "D" -> R.drawable.dog
            "E" -> R.drawable.eagle
            "F" -> R.drawable.fox
            "G" -> R.drawable.goat
            "H" -> R.drawable.hen
            "I" -> R.drawable.ice
            "J" -> R.drawable.jug
            "K" -> R.drawable.kite
            "L" -> R.drawable.lion
            "M" -> R.drawable.mango
            "N" -> R.drawable.nest
            "O" -> R.drawable.orage
            "P" -> R.drawable.panda
            "Q" -> R.drawable.queen
            "R" -> R.drawable.rabbit
            "S" -> R.drawable.sun
            "T" -> R.drawable.tiger
            "U" -> R.drawable.umbrella
            "V" -> R.drawable.vulture
            "W" -> R.drawable.watermelon
            "X" -> R.drawable.xray
            "Y" -> R.drawable.yoga
            "Z" -> R.drawable.zebra
             else ->0
        }
    }

    private fun showStory(story: String) {
        binding.englishStory.text=story
    }
}