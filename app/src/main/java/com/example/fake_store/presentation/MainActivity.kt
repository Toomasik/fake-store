package com.example.fake_store.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fake_store.presentation.theme.ui.FakeStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navHost = rememberNavController()
            FakeStoreTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navController = navHost, startDestination = "LogIn") {
                        composable("LogIn") {
                            LogIn(innerPadding, navHost)
                        }

                        composable("SignUp") {
                            SignUp(innerPadding, navHost)
                        }
                    }

                }
            }
        }
    }
}

