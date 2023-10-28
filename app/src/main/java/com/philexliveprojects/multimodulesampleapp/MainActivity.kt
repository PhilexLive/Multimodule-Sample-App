package com.philexliveprojects.multimodulesampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.philexliveprojects.multimodulesampleapp.feature.home.HomeScreen
import com.philexliveprojects.multimodulesampleapp.core.theme.MultimoduleSampleAppTheme
import com.philexliveprojects.multimodulesampleapp.feature.home.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultimoduleSampleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MultimoduleSampleApp()
                }
            }
        }
    }
}

object Destinations {
    const val HOME = "home"
    const val DETAILS = "details"
}

@Composable
fun MultimoduleSampleApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.HOME) {
        composable(Destinations.HOME) {
            HomeScreen(Destinations.HOME.replaceFirstChar { it.uppercase() }) { navController.navigate(Destinations.DETAILS) }
        }
        composable(Destinations.DETAILS) {
        }
    }
}
