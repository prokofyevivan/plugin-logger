package com.logger.demo

import android.app.Application
import com.pluto.Pluto
import com.pluto.plugins.logger.PlutoLoggerPlugin
import com.pluto.preferences.PlutoSharePreferencesPlugin

class DemoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Pluto.Installer(this)
            .addPlugin(PlutoSharePreferencesPlugin("sharedPref"))
            .addPlugin(PlutoLoggerPlugin("logger"))
            .install()
    }
}
