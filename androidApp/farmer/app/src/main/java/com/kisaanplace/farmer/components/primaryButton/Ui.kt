package com.kisaanplace.farmer.components.primaryButton

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.ui.theme.Poppins
import com.kisaanplace.farmer.ui.theme.primaryColor
import com.kisaanplace.farmer.ui.theme.primaryColorDisabled

@Composable
fun PrimaryButton(
    title: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    action: () -> Unit
) {
    Button(
        onClick = { action() },
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = primaryColor,
            disabledContainerColor = primaryColorDisabled,
            disabledContentColor = Color.White
        )
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(
                top = 12.dp,
                bottom = 12.dp
            ),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            fontFamily = Poppins
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton(
        title = stringResource(R.string.next),
        enabled = false,
        modifier = Modifier.fillMaxWidth(),
        action = {}
    )
}