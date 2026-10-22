package com.captioncraft.ai.data.model

enum class AppLanguage(val code: String, val title: String, val subtitle: String) {
    ENGLISH("english", "English", "Global & International"),
    BANGLA("bangla", "বাংলা", "বিশুদ্ধ বাংলা ভাষা"),
    BILINGUAL("bilingual", "Bilingual", "বাংলা + English Mix")
}

enum class AppTone(val id: String, val label: String, val icon: String, val description: String) {
    FRIENDLY("friendly", "Friendly", "😊", "Warm, approachable"),
    PROFESSIONAL("professional", "Professional", "💼", "Credible, structured"),
    FUNNY("funny", "Funny", "😂", "Witty, humorous"),
    PROMOTIONAL("promotional", "Promotional", "🚀", "Action-driven, sales focus"),
    INFORMATIVE("informative", "Informative", "💡", "Insightful, educational")
}

enum class AppPlatform(val id: String, val label: String, val iconName: String) {
    YOUTUBE("youtube", "YouTube", "youtube"),
    PINTEREST("pinterest", "Pinterest", "pin"),
    INSTAGRAM("instagram", "Instagram", "instagram"),
    FACEBOOK("facebook", "Facebook", "facebook"),
    TIKTOK("tiktok", "TikTok", "video"),
    LINKEDIN("linkedin", "LinkedIn", "linkedin"),
    TWITTER("twitter", "X (Twitter)", "twitter"),
    GENERAL("general", "General", "globe")
}

data class CaptionOption(
    val id: String,
    val style: String,
    val text: String,
    val hashtags: List<String>,
    val callToAction: String,
    val seoTags: List<String> = emptyList(),
    val pinTitle: String? = null,
    val videoHook: String? = null,
    val isFavorite: Boolean = false,
    val isSearchGrounded: Boolean = false,
    val timestamp: Long = System.currentTimeMillis()
)
