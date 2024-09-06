package com.kisaanplace.farmer.dataClasses

data class AppLanguage(
    private val id: Int,
    private val languageName: String,
    private val languageHindiTranslation: String,
) {

    fun getLanguageName() = languageName
    fun getLanguageHindiTranslation() = languageHindiTranslation
}