package com.compose.android.dev.edu.iiitnr.gondi.ui.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.compose.android.dev.edu.iiitnr.gondi.R
import com.compose.android.dev.edu.iiitnr.gondi.databinding.ActivityGondiBinding

class GondiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGondiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGondiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gondiContent.text=getString(R.string.gondi)

        binding.gondiReadMore.setOnClickListener {
            openInBrowser()
        }
    }

    private fun openInBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Gondi_language"))
        startActivity(intent)
    }
}