package com.compose.android.dev.edu.iiitnr.gondi.ui.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.compose.android.dev.edu.iiitnr.gondi.R
import com.compose.android.dev.edu.iiitnr.gondi.databinding.ActivityAssameseBinding

class AssameseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAssameseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAssameseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.assameseContent.text=getString(R.string.assamese)

        binding.assameseReadMore.setOnClickListener {
            openInBrowser()
        }
    }
    private fun openInBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Assamese_language"))
        startActivity(intent)
    }
}