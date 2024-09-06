package com.kisaanplace.farmer.data

import androidx.compose.ui.res.stringResource
import com.kisaanplace.farmer.R
import com.kisaanplace.farmer.dataClasses.AppLanguage

val appLanguageList: List<AppLanguage> = listOf(
    AppLanguage(
        id = 1,
        languageName = "English",
        languageHindiTranslation = "अंग्रेज़ी"
    ),
    AppLanguage(
        id = 2,
        languageName = "Hindi",
        languageHindiTranslation = "हिंदी"
    ),
    AppLanguage(
        id = 3,
        languageName = "Marathi",
        languageHindiTranslation = "मराठी"
    )
)