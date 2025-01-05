package com.moddy.instasaverpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.moddy.instasaverpro.ui.screens.HomeScreen
import com.moddy.instasaverpro.ui.theme.InstaSaverPROTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstaSaverPROTheme {
                HomeScreen()
            }
        }
    }
}