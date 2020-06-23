package dev.hyuwah.moviedbexplorer.core

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieDbExplorerApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieDbExplorerApp)
            modules()
        }
    }

}