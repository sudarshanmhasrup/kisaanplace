package com.kisaanplace.farmer.ui.landingScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.adapters.landingScreenPagerAdapter.LandingScreenPagerAdapter
import com.kisaanplace.farmer.components.pagerIndicators.PagerIndicators

@Composable
internal fun LandingScreenPager() {

    val pagerState = PagerState(pageCount = {3})

    Column {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth(),
        ) { page ->
            when(page) {
                0 -> {
                    LandingScreenPagerAdapter(
                        title = stringResource(R.string.sell_your_products),
                        description = stringResource(R.string.page_description_1),
                        image = R.drawable.sell_your_products_image,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                1 -> {
                    LandingScreenPagerAdapter(
                        title = stringResource(R.string.make_extra_profit),
                        description = stringResource(R.string.pager_description_02),
                        image = R.drawable.earn_extra_profit_image,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                2 -> {
                    LandingScreenPagerAdapter(
                        title = stringResource(R.string.manage_your_transactions),
                        description = stringResource(R.string.pager_description_03),
                        image = R.drawable.manager_your_transactions_image,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun LandingScreenPagerPreview() {
    LandingScreenPager()
}