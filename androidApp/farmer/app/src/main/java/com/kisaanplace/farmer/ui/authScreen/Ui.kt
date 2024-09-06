package com.kisaanplace.farmer.ui.authScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kisaanplace.farmer.components.navigationTopBar.NavigationTopBar
import com.kisaanplace.farmer.ui.theme.backgroundColor

@Composable
fun AuthenticationScreenUi(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        NavigationTopBar(
            showBackButton = true
        )
        Column {

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun AuthenticationScreenUiPreview() {
    AuthenticationScreenUi(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    )
}