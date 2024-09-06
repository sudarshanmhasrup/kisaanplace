package com.kisaanplace.farmer.ui.selectAppLanguageScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.components.appTitleBarLauncher.AppTitleBarLauncher
import com.kisaanplace.farmer.components.navigationTopBar.NavigationTopBar
import com.kisaanplace.farmer.components.primaryButton.PrimaryButton
import com.kisaanplace.farmer.ui.theme.backgroundColor

@Composable
fun SelectAppLanguageUi(
    navController: NavController,
    modifier: Modifier = Modifier,
) {

    var nextButtonState by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
    ) {
        NavigationTopBar(
            showBackButton = false
        )
        AppTitleBarLauncher(
            title = stringResource(id = R.string.select_your_language),
            subTitle = stringResource(id = R.string.select_your_language_hindi),
            smallFont = false,
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = 24.dp,
                    end = 24.dp
                )
        ) {
            SelectAppLanguageListView {
                nextButtonState = it
            }
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
                title = stringResource(id = R.string.next),
                enabled = nextButtonState,
                modifier = Modifier.fillMaxWidth(),
                action = {
                    navController.navigate("LandingScreen")
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
private fun SelectAppLanguageUiPreview() {
    SelectAppLanguageUi(
        navController = rememberNavController(),
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    )
}