package com.kisaanplace.farmer.components.appTitleBarLauncher

import android.annotation.SuppressLint
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.ui.theme.Poppins

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
    subTitle: String? = null,
    smallFont: Boolean,
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = if (smallFont) {
                18.sp
            } else {
                24.sp
            },
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = Poppins
        )
        Spacer(
            modifier = Modifier.height(12.dp)
        )
        if (subTitle != null) {
            Text(
                text = subTitle,
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = Poppins
            )
        }
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
        smallFont = false,
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

