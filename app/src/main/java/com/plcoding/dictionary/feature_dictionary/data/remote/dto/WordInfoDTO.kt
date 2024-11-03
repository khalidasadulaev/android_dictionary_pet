package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.data.local.entity.WordInfoEntity
import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDTO(
    val licenseDTO: LicenseDTO,
    val meaningDTOs: List<MeaningDTO>,
    val phonetic: String,
    val phoneticDTOs: List<PhoneticDTO>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            license = licenseDTO.toLicence(),
            meanings= meaningDTOs.map { it.toMeaning() },
            phonetic = phonetic,
            phonetics= phoneticDTOs.map { it.toPhonetic() },
            sourceUrls= sourceUrls,
            word= word
        )
    }

}
