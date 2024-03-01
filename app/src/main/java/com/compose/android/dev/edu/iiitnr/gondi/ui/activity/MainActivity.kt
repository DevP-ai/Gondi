package com.compose.android.dev.edu.iiitnr.gondi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.compose.android.dev.edu.iiitnr.gondi.R
import com.compose.android.dev.edu.iiitnr.gondi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val navHostFragment=supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment
        val navController=navHostFragment.navController

        NavigationUI.setupWithNavController(binding.bottomView,navController)
    }
}