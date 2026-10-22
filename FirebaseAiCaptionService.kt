package com.captioncraft.ai.data.remote

import com.captioncraft.ai.data.model.*
import com.google.firebase.Firebase
import com.google.firebase.ai.ai
import com.google.firebase.ai.type.generationConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FirebaseAiCaptionService {
    private val generativeModel by lazy {
        Firebase.ai.generativeModel(
            modelName = "gemini-2.5-flash",
            generationConfig = generationConfig {
                temperature = 0.7f
                responseMimeType = "application/json"
            }
        )
    }

    suspend fun generateCaptions(
        topic: String,
        language: AppLanguage,
        tone: AppTone,
        platform: AppPlatform,
        enableLiveSearch: Boolean = true
    ): List<CaptionOption> = withContext(Dispatchers.IO) {
        val prompt = "Topic: $topic, Platform: ${platform.id}, Language: ${language.code}, Search: $enableLiveSearch"
        val response = generativeModel.generateContent(prompt)
        emptyList()
    }
}
