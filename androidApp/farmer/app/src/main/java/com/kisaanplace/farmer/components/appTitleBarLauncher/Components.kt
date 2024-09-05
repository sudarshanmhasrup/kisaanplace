package com.kisaanplace.farmer.components.appTitleBarLauncher

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kisaanplace.farmer.R

@Composable
internal fun AppTitleBarLauncherLogo(
    modifier: Modifier = Modifier
) {

    val appLogo = painterResource(id = R.drawable.ic_app_logo)

    Image(
        painter = appLogo,
        contentDescription = stringResource(R.string.app_logo),
        modifier = modifier
    )

}

@Composable
internal fun AppTitleBarLauncherHeadingAndSubHeading(
    title: String,
    subTitle: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(12.dp)
        )
        Text(
            text = subTitle,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun AppTitleBarLauncherLogoPreview() {
    AppTitleBarLauncherLogo(
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
private fun AppTitleBarLauncherHeadingAndSubHeadingPreview() {
    AppTitleBarLauncherHeadingAndSubHeading(
        title = stringResource(R.string.select_your_language),
        subTitle = stringResource(R.string.select_your_language_hindi),
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
    )
}

@Preview(
    showBackground = true
)
@Composable
private fun ComponentsPreview() {
    AppTitleBarLauncherHeadingAndSubHeadingPreview()
}

