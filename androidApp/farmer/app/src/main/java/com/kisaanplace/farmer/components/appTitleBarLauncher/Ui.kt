package com.kisaanplace.farmer.components.appTitleBarLauncher

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.ui.theme.backgroundColor

@Composable
internal fun AppTitleBarLauncher(
    title: String,
    subTitle: String? = null,
    smallFont: Boolean,
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
) {
    Column(
        modifier = if(smallFont) {
            modifier.padding(
                top = 10.dp,
                bottom = 10.dp,
                start = 24.dp,
                end = 24.dp)
        } else {
            modifier.padding(
                top = 40.dp,
                bottom = 40.dp,
                start = 24.dp,
                end = 24.dp
            )
        },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppTitleBarLauncherLogo(
            modifier = Modifier.height(60.dp)
        )
        Spacer(
            modifier = Modifier.height(12.dp)
        )
        AppTitleBarLauncherHeadingAndSubHeading(
            title = title,
            subTitle = subTitle,
            smallFont = smallFont
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun AppTitleBarLauncherPreview() {
    AppTitleBarLauncher(
        title = stringResource(id = R.string.select_your_language),
        subTitle = stringResource(id = R.string.select_your_language_hindi),
        smallFont = false,
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
    )
}