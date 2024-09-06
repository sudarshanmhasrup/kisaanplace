package com.kisaanplace.farmer

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kisaanplace.farmer.data.Routes
import com.kisaanplace.farmer.ui.landingScreen.LandingScreenUi
import com.kisaanplace.farmer.ui.selectAppLanguageScreen.SelectAppLanguageUi

@Composable
fun InitApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.LANGUAGE_SCREEN,
        builder = {
            composable(Routes.LANGUAGE_SCREEN) {
                SelectAppLanguageUi(
                    navController = navController
                )
            }
            composable(Routes.LANDING_SCREEN) {
                LandingScreenUi(
                    navController = navController
                )
            }
        }
    )
}

