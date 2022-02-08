package com.pluto.plugins.logger

import androidx.fragment.app.Fragment
import com.pluto.plugin.DeveloperDetails
import com.pluto.plugin.Plugin
import com.pluto.plugin.PluginConfiguration
import com.pluto.plugins.logger.internal.LogsFragment
import com.pluto.plugins.logger.internal.LogsRepo

class PlutoLoggerPlugin(identifier: String) : Plugin(identifier) {

    override fun getConfig(): PluginConfiguration = PluginConfiguration(
        name = context.getString(R.string.pluto_logger___plugin_name),
        icon = R.drawable.pluto_logger___ic_logger_icon
    )

    override fun getView(): Fragment = LogsFragment()

    override fun getDeveloperDetails(): DeveloperDetails {
        return DeveloperDetails(
            website = "https://plutolib.com",
            vcsLink = "https://github.com/plutolib/plugin-logger"
        )
    }

    override fun onPluginInstalled() {
    }

    override fun onPluginDataCleared() {
        LogsRepo.deleteAll()
    }
}