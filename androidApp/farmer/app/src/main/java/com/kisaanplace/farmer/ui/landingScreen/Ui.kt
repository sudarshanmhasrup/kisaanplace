package com.kisaanplace.farmer.ui.landingScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.components.appTitleBarLauncher.AppTitleBarLauncher
import com.kisaanplace.farmer.components.navigationTopBar.NavigationTopBar
import com.kisaanplace.farmer.components.pagerIndicators.PagerIndicators
import com.kisaanplace.farmer.components.primaryButton.PrimaryButton
import com.kisaanplace.farmer.data.Routes
import com.kisaanplace.farmer.ui.theme.backgroundColor

@Composable
fun LandingScreenUi(
    navController: NavController,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            NavigationTopBar(
                showBackButton = false
            )
            AppTitleBarLauncher(
                title = stringResource(id = R.string.welcome_message),
                smallFont = true,
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LandingScreenPager()
            }
        }
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            PagerIndicators()
        }
        Surface(
            modifier = Modifier.padding(
                top = 20.dp,
                bottom = 20.dp,
                start = 24.dp,
                end = 24.dp
            )
        ) {
            PrimaryButton(
                title = stringResource(R.string.get_started),
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                action = {
                    navController.navigate(Routes.AUTH_SCREEN)
                }
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun LandingScreenUiPreview() {
    LandingScreenUi(
        navController = rememberNavController(),
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    )
}