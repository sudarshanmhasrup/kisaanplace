package com.kisaanplace.farmer

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalDensity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kisaanplace.farmer.data.Routes
import com.kisaanplace.farmer.ui.authScreen.AuthenticationScreenUi
import com.kisaanplace.farmer.ui.landingScreen.LandingScreenUi
import com.kisaanplace.farmer.ui.selectAppLanguageScreen.SelectAppLanguageUi

@Composable
fun InitApp() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Select_App_Language",
        builder = {
            composable("Select_App_Language") {
                SelectAppLanguageUi(
                    navController = navController
                )
            }
            composable(Routes.LANDING_SCREEN) {
                LandingScreenUi(navController = navController)
            }
            composable(Routes.AUTH_SCREEN_MOBILE) {
                AuthenticationScreenUi()
            }
        }
    )
}

