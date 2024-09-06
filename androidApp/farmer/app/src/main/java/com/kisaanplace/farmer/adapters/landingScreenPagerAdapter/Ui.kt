package com.kisaanplace.farmer.adapters.landingScreenPagerAdapter

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
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
fun LandingScreenPagerAdapter(
    title: String,
    description: String,
    image: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(
                20.dp
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "$title image",
            modifier = Modifier.height(200.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontFamily = Poppins
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontFamily = Poppins
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun LandingScreenPageAdapterPreview() {
    LandingScreenPagerAdapter(
        title = stringResource(R.string.sell_your_products),
        description = stringResource(R.string.page_description_1),
        image = R.drawable.sell_your_products_image,
        modifier = Modifier.fillMaxWidth()
    )
}