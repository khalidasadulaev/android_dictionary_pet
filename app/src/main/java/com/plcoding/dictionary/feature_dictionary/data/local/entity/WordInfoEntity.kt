package com.plcoding.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.dictionary.feature_dictionary.domain.model.License
import com.plcoding.dictionary.feature_dictionary.domain.model.Meaning
import com.plcoding.dictionary.feature_dictionary.domain.model.Phonetic
import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    @PrimaryKey val id: Int? = null,
//    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
//    val phonetics: List<Phonetic>,
//    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
//            license = license,
            phonetic = phonetic,
//            phonetics = phonetics,
//            sourceUrls = sourceUrls,
            word = word
        )
    }
}
