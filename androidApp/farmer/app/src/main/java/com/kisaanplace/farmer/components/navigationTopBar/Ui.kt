package com.kisaanplace.farmer.components.navigationTopBar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NavigationTopBar(
    modifier: Modifier = Modifier,
    showBackButton: Boolean
) {
    Row(
        modifier = modifier.padding(
            top = 20.dp,
            bottom = 20.dp,
            start = 12.dp,
            end = 20.dp
        )
    ) {
        if (showBackButton) {
            NavigationTopBarBackButton()
        }
        Spacer(
            modifier = Modifier.weight(1f)
        )
        NavigationTopBarSpeakerButton()
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun NavigationTopBarPreview() {
    NavigationTopBar(
        modifier = Modifier.fillMaxWidth(),
        showBackButton = true
    )
}
