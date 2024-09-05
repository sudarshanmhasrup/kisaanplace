package com.kisaanplace.farmer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.kisaanplace.farmer.ui.selectAppLanguageScreen.SelectAppLanguageUi
import com.kisaanplace.farmer.ui.splashScreen.SplashScreenUi
import com.kisaanplace.farmer.ui.theme.backgroundColor

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = backgroundColor
            ) {
                SelectAppLanguageUi()
            }
        }
    }
}