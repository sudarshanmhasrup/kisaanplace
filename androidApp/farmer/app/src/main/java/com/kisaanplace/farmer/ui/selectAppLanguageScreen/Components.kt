package com.kisaanplace.farmer.ui.selectAppLanguageScreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kisaanplace.farmer.adapters.selectAppLanguageListAdapter.SelectAppLanguageListAdapter
import com.kisaanplace.farmer.data.appLanguageList
import com.kisaanplace.farmer.dataClasses.AppLanguage

@Composable
fun SelectAppLanguageListView(
    onSelected: (Boolean) -> Unit
) {

    var selectedLanguage by remember { mutableStateOf<AppLanguage?>(null) }

    LazyColumn {
        items(appLanguageList) { appLanguage ->
            SelectAppLanguageListAdapter(
                item = appLanguage,
                isSelected = appLanguage == selectedLanguage) {
                onSelected(it)
                selectedLanguage = appLanguage
            }
            Spacer(
                modifier = Modifier.height(20.dp)
            )
        }
    }
}

@Preview
@Composable
private fun SelectAppLanguageListViewPreview() {
    SelectAppLanguageListView {

    }
}