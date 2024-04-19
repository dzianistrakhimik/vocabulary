package dzianis.trakhimik.vocabulary.data.remote.api

import dzianis.trakhimik.vocabulary.data.local.entity.WordEntity
import dzianis.trakhimik.vocabulary.data.remote.model.WordResponse
import retrofit2.http.*

interface VocabularyApiService {

    @GET("words")
    suspend fun getAllWords(): List<WordResponse>

    @POST("words")
    suspend fun addWord(@Body word: WordEntity): WordResponse

    @PUT("words/{id}")
    suspend fun updateWord(@Path("id") wordId: Int, @Body word: WordEntity): WordResponse

    @DELETE("words/{id}")
    suspend fun deleteWord(@Path("id") wordId: Int)
}