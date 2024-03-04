package com.compose.android.dev.edu.iiitnr.gondi.ui.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.compose.android.dev.edu.iiitnr.gondi.R
import com.compose.android.dev.edu.iiitnr.gondi.databinding.ActivitySanskritBinding

class SanskritActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySanskritBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySanskritBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sanskritContent.text= getString(R.string.sanskrit)

        binding.sanskritReadMore.setOnClickListener {
            openInBrowser()
        }
    }

    private fun openInBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Sanskrit#:~:text=Sanskrit%20is%20the%20sacred%20language,texts%20of%20Buddhism%20and%20Jainism."))
        startActivity(intent)
    }
}