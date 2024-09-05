package com.kisaanplace.farmer.ui.splashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.ui.theme.backgroundColor

@Composable
fun SplashScreenUi(
    modifier: Modifier = Modifier
) {

    val splashScreenIcon = painterResource(id = R.drawable.ic_splash_screen)

    Column(
        modifier = modifier
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = splashScreenIcon,
            contentDescription = stringResource(R.string.splash_screen_text1)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SplashScreenUiPreview() {
    SplashScreenUi(
        modifier = Modifier.fillMaxSize()
    )
}
