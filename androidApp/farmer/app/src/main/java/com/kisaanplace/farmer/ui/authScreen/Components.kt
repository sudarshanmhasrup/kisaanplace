package com.kisaanplace.farmer.ui.authScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.ui.theme.Poppins
import com.kisaanplace.farmer.ui.theme.greyColor
import com.kisaanplace.farmer.ui.theme.textFieldUnfocusedColor

@Composable
internal fun MobileInputWithCountryCode() {

    val flagImage = painterResource(id = R.drawable.india_flag_image)

    Row {
        Row(
            modifier = Modifier.padding(
                start = 14.dp
            )
                .background(
                    color = textFieldUnfocusedColor
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = flagImage,
                contentDescription = "India flag",
                modifier = Modifier.height(16.dp)
            )
            Text(
                text = "+91 ",
                modifier = Modifier.padding(14.dp),
                fontWeight = FontWeight.SemiBold,
                fontFamily = Poppins
            )
        }
    }
}

@Composable
private fun MobileInputWithCountryCodePreview() {
    MobileInputWithCountryCode()
}

@Preview(
    showBackground = true
)
@Composable
private fun ComponentsPreview() {
    MobileInputWithCountryCodePreview()
}