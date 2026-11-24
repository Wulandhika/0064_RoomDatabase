package com.example.myapplication9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication9.ui.theme.MyApplication9Theme
import com.example.myapplication9.uicontroller.SiswaApp
import com.example.myapplication9.viewmodel.PenyediaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication9Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    // Memanggil SiswaApp untuk navigasi
                    SiswaApp()
                }
            }
        }
    }
}