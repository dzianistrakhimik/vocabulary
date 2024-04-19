package dzianis.trakhimik.vocabulary.data.remote.model

import com.google.gson.annotations.SerializedName

data class WordResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("word")
    val word: String,
    @SerializedName("definition")
    val definition: String
)