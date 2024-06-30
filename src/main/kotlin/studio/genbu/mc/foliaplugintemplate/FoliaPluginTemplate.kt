package studio.genbu.mc.foliaplugintemplate

import org.bukkit.plugin.java.JavaPlugin

class FoliaPluginTemplate: JavaPlugin() {

    override fun onLoad() {
        logger.info("FoliaPluginTemplate has been loaded.")
    }

    override fun onEnable() {
        logger.info("FoliaPluginTemplate has been enabled.")
    }

    override fun onDisable() {
        logger.info("FoliaPluginTemplate has been disabled.")
    }

}
