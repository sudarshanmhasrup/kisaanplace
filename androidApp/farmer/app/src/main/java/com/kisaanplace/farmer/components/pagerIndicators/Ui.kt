package com.kisaanplace.farmer.components.pagerIndicators

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kisaanplace.farmer.ui.theme.primaryColor

@Composable
fun PagerIndicators(
    modifier: Modifier = Modifier
) {
    Row {
        Spacer(
            modifier = Modifier.height(10.dp)
                .width(10.dp)
                .background(
                    color = primaryColor,
                    shape = RoundedCornerShape(100.dp)
                )
        )
    }
}

@Preview
@Composable
fun PagerIndicatorsPreview() {
    PagerIndicators(
        modifier = Modifier.fillMaxWidth()
    )
}
