package com.kisaanplace.farmer.components.navigationTopBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.ui.theme.backgroundColor
import com.kisaanplace.farmer.ui.theme.greyColor
import com.kisaanplace.farmer.ui.theme.primaryColor


@Composable
internal fun NavigationTopBarBackButton(
    modifier: Modifier = Modifier
) {

    val backButtonIcon = painterResource(id = R.drawable.ic_back_button_ios_style)

    Surface(
        modifier = modifier
    ) {
        Image(
            painter = backButtonIcon,
            contentDescription = stringResource(R.string.back_button_text),
            modifier = Modifier.padding(
                top = 10.dp,
                bottom = 10.dp,
                start = 16.dp,
                end = 16.dp
            )
        )
    }
}

@Composable
internal fun NavigationTopBarSpeakerButton() {

    var isTurnedOn by remember { mutableStateOf(true) }

    val speakerIcon = if (isTurnedOn) {
        painterResource(id = R.drawable.ic_speaker_on_white)
    } else {
        painterResource(id = R.drawable.ic_speaker_turned_off)
    }

    val speakerIconContentDescription = if (isTurnedOn) {
        stringResource(R.string.speaker_turned_on)
    } else {
        stringResource(R.string.speaker_turned_off)
    }

    Surface(
        color = if (isTurnedOn) {
            primaryColor
        } else {
            greyColor
        },
        shape = RoundedCornerShape(100.dp)
    ) {
        Image(
            painter = speakerIcon,
            contentDescription = speakerIconContentDescription,
            modifier = Modifier
                .padding(12.dp)
                .clickable {
                    isTurnedOn = !isTurnedOn
                }
        )
    }
}

@Composable
private fun NavigationTopBarBackButtonPreview() {
    NavigationTopBarBackButton(
        modifier = Modifier.background(
            color = backgroundColor
        )
    )
}

@Composable
private fun NavigationTopBarSpeakerButtonPreview() {
    NavigationTopBarSpeakerButton()
}

@Preview(
    showBackground = true
)
@Composable
private fun ComponentsPreview() {
    NavigationTopBarSpeakerButtonPreview()
}