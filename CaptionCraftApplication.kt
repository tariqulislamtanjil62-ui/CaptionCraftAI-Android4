package com.captioncraft.ai

import android.app.Application
import com.captioncraft.ai.data.local.AppDatabase
import com.google.firebase.FirebaseApp
import com.google.firebase.appcheck.FirebaseAppCheck
import com.google.firebase.appcheck.debug.DebugAppCheckProviderFactory
import com.google.firebase.appcheck.playintegrity.PlayIntegrityAppCheckProviderFactory

class CaptionCraftApplication : Application() {
    lateinit var database: AppDatabase
        private set

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

        val appCheck = FirebaseAppCheck.getInstance()
        if (BuildConfig.DEBUG) {
            appCheck.installAppCheckProviderFactory(DebugAppCheckProviderFactory.getInstance())
        } else {
            appCheck.installAppCheckProviderFactory(PlayIntegrityAppCheckProviderFactory.getInstance())
        }

        database = AppDatabase.getInstance(this)
    }
}
