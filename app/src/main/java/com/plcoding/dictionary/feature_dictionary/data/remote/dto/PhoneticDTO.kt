package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.domain.model.Phonetic

data class PhoneticDTO(
    val audio: String,
    val licenseDTO: LicenseDTO,
    val sourceUrl: String,
    val text: String
) {
    fun toPhonetic(): Phonetic {
        return Phonetic(
            audio = audio,
            license = licenseDTO.toLicence(),
            sourceUrl = sourceUrl,
            text = text
        )
    }
}