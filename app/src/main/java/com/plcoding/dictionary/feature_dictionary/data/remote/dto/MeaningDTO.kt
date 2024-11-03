package com.plcoding.dictionary.feature_dictionary.data.remote.dto

import com.plcoding.dictionary.feature_dictionary.domain.model.Meaning

data class MeaningDTO(
    val antonyms: List<Any>,
    val definitionDTOs: List<DefinitionDTO>,
    val partOfSpeech: String,
    val synonyms: List<String>
) {
    fun toMeaning(): Meaning {
        return Meaning(
            antonyms = antonyms,
            definitions = definitionDTOs.map { it.toDefinition() },
            partOfSpeech = partOfSpeech,
            synonyms = synonyms,
        )
    }
}