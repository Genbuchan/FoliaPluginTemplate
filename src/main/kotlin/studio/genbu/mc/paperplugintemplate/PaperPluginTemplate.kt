package studio.genbu.mc.paperplugintemplate

import org.bukkit.plugin.java.JavaPlugin

class PaperPluginTemplate: JavaPlugin() {

    override fun onLoad() {
        logger.info("PaperPluginTemplate has been loaded.")
    }

    override fun onEnable() {
        logger.info("PaperPluginTemplate has been enabled.")
    }

    override fun onDisable() {
        logger.info("PaperPluginTemplate has been disabled.")
    }

}
