package com.kisaanplace.farmer.adapters.selectAppLanguageListAdapter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventEnd
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.dataClasses.AppLanguage
import com.kisaanplace.farmer.ui.theme.Poppins
import com.kisaanplace.farmer.ui.theme.greyColor
import com.kisaanplace.farmer.ui.theme.primaryColor

@Composable
fun SelectAppLanguageListAdapter(
    item: AppLanguage,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onItemSelected: (Boolean) -> Unit
) {

    val selectedIcon = painterResource(id = R.drawable.ic_select_check)

    Row(
        modifier = modifier
            .background(
                color = if (isSelected) {
                    primaryColor
                } else {
                    greyColor
                },
                shape = RoundedCornerShape(8.dp)
            )
            .clickable {
                onItemSelected(true)
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = item.getLanguageName(),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = Poppins,
            modifier = Modifier.padding(
                top = 22.dp,
                bottom = 22.dp,
                start = 24.dp,
            ),
            color = if (isSelected) {
                Color.White
            } else {
                Color.Black
            }
        )
        Spacer(
            modifier = Modifier.width(4.dp)
        )
        Text(
            text = "(${item.getLanguageHindiTranslation()})",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = Poppins,
            color = if (isSelected) {
                Color.White
            } else {
                Color.Black
            }
        )
        Spacer(
            modifier = Modifier.weight(1f)
        )
        if (isSelected) {
            Image(
                painter = selectedIcon,
                contentDescription = "Selected",
                modifier = Modifier.padding(
                    end = 24.dp
                )
            )
        }
    }
}

@Preview
@Composable
private fun SelectAppLanguageListAdapterPreview() {
    SelectAppLanguageListAdapter(
        item = AppLanguage(
            id = 1,
            languageName = stringResource(id = R.string.english),
            languageHindiTranslation = stringResource(id = R.string.english_hindi)
        ),
        isSelected = false,
        modifier = Modifier.fillMaxWidth()
    ) {}
}