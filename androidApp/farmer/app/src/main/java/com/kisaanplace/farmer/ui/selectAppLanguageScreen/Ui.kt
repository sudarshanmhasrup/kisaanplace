package com.kisaanplace.farmer.ui.selectAppLanguageScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.components.appTitleBarLauncher.AppTitleBarLauncher
import com.kisaanplace.farmer.components.navigationTopBar.NavigationTopBar

@Composable
fun SelectAppLanguageUi(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        NavigationTopBar(
            showBackButton = false
        )
        AppTitleBarLauncher(
            title = stringResource(id = R.string.select_your_language),
            subTitle = stringResource(id = R.string.select_your_language_hindi),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SelectAppLanguageUiPreview() {
    SelectAppLanguageUi(
        modifier = Modifier.fillMaxSize()
    )
}