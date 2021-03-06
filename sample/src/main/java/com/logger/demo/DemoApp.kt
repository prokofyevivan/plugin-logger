package com.logger.demo

import android.app.Application
import com.pluto.Pluto
import com.pluto.plugins.logger.PlutoLoggerPlugin
import com.pluto.plugins.logger.PlutoTimberTree
import timber.log.Timber

class DemoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Pluto.Installer(this)
            .addPlugin(PlutoLoggerPlugin("logger"))
            .install()

        Timber.plant(PlutoTimberTree())
    }
}
